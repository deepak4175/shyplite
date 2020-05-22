package utilityClass;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.Mainclass;



public class CommonMethod extends Mainclass{
	//type text in input field
	public static boolean typeTextOnEditBox(WebElement objectAddress,String input)
	{  boolean opt=true;
	   String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
		try {  System.out.println("Step : "+methodName+" execution started");
				objectAddress.sendKeys(input);
				System.out.println("Step : "+methodName+" executed ssuccesfully");
				return opt;
			}
		catch(Exception e){
			opt=false;
			System.out.println("Step : "+methodName+" Failed due to : "+e);
			return opt;
		}
		
	}
	//click on webelement
	public static boolean clickOn(WebElement objectAddress)
	{  boolean opt=true;
	   String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
		try {  System.out.println("Step : "+methodName+" execution started");
				//driver.findElement(By.xpath(loginButton)).click();
		        objectAddress.click();
				System.out.println("Step : "+methodName+" executed ssuccesfully");
				return opt;
			}
		catch(Exception e){
			opt=false;
			System.out.println("Step : "+methodName+" Failed due to : "+e);
			return opt;
			}
	}
	// wait for object visible
	public static boolean waitForObjectVisible(WebElement objectAddress,int timeOutInSeconds)
	{
		 boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
		 wait=new WebDriverWait(driver, timeOutInSeconds);
			try {  System.out.println("Step : "+methodName+" execution started");
			       wait.until(ExpectedConditions.visibilityOf(objectAddress));
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				opt=false;
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				
				}
			return opt;
	}
	public static boolean waitForObjectVisible(String objectAddress,int timeOutInSeconds)
	{    boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
		 wait=new WebDriverWait(driver, timeOutInSeconds);
			try {  System.out.println("Step : "+methodName+" execution started");
			       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectAddress)));
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       //return opt;
				}
			catch(Exception e){
				opt=false;
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				
				}
			return opt;
	}
	//navigate to URL
	public static boolean navigate(String URL)
	{
		 boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       driver.navigate().to(URL);
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				opt=false;
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	
	public static String stringConcat(String inp1,String inp2)
	{
		 String opt="";
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       opt=inp1.concat(inp2);
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	public static WebElement findSingleElement(String inp1)
	{
		WebElement opt=null;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       opt=driver.findElement(By.xpath(inp1));
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				   System.out.println("Step : "+methodName+" Failed due to : "+e);
				   return opt;
				}
	}
	
	public static boolean switchToFramebyIndex(int inp1)
	{
		boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       driver.switchTo().frame(inp1);
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	
	

	public static boolean switchToFramebyxpath(WebElement inp1)
	{
		boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       driver.switchTo().frame(inp1);
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	

	public static boolean switchToFramebystring(String inp1)
	{
		boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       driver.switchTo().frame(inp1);
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	
	

	public static boolean switchToDefaultFrame()
	{
		boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       driver.switchTo().defaultContent();
			       System.out.println("Step : "+methodName+" executed ssuccessfully");
			       return opt;
				}
			catch(Exception e){
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	
	public static boolean selectDropdownByVisibleText(WebElement ele, String input)

	{
		boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");		
				   sel=new Select(ele);
				   sel.selectByVisibleText(input);
			       System.out.println("Step : "+methodName+" executed successfully");
			       return opt;
				}
			catch(Exception e){
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}


	public static boolean pressEnterKey()
	{boolean opt=true;
	  try {
		Mainclass.action.sendKeys(Keys.ENTER).build().perform();
	  	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	  	return opt;
	}
	
	public static boolean pressKey(String input, int numberOfTimes )
	{boolean opt=true;
	 String keysName=input.toLowerCase().trim();
	  try {
		  
	switch (keysName) {
	case "enter":
		       for(int i=0;i<numberOfTimes;i++) {
		        Mainclass.action.sendKeys(Keys.ENTER).build().perform();
		       }break;
	case "pageup":
		       for(int i=0;i<numberOfTimes;i++) {
                Mainclass.action.sendKeys(Keys.ARROW_UP).build().perform();
		       }break;
	case "pagedown":
	           for(int i=0;i<numberOfTimes;i++) {
        		Mainclass.action.sendKeys(Keys.ARROW_DOWN).build().perform();
	        	 }break;
	case "backspace":
		       for(int i=0;i<numberOfTimes;i++) {
                Mainclass.action.sendKeys(Keys.BACK_SPACE).build().perform();   
		       }break;
	case "rightarrow":
			  for(int i=0;i<numberOfTimes;i++) {
				Mainclass.action.sendKeys(Keys.ARROW_RIGHT).build().perform();
			  }	break;
	case "leftarrow":
		      for(int i=0;i<numberOfTimes;i++) {
				Mainclass.action.sendKeys(Keys.ARROW_LEFT).build().perform();
		      }break;
	case "arrowright":
		      for(int i=0;i<numberOfTimes;i++) {
				Mainclass.action.sendKeys(Keys.ARROW_RIGHT).build().perform();
		      }break;
	case "arrowleft":
	      	 for(int i=0;i<numberOfTimes;i++) {
				Mainclass.action.sendKeys(Keys.ARROW_LEFT).build().perform();
	      	 }
	      	break;
		
		

	default:
		    System.out.println(" valid key for this function is enter, pageup, pagedown, backspace, rightarrow, leftarrow");
		break;
	}
		Mainclass.action.sendKeys(Keys.ENTER).build().perform();
	  	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	  	return opt;
	}

	public static void pressTwokey(String key1,String key2)
	{String opt=key1.trim().toLowerCase();
	  try {
		  
		  switch (opt) {
		case "ctrl":
			         Mainclass.action.sendKeys(Keys.chord(Keys.CONTROL,key2)).build().perform();
			         break;
		case "control":
					Mainclass.action.sendKeys(Keys.chord(Keys.CONTROL,key2)).build().perform();
					break;
			
			

		default:
			break;
		}
	            
	  	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	  	
	}
}