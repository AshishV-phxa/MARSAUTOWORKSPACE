package Mars10.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;

public class ScheduleCallTest extends BaseClass {
	
	DefaultPage DefaultPage;
	
	public ScheduleCallTest() {
		super();
	}
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		
	}
	@Test(priority = 1)
	public void AccessScheduleCall() {
		DefaultPage.AccessScheduleCall();
	}
	
	@Test(priority = 2)
	public void ScheduleCall() {
		DefaultPage.ScheduleCall();
	}
	
	@AfterSuite
	public void closeBrowser() {
		DefaultPage.closeBrowser();
	}  

}
