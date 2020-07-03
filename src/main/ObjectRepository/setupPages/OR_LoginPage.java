package setupPages;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import baseClass.Mainclass;
import utilityClass.CommonMethod;

public class OR_LoginPage extends Mainclass {
	
	
	@FindBy(xpath="//input[@name='emailID']")
	 static WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	static WebElement password;
	
	@FindBy(xpath="//button[text()='Log In']")
	static WebElement LoginButton;
	
	@FindBy(xpath="//div[text()='Incorrect emailID or password. Please try again.']")
	static WebElement errormessage;
	
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	static WebElement forgotPassword;
	
	@FindBy(xpath="//a[text()='Sign up']")
	static WebElement SignUp;
	
	
	@BeforeTest
	public void OR_setupLoginPage()
	{   System.out.println("page object initialize:  "+new Object() {}.getClass().getName());
		PageFactory.initElements(driver,OR_LoginPage.class);
		
	}
	public static boolean logintoApplicationwithinvalidCredential()
	{  boolean finalresult=false;  
	   String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
	   System.out.println("Function : "+methodName+"  has started.");
	   boolean inp1=CommonMethod.typeTextOnEditBox(username, config.getProperty("username"));	   
	   boolean inp2=CommonMethod.typeTextOnEditBox(password, config.getProperty("password"));
	   boolean inp3=CommonMethod.clickOn(LoginButton);
	   boolean inp4=CommonMethod.ElementDisplayedOnScreen(errormessage);
	   
	  	   if(inp1==true&&inp2==true&&inp3==true&&inp4==true)
	   {
		   finalresult=true;
	   }
	   return finalresult;
	  }
	   public static boolean navigateToforgotpassword()
	  { String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
	     System.out.println("Function : "+methodName+"  has started.");
		boolean inp=CommonMethod.ElementDisplayedOnScreen(forgotPassword);
		return inp;
		 
	  }
	   
	   public static boolean navigateToSignUP()
		  { String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
		     System.out.println("Function : "+methodName+"  has started.");
			boolean inp=CommonMethod.ElementDisplayedOnScreen(SignUp);
			return inp;
			 
		  }
	   
	  
	    
        
	}
	


