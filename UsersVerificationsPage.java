package mars.v10.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class UsersVerificationsPage extends BaseClass{
	
	@FindBy(xpath ="//a[@id='navbarDropdown'][contains(text(),'Security')]")
	WebElement Security;
	
	@FindBy(xpath ="//a[@href='/MARSWeb2/Users']")
	WebElement Users;
	
	@FindBy(xpath="//input[@id='txtUserId']")
	WebElement UserId;
	
	@FindBy(xpath="//select[@id='objJobClassListBox']")
	WebElement JobClass;
	
	@FindBy(xpath="//input[@id='txtFirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='txtLastName']")
	WebElement LastName;
	
	@FindBy(xpath="//select[@id='lstDepartment']")
	WebElement Department;
	
	@FindBy(xpath="//select[@id='lstUserRole']")
	WebElement UserRole;
	
	@FindBy(xpath="//input[@id='btnFindNow']")
	WebElement Find;
	
	@FindBy(xpath="//td[@title='prop.getProperty('username') ']")
	WebElement UserDetails;
	
	

	
	public UsersVerificationsPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void AccessUsers() {
		//Click on Security
		Security.click();
		
		//Click on Users
		Users.click();
	}

	
	public void SearchUser() {
		
		driver.switchTo().frame("legacyIframe");
		Assert.assertEquals(true, UserId.isDisplayed());
		Assert.assertEquals(true, JobClass.isDisplayed());
		Assert.assertEquals(true, FirstName.isDisplayed());
		Assert.assertEquals(true, LastName.isDisplayed());
		Assert.assertEquals(true, Department.isDisplayed());
		Assert.assertEquals(true, UserRole.isDisplayed());
		UserId.sendKeys(prop.getProperty("username"));
		Find.click();
		//driver.switchTo().parentFrame();
		driver.switchTo().frame("GridPane");
		Assert.assertEquals(true, UserDetails.isDisplayed());
		//driver.switchTo().parentFrame();
		
	}
	
}
