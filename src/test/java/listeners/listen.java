package listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import common.util;

public class listen extends util implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("test is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
       System.out.println("passed");
       this.driver=((util)result.getInstance()).driver;
       Date dt=new Date();
		  System.out.println(dt);
		  String sc=dt.toString().replace(" ","_" ).replace(":", "_");
		  File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(shot, new File("C:\\Users\\aaqda\\eclipse-workspace\\AutomationFrameworkStructure\\src\\test\\passed\\"+sc+"picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("failed");
		 this.driver=((util)result.getInstance()).driver;
		Date dt=new Date();
		  System.out.println(dt);
		  String sc=dt.toString().replace(" ","_" ).replace(":", "_");
		  File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(shot, new File("C:\\Users\\aaqda\\eclipse-workspace\\AutomationFrameworkStructure\\src\\test\\failed\\"+sc+"picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("skipped");
		 
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
		 
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		 
	}
	

}
