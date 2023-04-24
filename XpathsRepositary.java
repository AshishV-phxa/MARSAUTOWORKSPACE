package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.*;


import com.genericlib.CommonLib;

import Mars10.base.BaseClass;

public class XpathsRepositary extends BaseClass {
	
		
	CommonLib clib=PageFactory.initElements(driver, CommonLib.class);
	
	//@FindBy(xpath = "//*[@title='Help']")
	
	// Common locators in multiple pages
	
	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	WebElement ResetButton;
	 	
	@FindBy(xpath = "//button[contains(text(),'Find')]")
	WebElement FindButton;
	
		
	
	// About Mars

	
		
	@FindBy(xpath = "//*[@title='+ Variable +']")
	WebElement ElementByTitle;
	
	@FindBy(xpath = "//*[contains(text(),' About MARS ')]")
	WebElement ElementByText;
	
	@FindBy(xpath = "//*[@id='lblServerName']")
	WebElement ElementByID;
	
	@FindBy(xpath = "//*[@class='MARSLogo' or @href='/MARSWeb2/Dashboard']")
	WebElement MarsLogo;
	
	// Rep Lookup Screen
	
	@FindBy(xpath = "//h2[contains(text(),'Find Reps')]")
	WebElement FindRepsHeading;
	
	@FindBy(xpath = "//i[contains(text(),'table_view')]")
	WebElement TableViewGrid;
	
	@FindBy(xpath = "//i[contains(text(),'settings')]")
	WebElement Rep_SettingsIcon;
	
	@FindBy(xpath = "//i[contains(text(),'reorder')]")
	WebElement ReOrder;
	
	@FindBy(xpath = "//label[contains(text(),'My Reps Only')]")
	WebElement MyReps;
	 	

}
