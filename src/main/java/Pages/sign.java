package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign {
	public WebDriver driver;
	@FindBy(linkText="Create your Amazon account")
	WebElement createaccount;
	
	@FindBy (name="email")
	WebElement useremail;
	@FindBy (id="continue")
	WebElement cntnue;
	@FindBy (name="password")
	WebElement pswrd;
	@FindBy (id="signInSubmit")
	WebElement sign;
	
	
	
	public sign(WebDriver driver) {
		this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	public void createaccountclick() {
		createaccount.click();
	}
	public void useremailclick(String user) {
		useremail.sendKeys(user);
	}
	public void continuebutton () {
		cntnue.click();
	}
	public void passwrdchar(String word) {
		pswrd.sendKeys(word);
	}
	public void signclick() {
		sign.click();
	}
	

}
