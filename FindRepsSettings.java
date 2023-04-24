package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.RepLookUp;

public class FindRepsSettings extends BaseClass{
	RepLookUp RepLookUp;
	public FindRepsSettings() {
		super();
	}
	@BeforeClass
	public void setup() {
		RepLookUp = new RepLookUp();
	}
	
	@Test(priority = 1)
	public void navigateToRepProfile() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.clickrep();
	}
	@Test(priority = 2)
	public void RepSearchWithName() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.repname_search();
	}
	@Test(priority = 3)
	public void FindRepSettings() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.FindRepSettings();
	}
}
