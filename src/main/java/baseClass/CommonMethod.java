package baseClass;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CommonMethod extends Mainclass{
	public static StackTraceElement str;
	public static boolean typeTextOnEditBox(WebElement objectAddress,String input)
	{  boolean opt=true;
	   String methodName=str.getMethodName();
		try {  System.out.println("Step : "+methodName+" execution started");
				//driver.findElement(By.xpath(username)).sendKeys(input);
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
	public static boolean clickOn(WebElement objectAddress)
	{  boolean opt=true;
	   String methodName=str.getMethodName();
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
	
	public static boolean waitForObjectVisible(WebElement objectAddress,int timeOutInSeconds)
	{
		 boolean opt=true;
		 String methodName=str.getMethodName();
		 wait=new WebDriverWait(driver, timeOutInSeconds);
			try {  System.out.println("Step : "+methodName+" execution started");
			       wait.until(ExpectedConditions.visibilityOf(objectAddress));
			       System.out.println("Step : "+methodName+" executed ssuccesfully");
			       return opt;
				}
			catch(Exception e){
				opt=false;
				System.out.println("Step : "+methodName+" Failed due to : "+e);
				return opt;
				}
	}
	
			
		
		
	
	
}