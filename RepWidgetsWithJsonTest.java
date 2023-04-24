package Mars10.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.RepWidgetsWithJsonPage;

public class RepWidgetsWithJsonTest extends BaseClass{
	RepWidgetsWithJsonPage RepWidgetsWithJsonPage;
	DefaultPage DefaultPage;
	
	
	public RepWidgetsWithJsonTest()
	{
		super();
		
	}
	@BeforeClass
	public void setUp()
	{
		
		RepWidgetsWithJsonPage = new RepWidgetsWithJsonPage();	
		DefaultPage = new DefaultPage();
	}
	@Test(priority=1)
	
	
	@AfterSuite()
	public void closeBrowser() {
		DefaultPage.closeBrowser();
	}
}
