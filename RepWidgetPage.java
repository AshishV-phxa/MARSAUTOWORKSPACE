package mars.v10.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.log4j.Logger;

import Mars10.base.BaseClass;

public class RepWidgetPage extends BaseClass
{
	DateFormat dt = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	DateFormat D = new SimpleDateFormat("ddMMyyyy");
	Date d = new Date();
	String Time = dt.format(d);
	String Date = D.format(d);
	Logger log = Logger.getLogger(RepWidgetPage.class);
	JavascriptExecutor je = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//a[contains(text(),'MARS')]//following::span[@class='k-select']")
	WebElement ClickArrow;
	@FindBy(xpath="//*[contains(text(),'Administration')]")
	WebElement ClickAdministration;
	@FindBy(xpath="//*[normalize-space(text())='Sales']")
	WebElement ClickSales;
	@FindBy(xpath="//a[contains(text(),'System') and @id='navbarDropdown']")
	WebElement ClickSystem;
	@FindBy(xpath="//*[normalize-space(text())='Customize Rep Profile']")
	WebElement ClickcusRep;
	@FindBy(xpath="//*[normalize-space(text())='New Tab']")
	WebElement ClickNewTab;
	@FindBy(xpath="//*[@title='Save Tab']")
	WebElement SaveTab;
	@FindBy(xpath="//input[@id=\"undefined\"]")
	WebElement ClickName;
	@FindBy(xpath="//input[@id=\"undefined\"]/following::select[1]")
	WebElement SelectClick;
	@FindBy(xpath="//option[@value='U~MARSAUTO']")
	WebElement SelectAuto;
	@FindBy(xpath="//*[normalize-space(text())='Save']")
	WebElement Save;
	@FindBy(xpath="//*[normalize-space(text())='Automation']")
	WebElement Automation;
	@FindBy(xpath="//*[normalize-space(text())='Activities']//following::div[1]")
	WebElement NewWidget;
	@FindBy(xpath="//*[normalize-space(text())='Teams']//following::div[1]")
	WebElement TeamsNewWidget;
	@FindBy(xpath="//h4[normalize-space(text())='Profile Customization Studio']")
	WebElement ProfileCustomizationstudio;
	@FindBy(xpath="//*[normalize-space(text())='Activities']/following::div[contains(text(),'Displays the scheduled activities for this rep.')]")
	WebElement Activities;
	@FindBy(xpath="//span[contains(text(),'Activities')]")
	WebElement VerActivities;
	@FindBy(xpath="//div[normalize-space(text())='History']/following::div[contains(text(),\"Displays records of the rep's notes, completed activities,and cancelled activities\")]")
	WebElement History;
	@FindBy(xpath="//span[contains(text(),'Activities')]//following::span[normalize-space(text())='History']")
	WebElement VerHistory;
	@FindBy(xpath="//*[normalize-space(text())='Warning/Stop History']/following::div[contains(text(),'Displays records of the warnings and stops that have been issued for the selected rep.')]")
	WebElement WarningStopHistory;
	@FindBy(xpath="//span[contains(text(),'Activities')]//following::span[normalize-space(text())='Warning/Stop History']")
	WebElement VerWarningStopHistory;
	@FindBy(xpath="//div[normalize-space(text())='Profiling']/following::div[contains(text(),'Displays the list of Profiling Templates associated with this rep')]")
	WebElement Profiling;
	@FindBy(xpath="//span[contains(text(),'Activities')]//following::span[normalize-space(text())='Profiling']")
	WebElement VerProfiling;
	@FindBy(xpath="//*[normalize-space(text())='Team']/following::div[contains(text(),'Rep/Staff Profile - Team')][1]")
	WebElement Team;
	@FindBy(xpath="//span[contains(text(),'Teams')]//following::span[normalize-space(text())='Team']")
	WebElement VerTeam;
	@FindBy(xpath="//*[normalize-space(text())='Team']/following::div[contains(text(),'Rep/Staff Profile - Team Groups')][1]")
	WebElement TeamGroups;
	@FindBy(xpath="//span[contains(text(),'Teams')]//following::span[normalize-space(text())='Team Groups']")
	WebElement VerTeamGroups;
	@FindBy(xpath="//*[normalize-space(text())='Team']/following::div[contains(text(),'Rep/Staff Profile - Team History')][1]")
	WebElement TeamHistory;
	@FindBy(xpath="//span[contains(text(),'Teams')]//following::span[normalize-space(text())='Team History']")
	WebElement VerTeamHistory;
	@FindBy(xpath="//*[normalize-space(text())='Main']//following::div[1]")
	WebElement MainNewWidget;
	@FindBy(xpath="//*[normalize-space(text())='Rep Details']//following::div[contains(text(),'Displays important information about an individual contact at a firm your company does business with')][1]")
	WebElement RepDetails;
	@FindBy(xpath="//*[normalize-space(text())='Update Display Fields']")
	WebElement RepUpdateDisplayFields;
	
