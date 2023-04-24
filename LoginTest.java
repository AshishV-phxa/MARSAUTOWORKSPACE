package Mars10.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Mars10.base.BaseClass;
import mars.v10.pages.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage LoginPage;
	Actions action = new Actions(driver);
	
	 	public LoginTest() {
	 			super();
	}
	 	
	 @BeforeSuite
	 public void setUp() {
			initialization();
			LoginPage = new LoginPage();
		} 
	
	@BeforeTest
	public void setupreport() {
		setExtent();
		
	}

	@BeforeMethod
	@BeforeClass
	
	@Test
	public void Login() {
		test = extent.createTest("Login");
		LoginPage.clearusrname();
		Reporter.log("Cleared User Name");
		LoginPage.enterunsername(prop.getProperty("username"));
		Reporter.log("Entered User Name");
		LoginPage.clearpwd();
		Reporter.log("Cleared Password");
		LoginPage.enterpassword(prop.getProperty("password"));
		Reporter.log("Entered Password");
		LoginPage.clicklogin();
		Reporter.log("Clicked on Login Button");
		action.sendKeys(Keys.ENTER).build().perform();

		
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

	/*@AfterTest
	
	public void endreport() {
		
		endReport();
	}*/
	/*@AfterSuite
	
	public void Closebrowser(){
		driver.close();
		driver.quit();
	}*/
}			
