package setupPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath="//button[@title='New Application']")
	static WebElement NewApplicationButton;
			
	public static void initiatePage()
	{
		PageFactory.initElements(driver,OR_LoginPage.class);
	}
	public static boolean logintoApplication()
	{  boolean finalresult=true;   
	   boolean inp1=CommonMethod.typeTextOnEditBox(username, Mainclass.config.getProperty("username"));	   
	   boolean inp2=CommonMethod.typeTextOnEditBox(password, Mainclass.config.getProperty("password"));
	   boolean inp3=CommonMethod.clickOn(LoginButton);
	   boolean inp4=CommonMethod.waitForObjectVisible(NewApplicationButton,35);
	   boolean inp5=CommonMethod.clickOn(NewApplicationButton);
	   if(inp1==true&&inp2==true&&inp3==true&& inp4==true &&inp5==true)
	   {
		   finalresult=false;
	   }
	   return finalresult;
	}
	  
	   
	   
        
	}
	


