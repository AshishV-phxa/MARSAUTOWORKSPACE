package mars.v10.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.Assert;

import com.genericlib.CommonLib;

import Mars10.base.BaseClass;

public class DefaultPage extends XpathsRepositary {
	
	CommonLib clib=PageFactory.initElements(driver, CommonLib.class);
	
	
	@FindBy(xpath = "//*[@class='MARSLogo' or @href='/MARSWeb2/Dashboard']")
	WebElement MarsLogo;

	@FindBy(xpath = "//*[@title='Global Search']")
	WebElement Globalsearch;

	@FindBy(xpath = "//*[@title='Add Activities']")
	WebElement AddActivityIcon;

	@FindBy(xpath = "//*[@title='Add Favorites']")
	WebElement AddFavIcon;

	@FindBy(xpath = "//*[@title='Add Favorites']/following::button[1]")
	WebElement usermenu;

	@FindBy(xpath = "//*[@title='Manage Views']")
	WebElement ManageView;

	@FindBy(xpath = "//*[contains(text(), 'Dashboard For')]")
	WebElement DashboardHeader;

	// Tab in Dashboard
	@FindBy(xpath = "//*[contains(text(), 'Completed Reports')][1]")
	WebElement CompletedReportsTab;

	// Tab in Dashboard
	@FindBy(xpath = "//*[contains(text(), 'Dashboard - Interactive Report')][1]")
	WebElement InteractiveReportTab;

	// Menu Options(Sales)

	@FindBy(xpath = "//*[normalize-space(text())='Firm']//parent::a[@role='button']")
	WebElement Firmmenu;

	@FindBy(xpath = "//*[normalize-space(text())='Rep']//parent::a[@role='button']")
	WebElement RepMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Sales & Assets']//parent::a[@role='button']")
	WebElement SalesAssetsMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Compliance']//parent::a[@role='button']")
	WebElement ComplianceMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Accounts']//parent::a[@role='button']")
	private WebElement AccountsMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Product']//parent::a[@role='button']")
	WebElement ProductMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Tools']//parent::a[@role='button']")
	WebElement ToolsMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Market Share']//parent::a[@role='button']")
	WebElement marketshareMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Analytics']//parent::a[@role='button']")
	WebElement AnalyticsMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Office']//parent::a[@role='button']")
	WebElement OfficeMenu;

	// Firm Menu Options
	@FindBy(xpath = "//*[normalize-space(text())='Firm Profile' and @class='dropdown-item']")
	WebElement FirmProfile;
	
