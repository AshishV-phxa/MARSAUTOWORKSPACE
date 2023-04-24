package Mars10.tests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.HelpPage;
import mars.v10.pages.NotificationsPage;
public class HelpTest extends BaseClass {
	DefaultPage DefaultPage;
	HelpPage HelpPage;
	
	public HelpTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		HelpPage = new HelpPage();
	}
	
	@Test(priority = 1)
	public void navigateToHelp() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.navigateToHelp();
	}
	
	@Test(priority = 2)
	public void verifyNotificationFields() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HelpPage.verifyHelpLinks();
	}
	
	@Test(priority = 3)
	public void switchToPrimaryScreen() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.switchToPrimaryScreen();
	}
	
	
}