	//Adding Sales & Asset Rep Widget
	@FindBy(xpath="//*[normalize-space(text())='Sales & Assets']//following::div[1]")
	WebElement SalesAssetNewWidget;
	@FindBy(xpath="//*[normalize-space(text())='Sales']/following::div[contains(text(),'Rep/Staff Profile - Sales')]")
	WebElement Sales;
	@FindBy(xpath="//span[contains(text(),'Sales & Assets')]//following::span[normalize-space(text())='Sales']")
	WebElement VerSales;
	@FindBy(xpath="//*[normalize-space(text())='Sales Snapshot']//following::div[contains(text(),'Displays a summary of the ')]")
	WebElement SalesSnapshot;
	@FindBy(xpath="//span[contains(text(),'Sales & Assets')]//following::span[normalize-space(text())='Sales Snapshot']")
	WebElement VerSalesSnapshot;
	@FindBy(xpath="//*[normalize-space(text())='Sales/Assets Trend Summary']//following::div[contains(text(),'Displays monthly breakdown of the ')]")
	WebElement SalesAssetsTrendSummary;
	@FindBy(xpath="//span[contains(text(),'Sales & Assets')]//following::span[normalize-space(text())='Sales/Assets Trend Summary']")
	WebElement VerSalesAssetsTrendSummary;
	
	
	//Adding CalendarHeatMap Widget
	@FindBy(xpath="//*[normalize-space(text())='Calendar Heat Map']//following::div[1]")
	WebElement CalendarHeatMapNewWidget;
	@FindBy(xpath="//*[normalize-space(text())='Calendar Heat Map']/following::div[contains(text(),'Displays Rep Activities In Calendar View')]")
	WebElement CalendarHeatMap;
	@FindBy(xpath="//span[contains(text(),'Calendar Heat Map')]//following::span[normalize-space(text())='Calendar Heat Map']")
	WebElement VerCalendarHeatMap;
	@FindBy(xpath="//*[normalize-space(text())='12 Month Activity']/following::div[contains(text(),'Displays 12 Months Rep Activities In Calendar View')]")
	WebElement TwelveMonthActivity;
	@FindBy(xpath="//span[contains(text(),'Calendar Heat Map')]//following::span[normalize-space(text())='12 Month Activity']")
	WebElement VerTwelveMonthActivity;
	
	//Adding Timeline Widget
	@FindBy(xpath="//*[normalize-space(text())='Timeline']//following::div[1]")
	WebElement TimelineNewWidget;
	@FindBy(xpath="//*[normalize-space(text())='Timeline']/following::div[contains(text(),'Displays Reps activities in Timeline view')]")
	WebElement Timeline;
	@FindBy(xpath="//span[contains(text(),'Timeline')]//following::span[normalize-space(text())='Timeline']")
	WebElement VerTimeline;
	
