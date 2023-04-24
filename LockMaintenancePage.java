package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class LockMaintenancePage extends BaseClass{
	
	@FindBy(xpath = "//a[contains(text(),'Sales & Assets')]")
	WebElement SalesandAssets;
	
	@FindBy(xpath = "//a[contains(text(),'Transaction Detail')]")
	WebElement TransactionDetail;
	
	@FindBy(xpath = "//span[contains(text(),'Find Transactions')]")
	WebElement FindTransactionsHeading;
	
	@FindBy(xpath = "//input[@id='btnFindNow']")
	WebElement FindTransactionsButton;
	
	@FindBy(xpath = "//td[contains(@title,'ASH')]//preceding::td[5]")
	WebElement Transactions;
	
	@FindBy(xpath = "//span[@id='lblClearingFirm']")
	WebElement ClearingFirm;

	@FindBy(xpath = "//span[@class='GridLinkLabelText ng-star-inserted']")
	WebElement FirstFirm;
	
	@FindBy(xpath = "//a[contains(text(),'Maintenance')]")
	WebElement Maintenance;

	@FindBy(xpath = "//a[contains(text(),'Locks')]")
	WebElement Locks;
	
	@FindBy(xpath = "//h2[@id='LegacyTitle'][contains(text(),'Lock Maintenance')]")
	WebElement LockMaintenanceHeading;
	
	@FindBy(xpath = "//input[@id='txtDuration']")
	WebElement LocksDuration;
	
	@FindBy(xpath = "//input[@id='btnFindNow']")
	WebElement FindLockMaintenance;
	
	@FindBy(xpath = "")
	WebElement Salesecadsts;
	
	@FindBy(xpath = "")
	WebElement Salasesets;
	
	@FindBy(xpath = "")
	WebElement Salassssdsesets;
	
	@FindBy(xpath = "")
	WebElement Salesesats;
	
	@FindBy(xpath = "")
	WebElement Salesasets;
	
	@FindBy(xpath = "")
	WebElement Salesetcdfs;

	@FindBy(xpath = "")
	WebElement Saleseaefts;
	
	public LockMaintenancePage() {

		PageFactory.initElements(driver, this);
		
		}

	public void AccessTransactionDetail(){
		Assert.assertEquals(true, SalesandAssets.isDisplayed());
		SalesandAssets.click();
		Assert.assertEquals(true, TransactionDetail.isDisplayed());
		TransactionDetail .click();
		Assert.assertEquals(true, FindTransactionsHeading.isDisplayed());		
	}
	public void TransactionDetailLock() {
		FindTransactionsButton .click();
		Transactions.click();
		ClearingFirm.click();
		FirstFirm.click();
	}
	public void AccessLocks() {
		Maintenance.click();
		Locks.click();
		Assert.assertEquals(true, LockMaintenanceHeading.isDisplayed());
	}
	public void RemoveMaintenanceLock() {
		LocksDuration.sendKeys("15");
		FindLockMaintenance.click();
	}
}
