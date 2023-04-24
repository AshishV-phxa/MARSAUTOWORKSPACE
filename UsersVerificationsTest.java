package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.AboutMarsPage;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.UsersVerificationsPage;

public class UsersVerificationsTest extends BaseClass {
	DefaultPage DefaultPage;
	UsersVerificationsPage UsersVerificationsPage;
	
	public UsersVerificationsTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		UsersVerificationsPage = new UsersVerificationsPage();
	}
	
	@Test(priority = 1)
	public void navigateToAdministration() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.navigateToAdministration();
	}
	
	@Test(priority = 2)
	public void AccessUsers() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UsersVerificationsPage.AccessUsers();
	}
	
	@Test(priority = 3)
	public void SearchUser() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		UsersVerificationsPage.SearchUser();
	}
	
	
}