	//RepDisplayfields***
	@FindBy(xpath="//*[normalize-space(text())='Rep Full Name']//preceding::input[1]")
	WebElement RepFullName;
	@FindBy(xpath="//*[normalize-space(text())='Rep Type']/preceding::input[1]")
	WebElement RepType;
	@FindBy(xpath="//*[normalize-space(text())='Title']/preceding::input[1]")
	WebElement Title;
	@FindBy(xpath="//*[normalize-space(text())='Rep Status']/preceding::input[1]")
	WebElement RepStatus;
	@FindBy(xpath="//*[normalize-space(text())='Firm']/preceding::input[1]")
	WebElement Firm;
	@FindBy(xpath="//*[normalize-space(text())='Office']/preceding::input[1]")
	WebElement Office;
	@FindBy(xpath="//*[normalize-space(text())='Email']/preceding::input[1]")
	WebElement Email;
	@FindBy(xpath="//*[normalize-space(text())='Rep Phone']/preceding::input[1]")
	WebElement RepPhone;
	@FindBy(xpath="//*[normalize-space(text())='Rep Address']/preceding::input[1]")
	WebElement RepAddress;
	@FindBy(xpath="//*[normalize-space(text())='Rep Comments']/preceding::input[1]")
	WebElement RepComments;
	@FindBy(xpath="//*[normalize-space(text())='Office Comments']/preceding::input[1]")
	WebElement OfficeComments;
	@FindBy(xpath="//*[normalize-space(text())='Firm Comments']/preceding::input[1]")
	WebElement FirmComments;
	@FindBy(xpath="//*[normalize-space(text())='Personal Info']/preceding::input[1]")
	WebElement PersonalInfo;
	@FindBy(xpath="//*[normalize-space(text())='Alternate Name']/preceding::input[1]")
	WebElement AlternateName;
	@FindBy(xpath="//*[normalize-space(text())='Birthday(MM/DD/YYYY)']/preceding::input[1]")
	WebElement Birthday;
	@FindBy(xpath="//*[normalize-space(text())='Rep CRD']/preceding::input[1]")
	WebElement RepCRD;
	@FindBy(xpath="//*[normalize-space(text())='Office ID']/preceding::input[1]")
	WebElement OfficeID;
	@FindBy(xpath="//*[normalize-space(text())='Firm ID']/preceding::input[1]")
	WebElement FirmID;
	@FindBy(xpath="//*[normalize-space(text())='Rep ID']/preceding::input[1]")
	WebElement RepID;
	@FindBy(xpath="//*[normalize-space(text())='Prefix']/preceding::input[1]")
	WebElement Prefix;
	@FindBy(xpath="//*[normalize-space(text())='First Name']/preceding::input[1]")
	WebElement FirstName;
	@FindBy(xpath="//*[normalize-space(text())='Middle Name']/preceding::input[1]")
	WebElement MiddleName;
	@FindBy(xpath="//*[normalize-space(text())='Last Name']/preceding::input[1]")
	WebElement LastName;
	@FindBy(xpath="//*[normalize-space(text())='Rep Firm Type']/preceding::input[1]")
	WebElement RepFirmType;
	@FindBy(xpath="//*[normalize-space(text())='Fax']/preceding::input[1]")
	WebElement Fax;
	@FindBy(xpath="//*[normalize-space(text())='Website']/preceding::input[1]")
	WebElement Website;
	@FindBy(xpath="//*[normalize-space(text())='Firm Source ID']/preceding::input[1]")
	WebElement FirmSourceID;
	@FindBy(xpath="//*[normalize-space(text())='Rep Nick Name']/preceding::input[1]")
	WebElement RepNickName;
	@FindBy(xpath="//*[normalize-space(text())='Email Id 2']/preceding::input[1]")
	WebElement EmailId2;
	@FindBy(xpath="//*[normalize-space(text())='Mobile']/preceding::input[1]")
	WebElement Mobile;
	@FindBy(xpath="//*[normalize-space(text())='Rep Source ID']/preceding::input[1]")
	WebElement RepSourceID;
	@FindBy(xpath="//*[normalize-space(text())='# of Years as Broker']/preceding::input[1]")
	WebElement Broker;
	@FindBy(xpath="//*[normalize-space(text())='Total AUM (Self Reported)']/preceding::input[1]")
	WebElement Aum;
	@FindBy(xpath="//*[normalize-space(text())='Spouse']/preceding::input[1]")
	WebElement Spouse;
	@FindBy(xpath="//*[normalize-space(text())='Assistant']/preceding::input[1]")
	WebElement Assistant;
	@FindBy(xpath="//*[normalize-space(text())='Prior Firm']/preceding::input[1]")
	WebElement PriorFirm;
	@FindBy(xpath="//*[normalize-space(text())='(RC) UDF1']/preceding::input[1]")
	WebElement UDF1;
	
	
	@FindBy(xpath="//*[@id='btnOk']")
	WebElement Ok;
	@FindBy(xpath="//*[contains(text(),' Customize Rep Profile for')]")
	WebElement VerCustomizeRepProfilefor;
	@FindBy(xpath="//*[normalize-space(text())='Lists']/following::div[contains(text(),'Displays the group lists that the rep is a member')][1]")
	WebElement AddLists;
	@FindBy(xpath="//span[contains(text(),'Main')]//following::span[normalize-space(text())='Lists']")
	WebElement VerLists;
	@FindBy(xpath="//*[normalize-space(text())='Aliases']/following::div[contains(text(),'Display and maintain the rep')]")
	WebElement AddAliases;
	@FindBy(xpath="//span[contains(text(),'Main')]//following::span[normalize-space(text())='Aliases']")
	WebElement VerAliases;
	@FindBy(xpath="//*[normalize-space(text())='Territories']/following::div[contains(text(),'Displays the rep')]")
	WebElement Territories;
	@FindBy(xpath="//span[contains(text(),'Main')]//following::span[normalize-space(text())='Territories']")
	WebElement VerTerritories;
	@FindBy(xpath="//*[normalize-space(text())='Documents']/following::div[contains(text(),'Displays the list of Documents associated with this rep.')]")
	WebElement Documents;
	@FindBy(xpath="//span[contains(text(),'Main')]//following::span[normalize-space(text())='Documents']")
	WebElement VerDocuments;
	@FindBy(xpath="//*[normalize-space(text())='Social Links']/following::div[contains(text(),'Displays Rep Social Links')]")
	WebElement SocialLinks;
	@FindBy(xpath="//span[contains(text(),'Main')]//following::span[normalize-space(text())='Social Links']")
	WebElement VerSocialLinks;
	
