package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.NotificationsPage;

public class AddNotes extends BaseClass {
	DefaultPage DefaultPage;
	
	public AddNotes() {
		super();
	}
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		
	}
		@BeforeMethod
	public void AccessAddNote() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.AccessAddNote();
	} 
	
	@Test(priority = 1)
	public void AddRepNotes() {
		DefaultPage.AddRepNotes();
	}
	
	@Test(priority = 2)
	public void AddOfficeNotes() {
		DefaultPage.AddOfficeNotes();
	}
	
	@Test(priority = 3)
	public void AddFirmNotes() {
		DefaultPage.AddFirmNotes();
	}
}
