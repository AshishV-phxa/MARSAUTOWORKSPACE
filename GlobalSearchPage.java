package mars.v10.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlib.CommonLib;

import Mars10.base.BaseClass;
public class GlobalSearchPage extends BaseClass{
	CommonLib clib=PageFactory.initElements(driver, CommonLib.class);
	
    @FindBy(xpath = "//h3[normalize-space(text()='Search MARS')]")
	public WebElement SearchContext;
    
    //Rep Global Search 
    
    @FindBy(xpath = "//div[normalize-space(text()='Search For :')]//ul//li//span[(text()='Rep')]")
	public WebElement Rep;
    
    @FindBy(xpath = "//div[(text()=' Hint:')]")
	public WebElement Hint;
    
    @FindBy(xpath = "//input[(@placeholder='Type here to search...')]")
	public WebElement textField;
    
    @FindBy(xpath = "//*[@class='text-danger d-block' and (text()='Search Text cannot be empty')]")
	public WebElement CannotbeEmptyText;
    
    @FindBy(xpath = "//a[@class='nav-item nav-link active' and contains(text(),'Rep')]")
	public WebElement Reptext;
    
    @FindBy(xpath = "//i[@class='material-icons' and (text()='close')]")
   	public WebElement Closebutton;
    
    @FindBy(xpath = "//label[normalize-space(text()='Results as of ') and @class='LabelText']")
   	public WebElement ResultsAsOfText;
    
    //String repnamefullname=prop.getProperty("RepName");
    //String[] words=repnamefullname.split("\\s");
    //String repFirstName=words[0];
    //String repLastName=words[1];
    //String repPartialLastName = repLastName.substring(1, repLastName.length());
    @FindBy(xpath = "//a[contains(text(),'+repFirstName+') and contains(text(),'+repPartialLastName+')]")
    public WebElement Replink;
    
    
    
    public GlobalSearchPage() {

		PageFactory.initElements(driver, this);
		
		}
    
    public void repGlobalSearch() {
    	
    	clib.verifyElementDisplay(SearchContext,"Search MARS");
    	clib.verifyElementDisplay(Hint,"Hint");
    	clib.verifyElementDisplay(Rep,"Rep Icon");
    	clib.click(Rep,"Rep Icon");
    	clib.verifyElementDisplay(Hint,"Hint");
    	clib.verifyElementEnable(textField, "Textbox");
    	clib.keyBoardOperation(textField, "ENTER");
    	clib.verifyElementEnable(CannotbeEmptyText, "Cannot Be Empty Text");
    	clib.verifyElementEnable(Closebutton, "Close Button");
    	String repname=prop.getProperty("RepName");
    	clib.clearAndType(textField, repname);
    	clib.keyBoardOperation(textField, "ENTER");
    	clib.verifyElementDisplay(SearchContext,"Search MARS");
    	clib.verifyElementDisplay(Reptext,"Rep Text");
    	clib.verifyElementEnable(Closebutton, "Close Button");
    	clib.verifyElementEnable(ResultsAsOfText, "Result As Of Now Text");
    	
        String repnamefullname=prop.getProperty("RepName");
        String[] words=repnamefullname.split("\\s");
        String repFirstName=words[0];
        String repLastName=words[1];
        String repPartialLastName = repLastName.substring(1, repLastName.length());
        
        
    	System.out.println(Replink);
    	clib.click(Replink, repname);
  
    	//clib.keyBoardOperation(Replink, "CONTROL+CLICK");
    	//clib.switchToWindow();
    	
    	 	
    }
	
}
