package Mars10.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.RepProfilePage;

public class RepProfileText extends BaseClass{
	RepProfilePage RepProfilePage;
	
	
	public RepProfileText()
	{
		super();
		
	}
	@BeforeClass
	public void setUp()
	{
		
		RepProfilePage = new RepProfilePage();	
		
	}
	
	@Test(priority=1)
	public void navigateToRepProfile()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepProfilePage.navigateToRepProfile();
	
	}
}
