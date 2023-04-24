package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.*;

public class FindRepTest extends BaseClass {
	RepLookUp RepLookUp;
	public FindRepTest() {
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
	public void SearchwithRepType() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.SearchwithRepType();
	}

	@Test(priority = 3)
	public void Find() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	RepLookUp.Find();
	}
	
	@Test(priority = 3)
	public void VerifyRepSearchData() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.Data();
	}
	@Test(priority = 4)
	public void navigateToRepProfileSecond() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.clickrep();
	}
	@Test(priority = 5)
	public void RecentSearch() {
		RepLookUp.RecentSearch();
	}
}
