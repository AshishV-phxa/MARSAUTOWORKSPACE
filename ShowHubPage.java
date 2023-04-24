package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class ShowHubPage extends BaseClass {
	
	@FindBy(xpath="//hub-gadget/a/img[@class='hubimage']")
	WebElement ShowHub;
	@FindBy(xpath="//span[contains(text(),'Today')]")
	WebElement Today;
	@FindBy(xpath="//span[contains(text(),'Pending Tasks')]")
	WebElement  PendingTasks;
	@FindBy(xpath="//span[contains(text(),'Scheduled Calls')]")
	WebElement ScheduledCalls;
	@FindBy(xpath="//span[contains(text(),'Scheduled Meetings')]")
	WebElement ScheduledMeetings;
	@FindBy(xpath="//span[contains(text(),'Completed Activities')]")
	WebElement CompletedActivities;
	@FindBy(xpath="//span[contains(text(),'Completed Reports')]")
	WebElement CompletedReports;
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement Calendar;
	@FindBy(xpath="//li[@class=\"ng-star-inserted active\"]//span[contains(text(),'Calendar')]")
	WebElement ActivedCalendar;
	@FindBy(xpath="//span[contains(text(),'Notifications')]")
	WebElement Notifications;
	@FindBy(xpath="//li[@class=\"ng-star-inserted active\"]//span[contains(text(),'Notifications')]")
	WebElement ActivedNotifications;
	@FindBy(xpath="//span[contains(text(),'Active Today')]")
	WebElement ActiveToday;
	@FindBy(xpath="//span[contains(text(),'Dismissed Today')]")
	WebElement DismissedToday;
	@FindBy(xpath="//span[contains(text(),'Gadgets')]")
	WebElement Gadgets;
	@FindBy(xpath="//li[@class='ng-star-inserted active']//span[contains(text(),'Gadgets')]")
	WebElement ActivedGadgets;
	@FindBy(xpath="//i[@title='Manage Hub']")
	WebElement ManageHub;
	@FindBy(xpath="//h4[@title='Manage Hub']")
	WebElement ManageHubHeading;
	
	

	public ShowHubPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void AccessShowHub(){
		Assert.assertEquals(true, ShowHub.isDisplayed());
		ShowHub.click();
	}
	
	public void AccessAndVerifyToday() {
		Assert.assertEquals(true, Today.isDisplayed());
		Assert.assertEquals(true, PendingTasks.isDisplayed());
		Assert.assertEquals(true, ScheduledCalls.isDisplayed());
		Assert.assertEquals(true, ScheduledMeetings.isDisplayed());
		Assert.assertEquals(true, CompletedActivities.isDisplayed());
		Assert.assertEquals(true, CompletedReports.isDisplayed());
	}
	
	public void AccessAndVerifyCalendar() {
		Calendar.click();
		Assert.assertEquals(true, ActivedCalendar.isDisplayed());
	}
	
    public void AccessAndVerifyNotifications() {
    	Notifications.click();
    	Assert.assertEquals(true, ActivedNotifications.isDisplayed());
    	Assert.assertEquals(true, ActiveToday.isDisplayed());
    	Assert.assertEquals(true, DismissedToday.isDisplayed());
	}
    
   public void AccessAndVerifyGadgets() {
	   Gadgets.click();
		Assert.assertEquals(true, ActivedGadgets.isDisplayed());
	}
   
   public void AccessAndVerifySettings() {
		
	}
	
}
