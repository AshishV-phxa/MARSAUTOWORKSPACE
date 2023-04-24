package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class PreferencesPage extends BaseClass {
	
	@FindBy(xpath = "//h2[contains(text(),'User Preferences')]")
	WebElement UserPreference;
	
	@FindBy(xpath = "//div[contains(text(),'Display')]")
	WebElement DisplayHeading;
	
	@FindBy(xpath = "//div[@class='form-group row']/div[contains(text(),'Font')]")
	WebElement Font;
	
	@FindBy(xpath = "//div[@class='form-group row']/div[contains(text(),'Theme')]")
	WebElement Theme;
	
	@FindBy(xpath = "//div[@class='form-group row']/div[contains(text(),'Display')]")
	WebElement Display;
	
	@FindBy(xpath = "//span[contains(text(),'Rep Banner')]")
	WebElement RepBanner;
	
	@FindBy(xpath = "//span[contains(text(),'Firm Banner')]")
	WebElement FirmBanner;
	
	
	
	
	public PreferencesPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void verifyPreferencesFields() {
		//Verify the visibility of UserPreference Heading
		  Assert.assertEquals(true, UserPreference.isDisplayed() );
		//Verify the visibility of DisplayHeading
		  Assert.assertEquals(true,DisplayHeading.isDisplayed() );
		//Verify the visibility of Font
		  Assert.assertEquals(true, Font.isDisplayed() );
		//Verify the visibility of Theme
		  Assert.assertEquals(true, Theme.isDisplayed() );
		//Verify the visibility of Display Drop-down
		  Assert.assertEquals(true, Display.isDisplayed() );
		//Verify the visibility of RepBanner
		  Assert.assertEquals(true, RepBanner.isDisplayed() );
		//Verify the visibility of FirmBanner
		  Assert.assertEquals(true, FirmBanner.isDisplayed() );
		
	}
}
