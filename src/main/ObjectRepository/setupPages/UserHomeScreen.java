package setupPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import baseClass.Mainclass;
import utilityClass.CommonMethod;

public class UserHomeScreen extends Mainclass {
	
	@FindBy(xpath="//a/span[text()='Lead Management']")
	static WebElement leadManagement;
	
	@FindBy(xpath="//div/span[text()='App Launcher']/../../..//button")
	static WebElement appLauncher;
	
	@FindBy(xpath="//button[text()='View All']")
	static WebElement ViewAllButton;
	
	@FindBy(xpath="//a/div[text()='New']")
	static WebElement Newbutton;
	@BeforeTest
	public void intiatepage() {
		System.out.println("page object initialize");
		PageFactory.initElements(driver,UserHomeScreen.class);
		
	}
	
	public static boolean selectProject(String projectname)
	  { String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
        System.out.println("Function : "+methodName+"  has started.");
		boolean opt =false, inp= false, inp2=false, inp3=false,inp4=false; 
	  	String projectPath="//span/p[text()='"+projectname+"']";
	  	WebElement projectxpath=null;
	    
	    inp=CommonMethod.waitForObjectVisible(appLauncher, 40);
	  	    	inp2=CommonMethod.clickOn(appLauncher);
	    	
	    	    boolean inp5= CommonMethod.waitForObjectVisible(ViewAllButton, 50);
	    		if(inp5==true)
	    		{
	    			inp3=CommonMethod.clickOn(ViewAllButton);
	    			projectxpath=CommonMethod.waitForObjectVisible(projectPath, 50);
	    			if(projectxpath!=null)
	    			CommonMethod.clickOn(projectxpath);
	    		}
	    		else
	    		{
	    			CommonMethod.clickOn(appLauncher);
	    			CommonMethod.waitForObjectVisible(ViewAllButton, 50);
	    			CommonMethod.clickOn(ViewAllButton);
	    			projectxpath=CommonMethod.waitForObjectVisible(projectPath, 50);
	    			CommonMethod.clickOn(projectxpath);
	    		}
	    		
	    		
	    		inp4=CommonMethod.waitForObjectVisible(leadManagement, 40);
	    
	    	
	    	
	    
	    if(inp==true&&inp2==true&&inp3==true&&inp4==true)
	    {
	    	opt=true;
	    }
		  return opt;
	  }
		   

}