	@FindBy(xpath="//*[normalize-space(text())='Sales/Assets Trend Detail']/following::div[contains(text(),'Displays the Visualization Dashboard for Product Sales')]")
	WebElement SalesAssetsTrendDetail;
	
	
	
	public RepWidgetPage() {

		PageFactory.initElements(driver, this);

	}
	public void Administartion()
	{
		ClickArrow.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ClickAdministration.click();
		WebElement VerifyAdministartion=ClickAdministration;
		String Verification= VerifyAdministartion.getText();
		Assert.assertEquals(Verification,"Administration","Havent Switched to Administartion Window");
		log.info("Switched to Administration " + Verification);
		ClickSystem.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ClickcusRep.click();
		String parent=driver.getWindowHandle();
		driver.switchTo().window(parent);
		 String Verification1 = driver.getTitle();
 		 System.out.println("Switch to window title is :"+Verification1);
	}
	
	public void AddingNewTabs() 
	{
		ClickNewTab.click();
 		WebElement VerifySaveTab=SaveTab;
 		String VerifySaveTabwindow = VerifySaveTab.getText();
 		//Assert.assertEquals(VerifySaveTabwindow,"Save Tab","Verification of SaveTab Window");
 		System.out.println("SaveTab Window :" +VerifySaveTabwindow);
 		ClickName.sendKeys("Activities");
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		//SelectClick.click();
 		//SelectAuto.click();
 		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		//je.executeScript("arguments[0].scrollIntoView(true);",SelectAuto);
 		//SelectAuto.click();
 		Save.click();
 		Assert.assertEquals(true, VerActivities.isDisplayed() );
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		// Adding MainTab
 		ClickNewTab.click();
 		ClickName.sendKeys("Main");
 		Save.click();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		// Adding Sales & Assets Tab
 		ClickNewTab.click();
 		ClickName.sendKeys("Sales & Assets");
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		Save.click();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		// Adding Teams Tab
 		ClickNewTab.click();
 		ClickName.sendKeys("Teams");
 		Save.click();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		//Adding Calendar Heat Map Tab
 		ClickNewTab.click();
 		ClickName.sendKeys("Calendar Heat Map");
 		Save.click();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		//Adding Timeline
 		ClickNewTab.click();
 		ClickName.sendKeys("Timeline");
 		Save.click();
	}   
	
