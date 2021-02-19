package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create {
public WebDriver driver;
@FindBy (name="customerName")
WebElement firstname;
@FindBy (name="email")
WebElement usermail;
@FindBy (name="password")
WebElement psswrd;
@FindBy (name="passwordCheck")
WebElement pswrdcheck;
@FindBy (id="continue")
WebElement createaccount;
@FindBy (xpath=" ( //*[contains(text(),' Passwords must be at least 6 ')])[2]")
WebElement pswrdtodisplay;

@FindBy(xpath ="//i[@aria-label='Amazon']")
WebElement Amazon;

public create(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void firstNameEnter() {
	firstname.sendKeys("aaaa");
		
}
public void emailenter() {
	usermail.sendKeys("abc@gmail.com");

}
public void passwordenter() {
	psswrd.sendKeys("22222");
}
public void psswrdchckeneter() {
	pswrdcheck.sendKeys("22222");
}
public void createclick() {
	createaccount.click();
}
public WebElement psswrdtoverify() {
	return pswrdtodisplay;
}
public void AmazonToClick() {
	Amazon.click();
}
}
