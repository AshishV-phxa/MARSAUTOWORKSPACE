package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class NotificationsPage extends BaseClass {
	
	@FindBy(xpath = "//h2[@id='LegacyTitle']")
	WebElement LegacyTitle;
	
	@FindBy(xpath = "//th[@title='Notification Type']")
	WebElement NotificationType;
	
	@FindBy(xpath = "//th[@title='Email']")
	WebElement Email;
	
	@FindBy(xpath = "//th[@title='MARS Messenger']")
	WebElement MARSMessenger;
	
	@FindBy(xpath = "//td[@title='Error']")
	WebElement Error;
	
	@FindBy(xpath = "//td[@title='High Priority']")
	WebElement HighPriority;
	
	@FindBy(xpath = "//td[@title='Partial']")
	WebElement Partial;
	
	@FindBy(xpath = "//td[@title='Success']")
	WebElement Success;
	
	@FindBy(xpath = "//span[@id='btnSave']")
	WebElement Save;
	
	public NotificationsPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void verifyNotificationFields() {
		
		//Verify the Notifications Heading
		Assert.assertEquals(LegacyTitle.getText(),"Notifications");
		//Select the Frame
		driver.switchTo().frame("legacyIframe");
		
		//Verify the visibility of Notification Type
		  Assert.assertEquals(true, NotificationType.isDisplayed() );
		//Verify the visibility of Email
		  Assert.assertEquals(true,Email.isDisplayed() );
		//Verify the visibility of MARS Messenger
		  Assert.assertEquals(true, MARSMessenger.isDisplayed() );
		//Verify the visibility of Error
		  Assert.assertEquals(true, Error.isDisplayed() );
		//Verify the visibility of HighPriority
		  Assert.assertEquals(true, HighPriority.isDisplayed() );
		//Verify the visibility of Partial
		  Assert.assertEquals(true, Partial.isDisplayed() );
		//Verify the visibility of Success
		  Assert.assertEquals(true, Success.isDisplayed() );
		//Get out of the frame
		  driver.switchTo().parentFrame();
		//Verify the visibility of Save link
		  //Assert.assertEquals(true, Save.isDisplayed() );
		
	}
}
