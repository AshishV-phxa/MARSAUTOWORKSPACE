package Mars10.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;

public class LogCallTest extends BaseClass {
DefaultPage DefaultPage;
	
	public LogCallTest() {
		super();
	}
	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		
	}
	@Test(priority = 1)
	public void LogCall() {
		DefaultPage.LogCall();
	}
	
 @AfterSuite
	public void closeBrowser() {
		DefaultPage.closeBrowser();
	} 
} 
