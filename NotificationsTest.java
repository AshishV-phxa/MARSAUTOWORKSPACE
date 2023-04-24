package Mars10.tests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.NotificationsPage;

public class NotificationsTest  extends BaseClass{
	DefaultPage DefaultPage;
	NotificationsPage NotificationsPage;
	
	public NotificationsTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		NotificationsPage = new NotificationsPage();
	}
	
	@Test(priority = 1)
	public void navigateToNotifications() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.navigateToNotifications();
	}
	
	@Test(priority = 2)
	public void verifyNotificationFields() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		NotificationsPage.verifyNotificationFields();
	}
	
	
}
