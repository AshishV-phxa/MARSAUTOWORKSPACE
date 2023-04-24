package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class HolidaySchedulePage extends BaseClass{
	
	@FindBy(xpath = "//a[contains(text(),'Maintenance')]")
	WebElement Maintenance;

	@FindBy(xpath = "//a[contains(text(),'Holiday Schedule')]")
	WebElement HolidaySchedule;
	
	@FindBy(xpath = "//h2[@id='LegacyTitle'][contains(text(),'Holiday Schedule')]")
	WebElement HolidayScheduleHeading;
	
	@FindBy(xpath = "//th[@title='Holiday Date']")
	WebElement HolidayDateHeading;
	
	@FindBy(xpath = "//th[@title='Holiday Name']")
	WebElement HolidayNameHeading;
	
	@FindBy(xpath = "//input[@aid='btnAddNew']")
	WebElement AddHoliday;
	
	@FindBy(xpath = "//input[@aid='btnDelete']")
	WebElement DeleteHoliday;
	
	@FindBy(xpath = "//span[contains(text(),'Add/Edit Holiday Schedule')]")
	WebElement AddEditHoliday;
	
	@FindBy(xpath = "//input[@id='CalHolidayDate_input']")
	WebElement Date;
	
	@FindBy(xpath = "//input[@id='txtHolidayName']")
	WebElement HolidayName;
	
	@FindBy(xpath = "//input[@id='btnOk']")
	WebElement OkButton;
	
	@FindBy(xpath = "//input[@id='btncancel']")
	WebElement CancelButton;
	
	@FindBy(xpath = "//td[@title=' +HolidayNameIput+ ']")
	WebElement HolidayNameTitle;
	
	@FindBy(xpath = "//span[contains(text(),'Confirmation')]")
	WebElement Confirmation;
	
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	WebElement DeleteConfirmation;

	@FindBy(xpath = "")
	WebElement Saleseaefts;
	
	String DateInput = "10/10/2020";
	String HolidayNameIput = "Public Holiday";
	
	public HolidaySchedulePage() {

		PageFactory.initElements(driver, this);
		
		}
	
	public void AccessHolidaySchedule() {
		Assert.assertEquals(true, Maintenance.isDisplayed());
		Maintenance.click();
		Assert.assertEquals(true, HolidaySchedule.isDisplayed());
		HolidaySchedule .click();
		Assert.assertEquals(true, HolidayScheduleHeading.isDisplayed());
	}
	
	public void CreateAndDeleteHoliday() {
		Assert.assertEquals(true, HolidayDateHeading.isDisplayed());
		Assert.assertEquals(true, HolidayNameHeading.isDisplayed());
		Assert.assertEquals(true, AddHoliday.isDisplayed());
		Assert.assertEquals(true, DeleteHoliday.isDisplayed());
		AddHoliday.click();
		Assert.assertEquals(true, Date .isDisplayed());
		Date.sendKeys(DateInput);
		Assert.assertEquals(true, HolidayName.isDisplayed());
		HolidayName.sendKeys(HolidayNameIput);
		Assert.assertEquals(true, CancelButton.isDisplayed());
		Assert.assertEquals(true, OkButton.isDisplayed());
		OkButton.click();
		Assert.assertEquals(true, HolidayNameTitle.isDisplayed());
		HolidayNameTitle.click();
		DeleteHoliday.click();
		Assert.assertEquals(true, Confirmation .isDisplayed());
		DeleteConfirmation.click();
		Assert.assertEquals(false, HolidayNameTitle.isDisplayed());
		
	}
	
}
