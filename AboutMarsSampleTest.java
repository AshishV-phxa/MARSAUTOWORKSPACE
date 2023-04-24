package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Mars10.base.BaseClass;
import mars.v10.pages.AboutMarsTestPage;
import mars.v10.pages.DefaultPage;

public class AboutMarsSampleTest {
	DefaultPage DefaultPage;
	AboutMarsTestPage AboutMarsTestPage;
	
	public AboutMarsSampleTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		DefaultPage = new DefaultPage();
		AboutMarsTestPage = new  AboutMarsTestPage();
	}
	
	@Test(priority = 1)
	public void navigateToAboutMars() {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AboutMarsTestPage.verifyAboutMars(null);
	}
	
}