	//Primary Menu Options
	@FindBy(xpath = "//button[contains(@class,'primary dropdown-toggle')]")
	WebElement PrimaryMenubutton;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][@href='/MARSWeb2/Dashboard']")
	WebElement PrimaryMenuDashboard;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][contains(text(),'Notifications')]")
	WebElement PrimaryMenuNotifications;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][contains(text(),'Preferences')]")
	WebElement PrimaryMenuPreferences;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][contains(text(),'About MARS')]")
	WebElement PrimaryMenuAboutMars;
	
	@FindBy(xpath = "//*[@title='Close']")
	WebElement CloseAboutMars;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][contains(text(),'Help')]")
	WebElement PrimaryMenuHelp;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][contains(text(),'Logout ')]")
	WebElement PrimaryMenuLogout;
	
	@FindBy(xpath = "//button[contains(text(),\"Cancel\")]")
	WebElement LogoutCancel;
	
	@FindBy(xpath = "//span[@class='k-select']")
	WebElement MainNavigationDropown;
	
	@FindBy(xpath = "//a[contains(text(),'Administration')]")
	WebElement Administration;
	
	@FindBy(xpath = "//span[@class='k-input'][contains(text(),'Administration')]")
	WebElement AdministrationSelectedValue;
	
	@FindBy(xpath="//a[contains(text(),'MARS')]//following::span[1]")
	WebElement ClickArrow;
	@FindBy(xpath="//*[contains(text(),'Administration')]")
	WebElement ClickAdministration;
	
	@FindBy(xpath="//i[@title='Add Activities']")
	WebElement AddActivities;
	
	@FindBy(xpath="//img[@alt='Add Note']")
	WebElement AddNote;
	
	@FindBy(xpath="//input[contains(@placeholder,'Type here to search')]")
	WebElement SearchText;
	
	@FindBy(xpath="//div[@role=\"tablist\"]//a[contains(text(),'Rep')]")
	WebElement RepSideTab;
	
	@FindBy(xpath="//div[@role=\"tablist\"]//a[contains(text(),'Office')]")
	WebElement OfficeSideTab;
	
	@FindBy(xpath="//div[@role=\"tablist\"]//a[contains(text(),'Firm')]")
	WebElement FirmSideTab;
	
	@FindBy(xpath="//td[@aria-colindex='1']/span")
	WebElement FirstRowResult;
	
	@FindBy(xpath="//h4[contains(text(),' Note For')]")
	WebElement NoteForHeading;
	
	@FindBy(xpath="//iframe[@class='k-iframe']")
	WebElement NoteFrame;
	
	@FindBy(xpath="//div[@class='ProseMirror']")
	WebElement Notes;
	
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement SaveNotes;
	
	@FindBy(xpath="//img[@alt='Send Email']")
	WebElement SendEmail;
	
	@FindBy(xpath="//h3[contains(text(),' Send Email For ')]")
	WebElement EmailHeading;
	
	@FindBy(xpath="//h2[contains(text(),'New Email:')]")
	WebElement NewEmailHeading;
	
	@FindBy(xpath="//li[contains(@class,'active')]/span[contains(text(),'Email')]")
	WebElement EmailTab;
	
	@FindBy(xpath="//label[contains(text(),'From')]")
	WebElement FromLabel;
	
	@FindBy(xpath="//div[@id='toLabel']")
	WebElement ToLabel;
	
	@FindBy(xpath="//label[contains(text(),'Channel')]")
	WebElement ChannelLabel;
	
	@FindBy(xpath="//label[contains(text(),'Status')]")
	WebElement StatusLabel;
	
	@FindBy(xpath="//label[contains(text(),'Subject')]//preceding::input[1]")
	WebElement EmailSubject;
	
	@FindBy(xpath="//div[contains(text(),'Attachments')]")
	WebElement Attachments;
	
	@FindBy(xpath="//div[@class='ProseMirror']")
	WebElement EmailBody;
	
	@FindBy(xpath="//button[contains(text(),'Save ')]")
	WebElement SaveActivity;
	
	@FindBy(xpath="//button[contains(text(),'Send ')]")
	WebElement EmailSend;
		
	@FindBy(xpath="//span[contains(text(),'Email delivery has been scheduled')]")
	WebElement EmailSuccessMessage;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement EmailOkButton;
	
	@FindBy(xpath="//img[@alt='Meeting']")
	WebElement ScheduleMeeting;
	
	@FindBy(xpath="//label[contains(text(),'Description')]//preceding::input[1]")
	WebElement MeetingDescription;
	
	@FindBy(xpath="//label[contains(text(),' Scheduled With')]")
	WebElement ScheduledWith;
	
	@FindBy(xpath="//label[contains(text(),' Start Date & Time')]")
	WebElement DateAndTime;
	
	@FindBy(xpath="//label[contains(text(),' Duration')]")
	WebElement Duration;
	
	@FindBy(xpath="//label[contains(text(),' Notify')]")
	WebElement Notify;
	
	@FindBy(xpath="//label[contains(text(),'Send Invitation ')]")
	WebElement SendInvitation;
	
	@FindBy(xpath="//label[contains(text(),'Type')]//preceding::input[1]")
	WebElement MeetingType;
	
	@FindBy(xpath="//*[contains(text(),'V10')]")
	WebElement V10;
	
	@FindBy(xpath="//span[contains(text(),' Location ')]")
	WebElement MeetingLocation;
	
	@FindBy(xpath="//span[contains(text(),' Recurrence')]")
	WebElement MeetingRecurrence;
	
	@FindBy(xpath="//span[contains(text(),' Recurrence')]/i")
	WebElement RecurrenceArrow;
	
	@FindBy(xpath="//input[@id='rdNone']")
	WebElement RecurrenceNone;
	
	@FindBy(xpath="//span[contains(text(),'Attendees')]")
	WebElement EmailOkBuon;
	
	@FindBy(xpath="//span[contains(text(),'Attendees')]")
	WebElement Attendees;
	
	@FindBy(xpath="//label[contains(text(),'Invite User')]")
	WebElement InviteUser;
	
	@FindBy(xpath="//label[contains(text(),'Invite Rep')]")
	WebElement InviteRep;
	
	@FindBy(xpath="//span[contains(text(),'Notes')]")
	WebElement MeetingNotes;
	
	@FindBy(xpath="//span[contains(text(),' Add Note')]/i")
	WebElement AddNotesArrow;
	
	@FindBy(xpath="//span[contains(text(),'Add Note')]")
	WebElement AddNotes;
	
	@FindBy(xpath="//div[@class='ProseMirror']/p")
	WebElement AddNoteField;
	
	@FindBy(xpath="//span[contains(text(),'Notes History')]")
	WebElement NotesHistory;
	
	@FindBy(xpath="//span[contains(text(),'Notes History')]/i")
	WebElement NoteHistoryArrow;
	
	@FindBy(xpath="//span[contains(text(),'Expenses')]")
	WebElement Expenses;
	
	@FindBy(xpath="//span[contains(text(),'Meeting Expenses')]")
	WebElement MeetingExpenses;
	
	@FindBy(xpath="//span[contains(text(),'Expenses Attribution')]")
	WebElement ExpensesAttribution;
	
	@FindBy(xpath="//img[@alt='Schedule Call']")
	WebElement ScheduleCall;
	
	@FindBy(xpath="//label[contains(text(),'Caller')][contains(@class,'ng-star')]")
	WebElement Caller;
	
	@FindBy(xpath="//label[contains(text(),'Call Date')][contains(@class,'ng-star')]")
	WebElement CallDate;
	
	@FindBy(xpath="//label[contains(text(),'Priority')][contains(@class,'ng-star')]")
	WebElement Priority;
	
	@FindBy(xpath="//label[contains(text(),'Channel')]")
	WebElement Channel;
	
	@FindBy(xpath="//label[contains(text(),'Type')][contains(@class,'ng-star')]")
	WebElement Type;
	
	@FindBy(xpath="//label[contains(text(),'Scheduled By')]")
	WebElement ScheduledBy;
	
	@FindBy(xpath="//span[contains(text(),'Show On Calendar')]")
	WebElement ShowOnCalendar;
	
	@FindBy(xpath="//span[contains(text(),'Show On Calendar')]/i")
	WebElement ShowOnCalendarArrow;
	
	@FindBy(xpath="//label[text()=' Calendar ']")
	WebElement Calendar;
	
	@FindBy(xpath="//label[contains(text(),'Time Zone')][contains(@class,'ng-star')]")
	WebElement TimeZone;
	
	@FindBy(xpath="//*[@class='k-widget k-numerictextbox ng-untouched ng-pristine']")
	WebElement NotifyCall;
	
	@FindBy(xpath="//span[contains(text(),'Notes')]")
	WebElement ScheduledCallNotes;
	
	@FindBy(xpath="//span[contains(text(),'Notes')]/i")
	WebElement ScheduleCallNotesArrow;
	
	@FindBy(xpath="//span[contains(text(),'Notes')]//following::textarea[1]")
	WebElement ScheduledCallNotesField;
	
	@FindBy(xpath="//img[@title='Save']")
	WebElement SaveButton;
	
	@FindBy(xpath="//img[@alt='Log Call']")
	WebElement LogCall;

	@FindBy(xpath="//label[contains(text(),'Call Type')]")
	WebElement CallType;
	
	@FindBy(xpath="//img[@title='Incoming']")
	WebElement IncomingCall;
	
	@FindBy(xpath="//img[@title='Outgoing']")
	WebElement OutgoingCall;
	
	@FindBy(xpath="//label[contains(text(),'Campaign')]")
	WebElement Campaign;
	
	@FindBy(xpath="//label[contains(text(),'Pipeline')]")
	WebElement Pipeline;
	
	@FindBy(xpath="//label[contains(text(),'Product Group')]")
	WebElement ProductGroup;
	
	@FindBy(xpath="//div[contains(text(),'Notes')]")
	WebElement LogCallNotes;
	
	@FindBy(xpath="//div[contains(text(),'Notes')]//following::textarea[1]")
	WebElement LogCallNotesText;
	
	@FindBy(xpath="//span[contains(text(),'Follow Up Call')]")
	WebElement FollowUpCall;
	
	@FindBy(xpath="//span[contains(text(),'Follow Up Call')]/i")
	WebElement FollowUpCallArrow;
	
	@FindBy(xpath="//span[contains(text(),'Follow Up Call')]//following::label[contains(text(),'Caller')]")
	WebElement FollowupCaller;
	
	@FindBy(xpath="//span[contains(text(),'Follow Up Call')]//following::label[contains(text(),'Call Date')]")
	WebElement FollowUpCallDate;
	
	@FindBy(xpath="//span[contains(text(),'Follow Up Call')]//following::label[contains(text(),'Priority')]")
	WebElement FollowUpCallPriority;
	
	@FindBy(xpath="//span[contains(text(),'Follow Up Call')]//following::label[contains(text(),'Campaign')]")
	WebElement FollowUpCallCampaign;
	
	@FindBy(xpath="//span[contains(text(),'Follow Up Call')]//following::label[contains(text(),'Pipeline')]")
	WebElement FollowUpCallPipeline;
	
	@FindBy(xpath="//span[contains(text(),'Follow Up Call')]//following::label[contains(text(),'Product Group')]")
	WebElement FollowUpCallProductGroup;
	
	@FindBy(xpath="//label[contains(text(),'Call Type')]/i")
	WebElement SearchCallType;
	
	@FindBy(xpath="")
	WebElement SculecdkfoCall;
	
	public DefaultPage() {

		PageFactory.initElements(driver, this);
		
		}
	
	String CurrentWindow;

	public void navigatetoFirmlookup() {

		Firmmenu.click();
		Reporter.log("Clicked on Firm menu option");
		FirmProfile.click();
		Reporter.log("Clicked on Firm Profile option in Firm Menu");

	}
	
	public void navigateToGlobalSearch() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(Globalsearch));
		driver.navigate().refresh();
		clib.click(Globalsearch,"Global Icon");
}
	
	public void VerifyPrimaryMenuNavigation() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Access Dashboard from the Primary Menu
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuDashboard.click();
		Reporter.log("Clicked on Dashboard");
		
		//Access Notifications from the Primary Menu
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuNotifications.click();
		Reporter.log("Clicked on Notification");
		
		//Access Preferences from the Primary Menu
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuPreferences.click();
		Reporter.log("Clicked on Preferences");
		
		//Access About MARS from the Primary Menu
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuAboutMars.click();
		Reporter.log("Clicked on About MARS");
		CloseAboutMars.click();
		Reporter.log("Clicked on X mark to close the About MARS");
		
		//Access Help from the Primary Menu
		CurrentWindow = driver.getWindowHandle();
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuHelp.click();
		Reporter.log("Clicked on Help");
		driver.switchTo().window("9i WebHelp");
		Reporter.log("Switched the focus to newy opened tab");
		//Close the newly opened tab
		driver.close();
		//Select the parent tab
		driver.switchTo().window(CurrentWindow);
		
		//Access Logout from the Primary Menu
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuLogout.click();
		Reporter.log("Clicked on Logout");
		
		
	}
	
	public void navigateToAboutMars() {
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuAboutMars.click();
		Reporter.log("Clicked on About MARS");
	}
	
	public void navigateToNotifications() {
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuNotifications.click();
		Reporter.log("Clicked on Notification");
			}
	
	public void navigateToPreferences() {
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuPreferences.click();
		Reporter.log("Clicked on Preferences");
			}
	
	public void navigateToHelp() {
		CurrentWindow = driver.getWindowHandle();
		//System.out.println(CurrentWindow);
		PrimaryMenubutton.click();
		Reporter.log("Clicked on Primary menu Dropdwon");
		PrimaryMenuHelp.click();
		Reporter.log("Clicked on Help");
		//String NewWindow = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		}
		//driver.switchTo().window(NewWindow);
		Reporter.log("Switched the focus to newy opened tab");
		}
	
	public void switchToPrimaryScreen() {
		//Close the newly opened tab
		driver.close();
		//Select the parent tab
		driver.switchTo().window(CurrentWindow);
	}
	
	public void navigateToAdministration() {
		ClickArrow.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ClickAdministration.click();
		WebElement VerifyAdministartion=ClickAdministration;
		String Verification= VerifyAdministartion.getText();
		Assert.assertEquals(Verification,"Administration","Havent Switched to Administartion Window");
		//log.info("Switched to Administration " + Verification);
		//ClickSystem.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//ClickcusRep.click();
		String parent=driver.getWindowHandle();
		driver.switchTo().window(parent);
		 String Verification1 = driver.getTitle();
 		 System.out.println("Switch to window title is :"+Verification1);	}
	
	public void AccessAddNote() {
		AddActivities.click();
		Assert.assertEquals(true, AddNote.isDisplayed());
		AddNote.click();
		Assert.assertEquals(true, SearchText.isDisplayed());
		String Rep = "Jim";
		SearchText.sendKeys(Rep);
		SearchText.sendKeys(Keys.ENTER);
	}
	
	public void AddRepNotes() {
		RepSideTab.click();
		Assert.assertEquals(true, FirstRowResult.isDisplayed());
		FirstRowResult.click();
		//Assert.assertEquals(true, NoteForHeading.isDisplayed());
		driver.switchTo().frame(NoteFrame);
		String Text = "Sample Text";
		Notes.sendKeys(Text);
		 driver.switchTo().parentFrame();
		 SaveNotes.click();
	}
	public void AddOfficeNotes() {
	    OfficeSideTab.click();
		Assert.assertEquals(true, FirstRowResult.isDisplayed());
		FirstRowResult.click();
		//Assert.assertEquals(true, NoteForHeading.isDisplayed());
		driver.switchTo().frame(NoteFrame);
		String Text = "Sample Text";
		Notes.sendKeys(Text);
		 driver.switchTo().parentFrame();
		 SaveNotes.click();
	}
	public void AddFirmNotes() {
		FirmSideTab.click();
		Assert.assertEquals(true, FirstRowResult.isDisplayed());
		FirstRowResult.click();
		//Assert.assertEquals(true, NoteForHeading.isDisplayed());
		driver.switchTo().frame(NoteFrame);
		String Text = "Sample Text";
		Notes.sendKeys(Text);
		 driver.switchTo().parentFrame();
		 SaveNotes.click();
	}
	public void SendEmail() {
		//Click on add activity
		AddActivities.click();
		//Verify and click on send email
		Assert.assertEquals(true, SendEmail.isDisplayed());
		SendEmail.click();
		Assert.assertEquals(true, EmailHeading.isDisplayed());
		Assert.assertEquals(true, SearchText.isDisplayed());
		String Rep = "Jim";
		//enter rep name in search field
		SearchText.sendKeys(Rep);
		SearchText.sendKeys(Keys.ENTER);
		//select the first row from the results
		Assert.assertEquals(true, FirstRowResult.isDisplayed());
		FirstRowResult.click();
		Assert.assertEquals(true, NewEmailHeading .isDisplayed());
		Assert.assertEquals(true, EmailTab.isDisplayed());
		Assert.assertEquals(true, FromLabel.isDisplayed());
		Assert.assertEquals(true, ToLabel.isDisplayed());
		Assert.assertEquals(true, ChannelLabel.isDisplayed());
		Assert.assertEquals(true, StatusLabel.isDisplayed());
		Assert.assertEquals(true, EmailSubject.isDisplayed());
		//EmailSubject.click();
		EmailSubject.sendKeys("Sample Subject");
		//Assert.assertEquals(true, Attachments.isDisplayed());
		driver.switchTo().frame(NoteFrame);
		EmailBody.sendKeys("Sample Email Body");
		driver.switchTo().parentFrame();
		Assert.assertEquals(true, SaveActivity.isDisplayed());
		Assert.assertEquals(true, EmailSend.isDisplayed());
		EmailSend.click();
		Assert.assertEquals(true, EmailSuccessMessage.isDisplayed());
		EmailOkButton.click();
		}
	public void AccessScheduleMeeting() {
				//Click on add activity
				AddActivities.click();
				//Verify and click on send email
				Assert.assertEquals(true, ScheduleMeeting .isDisplayed());
				ScheduleMeeting.click();
				Assert.assertEquals(true, SearchText.isDisplayed());
				String Rep = "Jim";
				//enter rep name in search field
				SearchText.sendKeys(Rep);
				SearchText.sendKeys(Keys.ENTER);
				//select the first row from the results
				Assert.assertEquals(true, FirstRowResult.isDisplayed());
				FirstRowResult.click();
	}
	public void ScheduleMeeting() {
		MeetingDescription.sendKeys("Sample Meeting Schedule");
		Assert.assertEquals(true, ScheduledWith.isDisplayed());
		Assert.assertEquals(true, DateAndTime.isDisplayed());
		Assert.assertEquals(true, Duration.isDisplayed());
		Assert.assertEquals(true, Notify.isDisplayed());
		Assert.assertEquals(true, SendInvitation.isDisplayed());
		Assert.assertEquals(true, ChannelLabel.isDisplayed());
		MeetingType.click();
		MeetingType.sendKeys("V");
		V10.click();
		Assert.assertEquals(true, MeetingLocation.isDisplayed());
		Assert.assertEquals(true, MeetingRecurrence.isDisplayed());
		RecurrenceArrow.click();
		RecurrenceNone.isSelected();
		Attendees.click();
		Assert.assertEquals(true, InviteUser.isDisplayed());
		Assert.assertEquals(true, InviteRep.isDisplayed());
		MeetingNotes.click();
		System.out.println("Navigated to Notes Tab");
		Assert.assertEquals(true, AddNotes.isDisplayed());
		System.out.println("Add Notes is Visible");
		AddNotesArrow.click();
		System.out.println("Add Notes in the field");
		driver.switchTo().frame(NoteFrame);
		AddNoteField .sendKeys("Meeting Sample Notes");
		driver.switchTo().parentFrame();
		Assert.assertEquals(true, NotesHistory.isDisplayed());
		NoteHistoryArrow.click();
		Expenses.click();
		Assert.assertEquals(true, MeetingExpenses .isDisplayed());
		Assert.assertEquals(true, ExpensesAttribution.isDisplayed());
		SaveActivity.click();
		System.out.println("Meeting Scheduled Successfully");	
	}
	public void AccessScheduleCall() {
		//Click on add activity
		AddActivities.click();
		//Verify and click on send email
		Assert.assertEquals(true, LogCall.isDisplayed());
		LogCall.click();
		Assert.assertEquals(true, SearchText.isDisplayed());
		String Rep = "Jim";
		//enter rep name in search field
		SearchText.sendKeys(Rep);
		SearchText.sendKeys(Keys.ENTER);
		//select the first row from the results
		Assert.assertEquals(true, FirstRowResult.isDisplayed());
		FirstRowResult.click();
		
	}
	
	public void ScheduleCall() {
		
		Assert.assertEquals(true, Caller.isDisplayed());
		Assert.assertEquals(true, CallDate.isDisplayed());
		Assert.assertEquals(true, Priority.isDisplayed());
		Assert.assertEquals(true, Channel.isDisplayed());
		Assert.assertEquals(true, Type.isDisplayed());
		Assert.assertEquals(true, ScheduledBy.isDisplayed());
		Assert.assertEquals(true, ShowOnCalendar.isDisplayed());
		//ShowOnCalendarArrow.click();
		Assert.assertEquals(true, Calendar.isDisplayed());
		Assert.assertEquals(true, TimeZone.isDisplayed());
		//Assert.assertEquals(true, NotifyCall.isDisplayed());
		Assert.assertEquals(true, ScheduledCallNotes.isDisplayed());
		ScheduleCallNotesArrow.click();
		ScheduledCallNotesField.sendKeys("Sample Notes");
		Assert.assertEquals(true, MeetingRecurrence.isDisplayed());
		RecurrenceArrow.click();
		RecurrenceNone.isSelected();
		SaveButton.click();
	}
		

	
	public void LogCall() {
		//Click on add activity
		AddActivities.click();
		//Verify and click on send email
		Assert.assertEquals(true, LogCall.isDisplayed());
		LogCall.click();
		Assert.assertEquals(true, SearchText.isDisplayed());
		String Rep = "Jim";
		//enter rep name in search field
		SearchText.sendKeys(Rep);
		SearchText.sendKeys(Keys.ENTER);
		//select the first row from the results
		Assert.assertEquals(true, FirstRowResult.isDisplayed());
		FirstRowResult.click();
		Assert.assertEquals(true, Caller.isDisplayed());
		Assert.assertEquals(true, CallDate.isDisplayed());
		Assert.assertEquals(true, CallType.isDisplayed());
		SearchCallType.click();
		Assert.assertEquals(true, Channel.isDisplayed());
		Assert.assertEquals(true, IncomingCall.isDisplayed());
		Assert.assertEquals(true, OutgoingCall.isDisplayed());
		Assert.assertEquals(true, Campaign.isDisplayed());
		Assert.assertEquals(true, Pipeline.isDisplayed());
		LogCallNotesText.sendKeys("Sample Log Call");
		Assert.assertEquals(true, FollowUpCall.isDisplayed());
		FollowUpCallArrow.click();
		Assert.assertEquals(true, FollowupCaller.isDisplayed());
		Assert.assertEquals(true, FollowUpCallDate.isDisplayed());
		Assert.assertEquals(true, FollowUpCallPriority.isDisplayed());
		Assert.assertEquals(true, FollowUpCallCampaign.isDisplayed());
		Assert.assertEquals(true, FollowUpCallPipeline.isDisplayed());
		Assert.assertEquals(true, FollowUpCallProductGroup.isDisplayed());
		Assert.assertEquals(true, ShowOnCalendar.isDisplayed());
		ShowOnCalendarArrow.click();
		Assert.assertEquals(true, Calendar.isDisplayed());
		Assert.assertEquals(true, TimeZone.isDisplayed());
		Assert.assertEquals(true, NotifyCall.isDisplayed());
		Assert.assertEquals(true, ScheduledCallNotes.isDisplayed());
		RecurrenceArrow.click();
		RecurrenceNone.isSelected();
		SaveButton.click();
	}
	public void closeBrowser() {
		driver.quit();
	}
}
