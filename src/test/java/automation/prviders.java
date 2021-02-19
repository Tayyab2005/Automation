package automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.create;
import Pages.home;
import Pages.sign;
import common.util;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class prviders extends util {
	
  @Test(dataProvider = "datap")
  public void f(String n, String s) throws InterruptedException, IOException {
	  home Hom=new home(driver);
	  sign login=new sign(driver);
	  create Crt=new create(driver);
	  
	  Actions Acts=new Actions(driver);
	  SoftAssert ob=new SoftAssert();    
	 WebElement signinclk= Hom.signinbttonclick();
	 WebElement signpages=Hom.signlink();
	 
	 Acts.moveToElement(signinclk).build().perform();
	 Acts.moveToElement(signpages).click().build().perform();
	 
	 login.useremailclick(n);
	 login.continuebutton();
	 shots();
	 System.out.println(n);
	 login.passwrdchar(s);
	 login.signclick();
	 shots();
	 System.out.println(s);
	 Thread.sleep(5000);
	 
	 Crt.AmazonToClick();
	 Thread.sleep(5000);
	 shots();
  }

  @DataProvider
  public Object[][] datap() {
    return new Object[][] {
      new Object[] { "car@gmail.com", "mechanic" },
      new Object[] { "doll@gmail.com", "dollhouse" },
    };
  }
  
  }
 
  
  


