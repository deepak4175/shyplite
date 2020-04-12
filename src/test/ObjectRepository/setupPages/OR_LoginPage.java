package setupPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import baseClass.Mainclass;
import baseClass.CommonMethod;

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
	
	//@BeforeTest		
	public static void OR_setupLoginPage()
	{   System.out.println("page object initialize");
		PageFactory.initElements(driver,OR_LoginPage.class);
	}
	public static boolean logintoApplication()
	{  boolean finalresult=false;   
		System.out.println("innput web element "+username+"  input value "+Mainclass.config.getProperty("username"));
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
	  
	   
	   
        
	}
	


