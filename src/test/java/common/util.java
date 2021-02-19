package common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class util {
public	WebDriver driver;
	@BeforeClass
@Parameters("browser")
	 public void browsers(String browser) {
		  if(browser.equalsIgnoreCase("Chrome")) {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\aaqda\\eclipse-workspace\\Home\\src\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			
				driver.get("https://www.amazon.com");
				driver.manage().window().maximize();  
			  
		  }else if (browser.equalsIgnoreCase("Firefox")) {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\aaqda\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			  driver=new FirefoxDriver();
			  driver.get("https://www.amazon.com");
				driver.manage().window().maximize();  
			  
		  }else {
			  System.out.println("correct browser name");
		  }
	}

	
	
		   
		 
	
	
	 public void shots() throws IOException {
		  Date dt=new Date();
		  System.out.println(dt);
		  String sc=dt.toString().replace(" ","_" ).replace(":", "_");
		  File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(shot, new File("C:\\Users\\aaqda\\eclipse-workspace\\AutomationFrameworkStructure\\src\\test\\"+sc+"picture.png"));
	  }
		 
		 
		  
	

		  @AfterClass
	private void Afterclass() throws IOException {
		shots();
		
		// TODO Auto-generated method stub
		
	}
}
