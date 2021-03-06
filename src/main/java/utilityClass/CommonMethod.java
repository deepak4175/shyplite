package utilityClass;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import baseClass.Mainclass;



public class CommonMethod {
	//type text in input field
	
	public static boolean typeTextOnEditBox(WebElement objectAddress,String input)
	{  boolean opt=true;
	   String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
		try {   System.out.println("Step : "+methodName+" execution started");
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
				//Mainclass.driver.findElement(By.xpath(loginButton)).click();
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
		 Mainclass.wait=new WebDriverWait(Mainclass.driver, timeOutInSeconds);
			try {  System.out.println("Step : "+methodName+" execution started");
			        Mainclass.wait.until(ExpectedConditions.visibilityOf(objectAddress));
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
		 Mainclass.wait=new WebDriverWait(Mainclass.driver, timeOutInSeconds);
			try {  System.out.println("Step : "+methodName+" execution started");
			       Mainclass.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectAddress)));
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
			       Mainclass.driver.navigate().to(URL);
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				opt=false;
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	
	public static boolean ElementDisplayedOnScreen(WebElement objectAddress )

	{
		 boolean opt=true;
		 String methodName=new Object() {}.getClass().getEnclosingMethod().getName();
			try {  System.out.println("Step : "+methodName+" execution started");
			       objectAddress.isDisplayed();
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
			       opt=Mainclass.driver.findElement(By.xpath(inp1));
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
			       Mainclass.driver.switchTo().frame(inp1);
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
			       Mainclass.driver.switchTo().frame(inp1);
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
			       Mainclass.driver.switchTo().frame(inp1);
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
			       Mainclass.driver.switchTo().defaultContent();
			       System.out.println("Step : "+methodName+" executed ssuccessfully");
			       return opt;
				}
			catch(Exception e){
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	
	
	
	
}