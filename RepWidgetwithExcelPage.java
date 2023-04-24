package mars.v10.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Mars10.base.BaseClass;

public class RepWidgetwithExcelPage extends BaseClass {

	
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
	
	
	
	
	 public RepWidgetwithExcelPage() {

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
	
	public void AddingTabs() throws IOException {
		//Create an object of File class to open xlsx file
				System.out.println("Entered into the Page");
				//File file =  new File("D:\\Workspace\\TestData\\RepWidgets.xlsx");
				File file = new File("D:\\Workspace\\Mars10POMAutomation\\src\\main\\java\\mars\\v10\\pages\\RepWidgets.xlsx");
				System.out.println("File Location");
				//Create an object of FileInputStream class to read excel file
			    FileInputStream inputStream = new FileInputStream(file);	    
			    System.out.println("InputStream");
			    //create object of XSSFWorkbook class
			    Workbook RepWorkbook = new XSSFWorkbook(inputStream);
			    System.out.println("Workbook");	    
			    //Read the sheet	    
			    Sheet RepSheet = RepWorkbook.getSheet("Tabs");
			    System.out.println("WorkSheet");	    
			  //Find number of rows in excel file
			    int rowCount = RepSheet.getLastRowNum()-RepSheet.getFirstRowNum();
			    System.out.println(rowCount);
			  //Create a loop over all the rows of excel file to read it
			    for (int i = 1; i < rowCount+1; i++) {

			        Row row = RepSheet.getRow(i);

			        //Create a loop to print cell values in a row

			        for (int j = 0; j < row.getLastCellNum(); j++) {

			         
			           Tab = row.getCell(j).getStringCellValue();
			           System.out.println(Tab+"|| ");
			     

			         try {	            
			       if(driver.findElement(By.xpath("//div[@class='labelElipse1 LinkLabelText HeaderLabel']//span[text()='"+Tab+"'] ")).isDisplayed())
			       
			       		{
			            	System.out.println(Tab+" is already Exist");           	
			            }
			           
			          } catch (NoSuchElementException e){
			        	  System.out.println(Tab + "is not present");
			        	  NewTab.click();
					      Assert.assertEquals(true, TabName.isDisplayed());
					   	  TabName.sendKeys(Tab);
					      System.out.println();
					      SaveButton.click();
			        	  
			          }
			        }

			        } }
			      
			   
			    
 public void addingRepWidgets() throws IOException {
	    //Create an object of File class to open xlsx file
		System.out.println("Entered into the Page");
		//File file =  new File("D:\\Workspace\\TestData\\RepWidgets.xlsx");
		File file = new File("D:\\Workspace\\Mars10POMAutomation\\src\\main\\java\\mars\\v10\\pages\\RepWidgets.xlsx");
		System.out.println("File Location");
		//Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);	    
	    System.out.println("InputStream");
	    //create object of XSSFWorkbook class
	    Workbook RepWorkbook = new XSSFWorkbook(inputStream);
	    System.out.println("Workbook");	    
	    //Read the sheet	    
	    Sheet RepSheet = RepWorkbook.getSheet("RepWidgets");
	    System.out.println("WorkSheet");	    
	  //Find number of rows in excel file
	    int rowCount = RepSheet.getLastRowNum()-RepSheet.getFirstRowNum();
	    System.out.println(rowCount);
	  //Create a loop over all the rows of excel file to read it
	    for (int i = 1; i < rowCount+1; i++) {

	        Row row = RepSheet.getRow(i);        

	            //Print Excel data in console
	        
	           String tabHeading = row.getCell(0).getStringCellValue();
	           System.out.println(tabHeading +" - ");
	           String Widget = row.getCell(1).getStringCellValue();
	           System.out.print(Widget+"|| ");	    
	           
	           

	       try {	            
	       if(driver.findElement(By.xpath("//div[@class='labelElipse1 LinkLabelText HeaderLabel']//span[text()='"+tabHeading+"']//following::div[@class='viewsList cdk-drop-list'][1]/ul//li//span[text()='"+Widget+"']")).isDisplayed())
	       
	       		{
	            	System.out.println(Widget+" is already Added");           	
	            }
	           
	          } catch (NoSuchElementException e){
	        	  
	        	    	  //Click on + icon for the tab to add the widgets
	        	  driver.findElement(By.xpath("//div[@class='labelElipse1 LinkLabelText HeaderLabel']//span[text()='"+tabHeading+"']//following::div[1]/i[@title='New Widget']")).click();
	        	  //Verify the visibility of profile Customization
	        	  ProfileCustomization.isDisplayed();
	        	  //select the Widget
	        	  driver.findElement(By.xpath("//div[@class='LabelBlackText'][contains(text(),'"+Widget+"')]")).click();
	        	  System.out.println(Widget + "is added successfully");
	        	  
	        	  
	          } 
	    

	        }
 		}
 		/*public void updateDisplayFields() throws IOException {
 			//Create an object of File class to open xlsx file
 			System.out.println("Entered into the Page");
 			File file =  new File("D:\\Workspace\\TestData\\RepWidgets.xlsx");
 			System.out.println("File Location");
 			//Create an object of FileInputStream class to read excel file
 		    FileInputStream inputStream = new FileInputStream(file);	    
 		    System.out.println("InputStream");
 		    //create object of XSSFWorkbook class
 		    Workbook RepWorkbook = new XSSFWorkbook(inputStream);
 		    System.out.println("Workbook");	    
 		    //Read the sheet	    
 		    Sheet RepSheet = RepWorkbook.getSheet("UpdateDisplayFields");
 		    System.out.println("WorkSheet");	    
 		  //Find number of rows in excel file
 		    int rowCount = RepSheet.getLastRowNum()-RepSheet.getFirstRowNum();
 		    System.out.println(rowCount);
 		  //Create a loop over all the rows of excel file to read it
 		    for (int i = 1; i < rowCount+1; i++) {

 		        Row row = RepSheet.getRow(i);        

 		            //Print Excel data in console
 		        
 		           String tabHeading = row.getCell(0).getStringCellValue();
 		           System.out.println(tabHeading +" - ");
 		           String Widget = row.getCell(1).getStringCellValue();
 		           System.out.println(Widget+"-");	
 		          String DisplayField = row.getCell(2).getStringCellValue();
		           System.out.println(DisplayField+"-");	
 		           
 		       WebElement SettingsIcon = driver.findElement(By.xpath("//div[@class='labelElipse1 LinkLabelText HeaderLabel']//span[text()='"+tabHeading+"']//following::span[contains(text(),'"+Widget+"')]//following::div/i[1])"));
 		      SettingsIcon.click();
 		      
 		      WebElement CheckField = driver.findElement(By.xpath("//*[normalize-space(text())='"+DisplayField+"']/preceding::input[1]"));

 		    try {	            
 		       if(CheckField.isSelected())
 		       
 		       		{
 		            	System.out.println(DisplayField+" is already Selected");           	
 		            }
 		           
 		          } catch (NoSuchElementException e){
 		        	  
 		        	    	  CheckField.click(); 		        	    	          	  
 		        	
 		          }  
 		    
 		    OkButton.click();

 		        } 
 		} */
	} 

