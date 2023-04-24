package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.AboutMarsPage;

public class AboutMarsTest extends BaseClass {
	DefaultPage DefaultPage;
	AboutMarsPage AboutMarsPage;
	
	public AboutMarsTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		AboutMarsPage = new AboutMarsPage();
	}
	
	@Test(priority = 1)
	public void navigateToAboutMars() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.navigateToAboutMars();
	}
	
	@Test(priority = 2)
	public void verifyAboutMarsModalPoup() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AboutMarsPage.verifyAboutMarsModalPoup();
	} 
	
	@Test(priority = 3)
	public void closeAboutMars() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AboutMarsPage.closeAboutMars();
	}

}

