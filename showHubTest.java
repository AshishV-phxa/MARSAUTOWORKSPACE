package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.RepLookUp;
import mars.v10.pages.ShowHubPage;


public class showHubTest extends BaseClass {
	
	ShowHubPage ShowHubPage;

	public showHubTest() {
		super();
	}
	@BeforeClass
	public void setup() {
		ShowHubPage = new ShowHubPage();
	}
	@Test(priority = 1)
	public void AccessShowHub() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ShowHubPage.AccessShowHub();
	}
	@Test(priority = 2)
	public void AccessAndVerifyToday() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ShowHubPage.AccessAndVerifyToday();
	}
	@Test(priority = 3)
	public void AccessAndVerifyCalendar() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ShowHubPage.AccessAndVerifyCalendar();
	}
	@Test(priority = 4)
	public void AccessAndVerifyNotifications() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ShowHubPage.AccessAndVerifyNotifications();
	}
	@Test(priority = 5)
	public void AccessAndVerifyGadgets() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ShowHubPage.AccessAndVerifyGadgets();
	}
	/*@Test(priority = 5)
	public void AccessAndVerifyGadgets() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ShowHubPage.AccessAndVerifyNotifications();
	} */
	
}
