package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	WebDriver driver;
	@FindBy(linkText="Find a Gift")
	WebElement FindAGift;
	@FindBy(linkText ="Gift Cards")
	WebElement GiftCar;
	
	
	@FindBy (xpath = "//*[text()='Hello, Sign in']")
	WebElement signinbutton;
	@FindBy(xpath ="//*[text()='Sign in']")//for creating new account
	WebElement signinlink;
	
	public home(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void FindAGiftClick() {
		FindAGift.click();
	}
	public void GiftCarClick() {
		GiftCar.click();
	}
	
	
		
		public WebElement signinbttonclick() {
			return signinbutton;
			
	}
		public WebElement signlink() {
			return signinlink;
		}

}
