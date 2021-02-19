package automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.create;
import Pages.home;
import Pages.sign;
import common.util;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTestAutomation extends util {
	
  @Test 
  public void f() {
	  home ob=new home (driver);
	  ob.FindAGiftClick();
	  ob.GiftCarClick();
  }
  @Test 
  public void createaccnt() throws InterruptedException {
	  home Hom=new home(driver);
	  sign login=new sign(driver);
	  create Crt=new create(driver);
	  
	  Actions Acts=new Actions(driver);
	  
	  SoftAssert ob=new SoftAssert();
	  
	 WebElement signinclk= Hom.signinbttonclick();
	 WebElement signpages=Hom.signlink();
	 
	 Acts.moveToElement(signinclk).build().perform();
	 Acts.moveToElement(signpages).click().build().perform();
	 
	 login.createaccountclick();
	 
	 Crt.firstNameEnter();
	 Crt.emailenter();
	 Crt.passwordenter();
	 Crt.psswrdchckeneter();
	 Thread.sleep(5000);
	 Crt.createclick();
	 WebElement pswrdtext=Crt.psswrdtoverify();
	 boolean result=pswrdtext.isDisplayed();
	 System.out.println(result);
	 String tx=pswrdtext.getText();
	 System.out.println(tx);
	
	 System.out.println("this is before assertion");
	 ob.assertEquals(tx,"Passwords must be atlesat 6 characters");
	 System.out.println("this is after assertion");
	
	  Crt.AmazonToClick();
	  Thread.sleep(6000);
	  ob.assertAll(); ob.assertAll();
  }
 

  

}
