package setupPages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseClass.Mainclass;
import baseClass.CommonMethod;

public class LoginPage extends Mainclass {
	
	
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
			
	public LoginPage()
	{
		PageFactory.initElements(driver,LoginPage.class);
	}
	public static void logintoApplication()
	{  
	  
	   
	   CommonMethod.typeTextOnEditBox(username, Mainclass.config.getProperty("username"));
	   
	   CommonMethod.typeTextOnEditBox(password, Mainclass.config.getProperty("password"));
	   CommonMethod.clickOn(LoginButton);
	   try{
		   CommonMethod.wait_elementClickable(NewApplicationButton,35);
		   CommonMethod.clickbutton(NewApplicationButton);
	   }
	   catch(TimeoutException e)
	   {
		   System.out.println(e);
	   }
	   
	   
        
	}
	

}
