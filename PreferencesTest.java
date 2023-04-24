package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.NotificationsPage;
import mars.v10.pages.PreferencesPage;

public class PreferencesTest extends BaseClass {
	DefaultPage DefaultPage;
	PreferencesPage PreferencesPage;
	
	public PreferencesTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		PreferencesPage = new PreferencesPage();
	}
	
	@Test(priority = 1)
	public void navigateToPreferences() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.navigateToPreferences();
	}
	
	@Test(priority = 2)
	public void verifyPreferencesFields() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PreferencesPage.verifyPreferencesFields();
	}
	
}
