package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class HomePages extends BaseClass 
{
	@FindBy(xpath="//*[@class='MARSLogo']")
	WebElement MarsLogo;
	
	
	// Initializing the Page Objects:
		public HomePages() 
		{
			
			System.out.println("Entered the Home Page");

			PageFactory.initElements(driver, this);
			
		}
		

	//Actions:
			public String validatePageHomeTitle()
			{

				String parent=driver.getWindowHandle();
				 driver.switchTo().window(parent);
				 String Verification = driver.getTitle();
				return Verification;

				
			}
			
			public boolean validateMarsHomeImage()
			{
				System.out.println("Mars Home Logo is displayed");
				
				System.out.println(MarsLogo.getText());
				return MarsLogo.isDisplayed();
				
			}
			
			
}
