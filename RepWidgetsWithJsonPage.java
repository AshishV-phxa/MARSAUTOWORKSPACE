package mars.v10.pages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class RepWidgetsWithJsonPage extends BaseClass{
	
	DateFormat dt = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	DateFormat D = new SimpleDateFormat("ddMMyyyy");
	Date d = new Date();
	String Time = dt.format(d);
	String Date = D.format(d);
	Logger log = Logger.getLogger(RepWidgetPage.class);
	JavascriptExecutor je = (JavascriptExecutor)driver;
	
	
	@FindBy(xpath="//a[contains(text(),'MARS')]//following::span[1]")
	WebElement ClickArrow;
	@FindBy(xpath="//*[contains(text(),'Administration')]")
	WebElement ClickAdministration;
	@FindBy(xpath="/html/body/app-root/app-home/div[1]/div/div[3]/div/a[2]")
	WebElement ClickSales;
	@FindBy(xpath="//a[contains(text(),'System') and @id='navbarDropdown']")
	WebElement ClickSystem;
	@FindBy(xpath="//*[normalize-space(text())='Customize Rep Profile']")
	WebElement ClickcusRep;
	@FindBy(xpath="//*[normalize-space(text())='New Tab']")
	WebElement NewTab;
	@FindBy(xpath="//*[@title='Save Tab']")
	WebElement SaveTab;
	@FindBy(xpath="//div[@class='modal-body']//following::input[1]")
	WebElement TabName;
	@FindBy(xpath="//button[@id='btnOK']")
	WebElement SaveButton;
	@FindBy(xpath="//div[@class='container-fluid']")
	WebElement ProfileCustomization;
	String Tab;
	@FindBy(xpath="//button[@id='btnOk']")
	WebElement DisplayFieldOkButton;
	//@FindBy(xpath="//div[@class='labelElipse1 LinkLabelText HeaderLabel']//span[text()='"+Tab+"'] ")
	//WebElement TabHeadings;
	@FindBy(xpath="//*[@id='btnOk']")
	WebElement OkButton;
	
	 public RepWidgetsWithJsonPage() {

			PageFactory.initElements(driver, this);

		}
	 
		public void Administartion()
		
		{
			ClickArrow.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ClickAdministration.click();
			WebElement VerifyAdministartion=ClickAdministration;
			String Verification= VerifyAdministartion.getText();
			Assert.assertEquals(Verification,"Administration","Havent Switched to Administartion Window");
			log.info("Switched to Administration " + Verification);
			ClickSystem.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ClickcusRep.click();
			String parent=driver.getWindowHandle();
			driver.switchTo().window(parent);
			 String Verification1 = driver.getTitle();
	 		 System.out.println("Switch to window title is :"+Verification1);
		}
		
		public void NewTabs() throws IOException, ParseException {
			
			//To read the Json Object, Parsing need to be done first
			JSONParser jsonparser= new JSONParser();
			//To load the Json File
			FileReader reader=new FileReader("D:\\Workspace\\Mars10POMAutomation\\src\\main\\java\\mars\\v10\\pages\\JSON Data\\RepWidgets.json");
			//created the object for the reader
			Object obj=jsonparser.parse(reader);
			//As obj is just object, now we need to convert that into JSON object
			JSONObject jsonobj=(JSONObject)obj;
			//Now we can extract the data
			String Test=(String) jsonobj.get("SampleTest");
			System.out.println(Test);
			JSONArray Array= (JSONArray)jsonobj.get("Tabs");
			for(int i=0;i<Array.size();i++)
			{
			   JSONObject TabNames= (JSONObject) Array.get(i);
			   String Name= (String) TabNames.get("Tab");
				System.out.println(Name);
				try {	            
				       if(driver.findElement(By.xpath("//div[@class='labelElipse1 LinkLabelText HeaderLabel']//span[text()='"+Name+"'] ")).isDisplayed())
				       
				       		{
				            	System.out.println(Name +" is already Exist");           	
				            }
				           
				          } catch (NoSuchElementException e){
				        	  System.out.println(Name + "is not present");
				        	  NewTab.click();
						      Assert.assertEquals(true, TabName.isDisplayed());
						   	  TabName.sendKeys(Tab);
						      System.out.println();
						      SaveButton.click();
				        	  
				          }
			   
		   }
		}
		public void addingRepWidgets() throws IOException, ParseException {
			//To read the Json Object, Parsing need to be done first
			JSONParser jsonparser= new JSONParser();
			//To load the Json File
			FileReader reader=new FileReader("D:\\Workspace\\Mars10POMAutomation\\src\\main\\java\\mars\\v10\\pages\\JSON Data\\RepWidgets.json");
			//created the object for the reader
			Object obj=jsonparser.parse(reader);
			//As obj is just object, now we need to convert that into JSON object
			JSONObject jsonobj=(JSONObject)obj;
			//Now we can extract the data
			String Test=(String) jsonobj.get("SampleTest");
			System.out.println(Test);
			JSONArray Array= (JSONArray)jsonobj.get("RepWidgets");
			for(int i=0;i<Array.size();i++)
			{
			   JSONObject Widgets= (JSONObject) Array.get(i);
			   String Tab= (String) Widgets.get("Tab");
				System.out.println(Tab);
				String Widget= (String) Widgets.get("Widget");
				System.out.println(Widget);
				
				 try {	            
				       if(driver.findElement(By.xpath("//div[@class='labelElipse1 LinkLabelText HeaderLabel']//span[text()='"+Tab+"']//following::div[@class='viewsList cdk-drop-list'][1]/ul//li//span[text()='"+Widget+"']")).isDisplayed())
				       
				       		{
				            	System.out.println(Widget+" is already Added");           	
				            }
				           
				      } catch (NoSuchElementException e){
				        	  
				        	    	  //Click on + icon for the tab to add the widgets
				        	  driver.findElement(By.xpath("//div[@class='labelElipse1 LinkLabelText HeaderLabel']//span[text()='"+Tab+"']//following::div[1]/i[@title='New Widget']")).click();
				        	  //Verify the visibility of profile Customization
				        	  ProfileCustomization.isDisplayed();
				        	  //select the Widget
				        	  driver.findElement(By.xpath("//div[@class='LabelBlackText'][contains(text(),'"+Widget+"')]")).click();
				        	  if(DisplayFieldOkButton.isDisplayed()) {
				        		  //If it pop ups Display Fields click on ok button
				        		  DisplayFieldOkButton.click();
				        	  }
				        	  System.out.println(Widget + "is added successfully");
				        	   } 
			}			   
			
		}

}
	
