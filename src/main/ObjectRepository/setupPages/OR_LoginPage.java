package setupPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import baseClass.Mainclass;
import utilityClass.CommonMethod;

public class OR_LoginPage extends Mainclass {
	
	
	@FindBy(how=How.XPATH, using="//input[@id='username']")
			//xpath="//input[@id='username']")
	static WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	static WebElement password;
	
	@FindBy(xpath="//input[@id='Login']")
	static WebElement LoginButton;
	
	@FindBy(xpath="//a//div[@title='New']")
	static WebElement NewApplication;
	
	@FindBy(xpath="//input[@placeholder='Search Salesforce']")
	static WebElement SearchBox;
	
	@FindBy(xpath="//input[@placeholder='Search Setup']")
	static WebElement UserInputBox;
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Login']")
	static WebElement SetupUserLoginButton;
	
	
	@BeforeTest
	public static void OR_setupLoginPage()
	{   System.out.println("page object initialize");
		PageFactory.initElements(driver,OR_LoginPage.class);
	}
	public static boolean logintoApplication()
	{  boolean finalresult=false;  
	   String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
	   System.out.println("Function : "+methodName+"  has started.");
	   boolean inp1=CommonMethod.typeTextOnEditBox(username, Mainclass.config.getProperty("username"));	   
	   boolean inp2=CommonMethod.typeTextOnEditBox(password, Mainclass.config.getProperty("password"));
	   boolean inp3=CommonMethod.clickOn(LoginButton);
	   boolean inp4=CommonMethod.waitForObjectVisible(SearchBox,50);
	   boolean inp5=CommonMethod.clickOn(SearchBox);
	   if(inp1==true&&inp2==true&&inp3==true&& inp4==true &&inp5==true)
	   {
		   finalresult=true;
	   }
	   return finalresult;
	  }
	   public static boolean navigateToSetup()
	  { String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
	     System.out.println("Function : "+methodName+"  has started.");
		boolean inp=CommonMethod.navigate(config.getProperty("setupURL"));
		return inp;
		 
	  }
	   
	  public static boolean logInThroughUser(String input) throws InterruptedException
	  {    String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
	       System.out.println("Function : "+methodName+"  has started.");
		  boolean opt,inp2 = false,inp4 = false,inp6 = false,inp7 = false;
			    boolean inp=CommonMethod.waitForObjectVisible(UserInputBox, 40);
			    Thread.sleep(5000);
			    if(inp==true)
			    {
				  CommonMethod.typeTextOnEditBox(UserInputBox, input);
				  String UserXpath="//div[contains(text(),'"+input+"')]";
				  WebElement objectXpath=CommonMethod.findSingleElement(UserXpath);
				  inp2=CommonMethod.waitForObjectVisible(objectXpath, 20);
				  if(inp2==true)
				  {
					 CommonMethod.clickOn(objectXpath);
					 Thread.sleep(5000);
					  String UserLoginframeXpath="//iframe[contains(@title,'"+input+"')]";
					  WebElement Frameloded=CommonMethod.findSingleElement(UserLoginframeXpath);
					  inp4=CommonMethod.waitForObjectVisible(Frameloded, 40);
					  if(inp4==true)
					  {
						  CommonMethod.switchToFramebyxpath(Frameloded);
						  inp6=CommonMethod.waitForObjectVisible(SetupUserLoginButton, 40);
						 
						  if(inp6==true)
						  {  CommonMethod.clickOn(SetupUserLoginButton);
						     CommonMethod.switchToDefaultFrame();
						  	 Thread.sleep(7000);
						     inp7=CommonMethod.waitForObjectVisible(SearchBox, 40);
						  }
					  }
				   }
			     }
		  	  
	         if(inp==true&&inp2==true&&inp4==true&&inp6==true&&inp7==true)
				{opt=true;}
	         else
	         {opt=false;}
		    return opt;
		 }
		  
	     
		  
	  
	
	  
	   
	    
        
	}
	


