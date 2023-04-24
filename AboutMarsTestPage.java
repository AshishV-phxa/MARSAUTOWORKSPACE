package mars.v10.pages;

import org.openqa.selenium.support.PageFactory;

public class AboutMarsTestPage extends XpathsRepositary {
	
	public AboutMarsTestPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void verifyAboutMars(String VARIABLE) {
		
		//Click on Help
		VARIABLE="Help";
		ElementByTitle.click();
		
		//Click on About Mars
		ElementByText.click();
		
		//Verify server name
		ElementByID.isDisplayed();
		
	}
	
	
}

