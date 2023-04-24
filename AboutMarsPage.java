package mars.v10.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Mars10.base.BaseClass;

public class AboutMarsPage extends BaseClass{
	
	@FindBy(xpath = "//span[@id='lblDatabaseVersion'][@title='10.01.15.000']")
	WebElement DBVersion;
	
	@FindBy(xpath = "//span[@id='lblDatabaseServer'][contains(text(),'192.168.169.138:1561/IND400')]")
	WebElement DBServer;

	@FindBy(xpath = "//span[@id='lblServerName'][contains(text(),'VM-QA100')]")
	WebElement ServerName;
	
	@FindBy(xpath = "//span[@id='lblLastSignIn'][contains(text(),'6/10/2020 3:40:45 PM')]")
	WebElement LastSignIn;
	
	@FindBy(xpath = "//span[@id='lblDuration']")
	WebElement Duration;
	
	@FindBy(xpath = "//img[@id='imgMarsLogo']")
	WebElement AboutUsMarsLogo;
	
	@FindBy(xpath = "//span[@id='lblVersion']")
	WebElement Version;
	
	@FindBy(xpath = "//span[@id='lblGenarate']")
	WebElement GenerateInstall;
	
	@FindBy(xpath = "//p[@id='spnCopyRight']")
	WebElement CopyRight;
	
	@FindBy(xpath ="//h4[@class='modal-title']")
	WebElement ModalTitle;

	@FindBy(xpath = "//*[@title='Close']")
	WebElement CloseAboutMars;
	
	@FindBy(xpath = "//iframe[@id=\"dialogIFrame\"]")
	WebElement AboutusFrame;
	
	

	public AboutMarsPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void verifyAboutMarsModalPoup() {
		
		
		//Verify the visibility of About Mars Tile on Modal Popup
		 //Assert.assertEquals(ModalTitle.getText(), prop.getProperty("AboutUsTitle"));
		
		 
		driver.switchTo().frame("dialogIFrame");	
		
		
	//Verify the visibility of MARS Database Version value
	  //Assert.assertEquals(true, DBVersion.isDisplayed() );
	//Verify the visibility of MARS Database Server value
	  Assert.assertEquals(true, DBServer.isDisplayed() );
	//Verify the visibility of Server Name value
	  Assert.assertEquals(true, ServerName.isDisplayed() );
	//Verify the visibility of Logged On value
	  //Assert.assertEquals(true, LastSignIn.isDisplayed() );
	//Verify the visibility of Duration value
	  //Assert.assertEquals(true, Duration.isDisplayed() );
	//Verify the visibility of Mars Logo on Modal popup
	 Assert.assertEquals(true, AboutUsMarsLogo.isDisplayed() );
	//Verify the visibility of Release Version value
	  Assert.assertEquals(true, Version.isDisplayed() );
	//Verify the visibility of Installed on 
	  Assert.assertEquals(true, GenerateInstall.isDisplayed() );
	//Verify the visibility of Copy Right
	  Assert.assertEquals(true, CopyRight.isDisplayed() );
	
	 driver.switchTo().parentFrame();
	}
	
	public void closeAboutMars(){
    //Click on close button
		CloseAboutMars.click();
		System.out.println("About Us is Closed");
	}
	
	

}
