package setupPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import baseClass.Mainclass;
import utilityClass.CommonMethod;

public class RegScreen extends Mainclass {
	
	@FindBy(xpath="//input[@name='name']")
	static WebElement FullName;
	
	@FindBy(xpath="//input[@name='email']")
	static WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	static WebElement password;
	
	@FindBy(xpath="//input[@name='contact']")
	static WebElement contact;
	
	@FindBy(xpath="//button[text()='Register']")
	static WebElement RegisterButton;
	
	@BeforeTest
	public void intiatepage() {
		System.out.println("page object initialize: "+new Object() {}.getClass().getName());
		PageFactory.initElements(driver,RegScreen.class);
		
	}
	
	public static boolean RegDetail()
	  { String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
        System.out.println("Function : "+methodName+"  has started.");
        CommonMethod.navigate(config.getProperty("RegURL"));
        System.out.println("Registration URL "+config.getProperty("RegURL"));
        boolean pageloaded=CommonMethod.waitForObjectVisible(FullName, 30);
		boolean opt =false, inp= false, inp2=false, inp3=false,inp4=false,inp5=false; 
	  
	    inp=CommonMethod.typeTextOnEditBox(FullName, prop.getProperty("username"));
	    inp2=CommonMethod.typeTextOnEditBox(email, prop.getProperty("email"));
	    inp2=CommonMethod.typeTextOnEditBox(password, prop.getProperty("password"));
	    inp4=CommonMethod.typeTextOnEditBox(contact, prop.getProperty("contact"));
	    inp5=CommonMethod.ElementDisplayedOnScreen(RegisterButton);
	    if(inp==true&&inp2==true&&inp3==true&&inp4==true)
	    {
	    	opt=true;
	    }
		  return opt;
	  }
		   

}
