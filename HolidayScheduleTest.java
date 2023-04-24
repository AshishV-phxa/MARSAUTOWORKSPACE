package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.HolidaySchedulePage;

public class HolidayScheduleTest extends BaseClass{
	DefaultPage DefaultPage;
	HolidaySchedulePage HolidaySchedulePage;
	
	public HolidayScheduleTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		HolidaySchedulePage = new HolidaySchedulePage();
	}
	
	@Test(priority = 1)
	public void navigateToAdministration() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.navigateToAdministration();
	}
	
	@Test(priority = 2)
	public void AccessHolidaySchedule() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HolidaySchedulePage.AccessHolidaySchedule();
	}
	
	@Test(priority = 3)
	public void CreateAndDeleteHoliday() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HolidaySchedulePage.CreateAndDeleteHoliday();
	}
}
