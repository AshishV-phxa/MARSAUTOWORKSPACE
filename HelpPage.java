package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Mars10.base.BaseClass;

public class HelpPage extends BaseClass{
	
	@FindBy(xpath = "//a[@title='Contents']")
	WebElement Contents;
	
	@FindBy(xpath = "//a[@title='Index']")
	WebElement Index;
	
	@FindBy(xpath = "//a[@title='Search']")
	WebElement Search;
	
	@FindBy(xpath = "//a[@title='Glossary']")
	WebElement Glossary;
	
	public HelpPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void verifyHelpLinks() {
		
		driver.switchTo().frame("toolbar");
		//Verify the visibility of Contents link
		  Assert.assertEquals(true, Contents.isDisplayed() );
		//Verify the visibility of Index Link
		  Assert.assertEquals(true,Index.isDisplayed() );
		//Verify the visibility of Search Link
		  Assert.assertEquals(true, Search.isDisplayed() );
		//Verify the visibility of Glossary Link
		  Assert.assertEquals(true, Glossary.isDisplayed() );	
		  driver.switchTo().parentFrame();
	}
}
