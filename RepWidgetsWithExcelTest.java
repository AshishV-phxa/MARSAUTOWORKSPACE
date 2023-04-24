package Mars10.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.RepWidgetwithExcelPage;

public class RepWidgetsWithExcelTest extends BaseClass {
	RepWidgetwithExcelPage RepWidgetwithExcelPage;
	DefaultPage DefaultPage;
	
	public RepWidgetsWithExcelTest()
	{
		super();
		
	}
	@BeforeClass
	public void setUp()
	{
		
		RepWidgetwithExcelPage = new RepWidgetwithExcelPage();	
		DefaultPage = new DefaultPage();
	}
	@Test(priority=1)
	public void Administration() {
	try {
		{
			RepWidgetwithExcelPage.Administartion();
			System.out.println("Navigated to RepWidget");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
	@Test(priority=2)
	public void AddingTabs() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepWidgetwithExcelPage.AddingTabs();
		//System.out.println("Adding Tabs");
	}
	
	@Test(priority=3)
	public void addingRepWidgets() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepWidgetwithExcelPage.addingRepWidgets();
		//System.out.println("Adding Widgets");
	}
	
	/*@Test(priority=4)
	public void updateDisplayFields() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepWidgetwithExcelPage.updateDisplayFields();
	}*/
	
	@AfterSuite()
	public void closeBrowser() {
		DefaultPage.closeBrowser();
	}
	
}
