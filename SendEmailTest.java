package Mars10.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;

public class SendEmailTest extends BaseClass {
	DefaultPage DefaultPage;
	
	public SendEmailTest() {
		super();
	}
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		
	}
	@Test(priority = 1)
	public void SendEmail() {
		DefaultPage.SendEmail();
	}
	
	@AfterSuite
	public void closeBrowser() {
		DefaultPage.closeBrowser();
	}
}