	public void AddingRepWidgets()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		NewWidget.click();
		/*WebElement VerifyProfileCustomizationstudio=ProfileCustomizationstudio;
		String Verification = VerifyProfileCustomizationstudio.getText();
		System.out.println("Should be a Widgetwindow:" + Verification);
		Assert.assertEquals(Verification,"Profile Customization Studio"); */
 		// Adding Activities Widget
 		Activities.click();
 		Assert.assertEquals(true,VerActivities.isDisplayed());
 		NewWidget.click();
		//Adding History Widget
 		History.click();
 		Assert.assertEquals(true,VerHistory.isDisplayed());
 		NewWidget.click();
 		//Adding WarningStopHistory Widget
 		WarningStopHistory.click();
 		Assert.assertEquals(true,VerWarningStopHistory.isDisplayed());
 		NewWidget.click();
 		//Adding Profiling Widget
 		Profiling.click();
 		Assert.assertEquals(true,VerProfiling.isDisplayed());
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		TeamsNewWidget.click();
 		///Assert.assertEquals(true,ProfileCustomizationstudio.isDisplayed());
 		//Adding of Teams
 		Team.click();
 		Assert.assertEquals(true,VerTeam.isDisplayed());
 		TeamsNewWidget.click();
 		//Adding of TeamGroups
 		TeamGroups.click();
 		Assert.assertEquals(true,VerTeamGroups.isDisplayed());
 		TeamsNewWidget.click();
 		//Adding of TeamHistory
 		TeamHistory.click();
 		Assert.assertEquals(true,VerTeamHistory.isDisplayed());
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		MainNewWidget.click();
 		//Adding of RepDetails
 		RepDetails.click();
 		//Assert.assertEquals(true,RepUpdateDisplayFields.isDisplayed());
 		RepFullName.click();
 		RepType.click();
 		Title.click();
 		RepStatus.click();
 		Firm.click();
 		Office.click();
 		Email.click();
 		RepPhone.click();
 		RepAddress.click();
 		RepComments.click();
 		OfficeComments.click();
 		FirmComments.click();
 		PersonalInfo.click();
 		AlternateName.click();
 		Birthday.click();
 		RepCRD.click();
 		OfficeID.click();
 		FirmID.click();
 		RepID.click();
 		RepFullName.click();
 		FirstName.click();
 		MiddleName.click();
 		LastName.click();
 		Fax.click();
 		Website.click();
 		FirmSourceID.click();
 		RepNickName.click();
 		EmailId2.click();
 		Mobile.click();
 		RepSourceID.click();
 		Broker.click();
 		Aum.click();
 		Spouse.click();
 		Assistant.click();
 		PriorFirm.click();
 		UDF1.click();
 		RepFirmType.click();
 		Ok.click();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		MainNewWidget.click();
 		//Adding of Aliases
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		AddAliases.click();
 		Assert.assertEquals(true,VerAliases.isDisplayed());
 		MainNewWidget.click();
 		//Adding of Territories
 		Territories.click();
 		Assert.assertEquals(true,VerTerritories.isDisplayed());
 		MainNewWidget.click();
 		//Adding of Documents
 		Documents.click();
 		Assert.assertEquals(true,VerDocuments.isDisplayed());
 		MainNewWidget.click();
 		//Adding of Social Links
 		SocialLinks.click();
 		Assert.assertEquals(true,VerSocialLinks.isDisplayed());
 		MainNewWidget.click();
 		//Adding of List
 		AddLists.click();
 		Assert.assertEquals(true,VerLists.isDisplayed());
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		CalendarHeatMapNewWidget.click();
 		//Adding of CalendarHeatMap
 		CalendarHeatMap.click();
 		Assert.assertEquals(true,VerCalendarHeatMap.isDisplayed());
 		CalendarHeatMapNewWidget.click();
 		//Adding of 12months Activity
 		TwelveMonthActivity.click();
 		Assert.assertEquals(true,VerTwelveMonthActivity.isDisplayed());
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		TimelineNewWidget.click();
 		//Adding of Timeline
 		Timeline.click();
 		Assert.assertEquals(true,VerTimeline.isDisplayed());	
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		SalesAssetNewWidget.click();
 		//Adding of Sales
 		Sales.click();
 		Assert.assertEquals(true,VerSales.isDisplayed());
 		SalesAssetNewWidget.click();
 		//Adding of Salessnapshot
 		SalesSnapshot.click();
 		Assert.assertEquals(true,VerSalesSnapshot.isDisplayed());
 		SalesAssetNewWidget.click();
 		//Adding of Sales/AssetsTrendSummary
 		SalesAssetsTrendSummary.click();
 		Assert.assertEquals(true,VerSalesAssetsTrendSummary.isDisplayed());
 		//End of Adding Rep Details
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		ClickArrow.click();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ClickSales.click();
		
 		
	}
	
}
