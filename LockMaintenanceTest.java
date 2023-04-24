package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.LockMaintenancePage;

public class LockMaintenanceTest extends BaseClass {
	
	DefaultPage DefaultPage;
	LockMaintenancePage LockMaintenancePage;
	
	public LockMaintenanceTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		LockMaintenancePage = new LockMaintenancePage();
	}
	
	@Test(priority = 1)
	public void AccessTransactionDetail() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LockMaintenancePage.AccessTransactionDetail();
	}
	
	@Test(priority = 2)
	public void TransactionDetailLock() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LockMaintenancePage.TransactionDetailLock();
	}
	
	@Test(priority = 3)
	public void navigateToAdministration() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.navigateToAdministration();
	}
	
	@Test(priority = 4)
	public void AccessLocks() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LockMaintenancePage.AccessLocks();
	}
	
	@Test(priority = 5)
	public void RemoveMaintenanceLock() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LockMaintenancePage.RemoveMaintenanceLock();
	}



}
