package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mars10.base.BaseClass;

public class LoginPage extends BaseClass {

	// OR: LOGIN
	 @FindBy(xpath = "//input[@class='k-input' and @placeholder='UserId']")
	WebElement username;

	@FindBy(xpath = "//input[@class='k-input' and @type='password']")
	WebElement password;

	@FindBy(xpath = "//*[@id='btnLogin'][2]")
	WebElement Loginbutton;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void clearusrname() {
		username.clear();
	}
	public void enterunsername(String un) {
		username.sendKeys(un);

	}

	public void clearpwd() {
		password.clear();
		
	}
		
		
	public void enterpassword(String pw) {

		password.sendKeys(pw);
	}

	public void clicklogin() {

		Loginbutton.click();
		
	
		

	}
}
