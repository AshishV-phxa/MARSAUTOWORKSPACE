package Mars10.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Mars10.base.BaseClass;
import mars.v10.pages.RepLookUp;

public class RepLookUpTest extends BaseClass
{
	
	RepLookUp RepLookUp;
	
	public RepLookUpTest()
	{
		super();
		
	}
	@BeforeTest
	public void setupreport() {
		setExtent();
	}
	
	@BeforeClass
	public void setUp()
	{
		
		RepLookUp = new RepLookUp();	
	}
	
	@Test(priority=1)
	public void Replookuplogin()
	{
		test = extent.createTest("replookuplogin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.clickrep();
	}
	
	@Test(priority=2,groups= {"Rep"})
	public void Repnamesearch()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.repname_search();
	}
		
	@Test(priority=4,groups= {"Rep"})
	 public void EditRepPrimaryDetails()
	 {
		RepLookUp.click_maintab();
		RepLookUp.clear_Type_MiddleName();
		//RepLookUp.clear_Type_Fax();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.clear_Type_Website();
		RepLookUp.clear_Type_RepTitle();
	    RepLookUp.clear_Type_FirmSourceID();
		RepLookUp.clear_Type_RepNickName();
		RepLookUp.clear_Type_RepCRD();
		RepLookUp.clear_Type_RepFirstName();
		RepLookUp.clear_Type_RepLastName();
		//RepLookUp.clear_Type_RepPhone();
		RepLookUp.clear_Type_RepEmailID2();
		//RepLookUp.clear_Type_RepMobile();
		//RepLookUp.clear_Type_PhoneExt();
		RepLookUp.clear_Type_RepComments();
		RepLookUp.clear_Type_PersonalInfo();
		RepLookUp.clear_Type_RepSourceID();
		RepLookUp.clear_Type_Broker();
		RepLookUp.clear_Type_AlternateName();
		RepLookUp.clear_Type_Birthday();
		RepLookUp.clear_Type_AUM();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.clear_Type_Spouse();
		RepLookUp.clear_Type_Assistant();
		RepLookUp.clear_Type_PriorFirm();
		RepLookUp.clear_Type_UDF1();
		RepLookUp.clear_Type_RepEmail();
	 }	
	
	@Test(priority=5,groups= {"Rep"})
	public void AddDocument()
	{
		RepLookUp.Document();
	}
	
	@Test(priority=6,groups= {"Rep"})
	public void AddSociallinks()
	{
		RepLookUp.Social_link();
	}
	@Test(priority=7)
	public void CtrlClick()
	{
		RepLookUp.Rep_ctr_click();
		RepLookUp.Firm_ctr_click();
		RepLookUp.Office_ctr_click();
	}
	@Test(priority=3)
	public void RepProfileTabClick()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*RepLookUp.click_ClassicProfile(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
		RepLookUp.click_Sales();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.click_Activities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.click_Calendar();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.click_Timeline();
	}
	@AfterMethod
	public void logincomp(ITestResult result) throws IOException {
		
		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "Testcase Failed is" + result.getName());// to add name in extent report
			test.log(Status.FAIL, "Testcase Failed is" + result.getThrowable());// to add error/exception in extent
																				// report

			String screenshotpath = BaseClass.getScreenshot(driver, result.getName());

			test.addScreenCaptureFromPath(screenshotpath);
		}

		else if (result.getStatus() == ITestResult.SKIP) {

			test.log(Status.SKIP, "Testcase Skipped is" + result.getName());

		}

		else if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(Status.PASS, "Tetscase Passed is" + result.getName());
		}
		
	}

	@AfterTest
	
	public void endreport() {
		
		endReport();
	}

}			
