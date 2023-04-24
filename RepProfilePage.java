package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class RepProfilePage extends BaseClass{
	
	@FindBy(xpath="//a[@id='navbarDropdown'][text()=' Rep ']")
	WebElement RepDropdown;
	@FindBy(xpath="//a[@class=\"dropdown-item\"][text()='Rep Profile']")
	WebElement RepProfile;
	@FindBy(xpath="//table[@class='table']//tr[1]//td[2]")
	WebElement FirstRepProfile;
	@FindBy(xpath="//tabs[@class=\"ng-star-inserted\"]//li/span[text()='Main']")
	WebElement MainTab;
	@FindBy(xpath="//span[text()=' Primary Details ']")
	WebElement PrimaryDetails;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Rep ']")
	WebElement Rep;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Title ']")
	WebElement Title;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Rep Type ']")
	WebElement RepType;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Rep Status ']")
	WebElement RepStatus;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Office ']")
	WebElement Office;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Time Zone ']")
	WebElement TimeZone;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Firm ']")
	WebElement Firm;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Prior Firm ']")
	WebElement PriorFirm;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Email ']")
	WebElement Email;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Rep Phone ']")
	WebElement RepPhone;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Rep Address ']")
	WebElement RepAddress;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Mobile ']")
	WebElement Mobile;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Last Email Date ']")
	WebElement LastEmailDate;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Last Call Date ']")
	WebElement LastCallDate;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Last Meeting Date ']")
	WebElement LastMeetingDate;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Last Contact Date ']")
	WebElement LastContactDate;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Email Code (Overridden) ']")
	WebElement EmailCode;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Call Code (Overridden) ']")
	WebElement CallCode;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Mail Code (Overridden) ']")
	WebElement MailCode;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Last Fullfillment Date ']")
	WebElement LastFullfillmentDate;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Rep Comments) ']")
	WebElement RepComments;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Office Comments ']")
	WebElement OfficeComments;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Firm Comments ']")
	WebElement FirmComments;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Rep Segmentation ']")
	WebElement RepSegmentation;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Personal Info ']")
	WebElement PersonalInfo;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Alternate Name ']")
	WebElement AlternateName;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Origination Code ']")
	WebElement OriginationCode;
	
	// Sales Details
	@FindBy(xpath="//span[text()=' Sales Details ']")
	WebElement SalesDetails;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' YTD Sales ']")
	WebElement YTDSales;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' YTD Redemptions ']")
	WebElement YTDRedemptions;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' YTD Net ']")
	WebElement YTDNet;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Curr Assets ']")
	WebElement CurrAssets;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Curr Avg Assets ']")
	WebElement CurrAvgAssets;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' Prior Year Sales ']")
	WebElement PriorYearSales;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' PY Redemptions ']")
	WebElement PYRedemptions;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' PY Net ']")
	WebElement PYNet;
	@FindBy(xpath="//div[@id='dataSub.DisplayfieldId'][text()=' PY Avg Assets ']")
	WebElement PYAvgAssets;
	
	//Additional Details
	@FindBy(xpath="//span[text()=' Additional Details ']")
	WebElement AdditionalDeatials;	
	@FindBy(xpath="//label[text()='Primary Details']")
	WebElement Additional_PrimaryDetails;
	@FindBy(xpath="//label[text()='Primary Office']")
	WebElement Additional_PrimaryOffice;
	@FindBy(xpath="//label[text()='Additional Office']")
	WebElement AdditionalOffice;
	
	@FindBy(xpath="//label[contains(text(), 'Rep Name')]//preceding::input[1]")
	WebElement RepName;
	
	//Lists
	@FindBy(xpath="//span[text()=' Lists ']")
	WebElement Lists;	
	
	
	
	public RepProfilePage() {

		PageFactory.initElements(driver, this);

	}
	
	public void navigateToRepProfile() {
		//Click on Rep Dropdown
		RepDropdown.click();
		//Select Rep Profile
		RepProfile.click();
		RepName.sendKeys(prop.getProperty("RepName"));
		//Select the 1st rep profile
		//FirstRepProfile.click();
	}
	
	public void RepProfileVerifications() {
		Assert.assertEquals(true, MainTab.isDisplayed() );
		Assert.assertEquals(true, PrimaryDetails.isDisplayed() );
		Assert.assertEquals(true, Rep.isDisplayed() );
	}
}
