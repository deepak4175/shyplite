package baseClass;

import org.openqa.selenium.By;



class CommonMethod extends Mainclass{
	public static StackTraceElement str;
	public static boolean typeTextOnEditBox(String objectPath,String input)
	{  boolean opt=true;
	   String methodName=str.getMethodName();
		try {  System.out.println("Step : "+methodName+" execution started");
				driver.findElement(By.xpath(objectPath)).sendKeys(input);
				System.out.println("Step : "+methodName+" executed ssuccesfully");
			}
		catch(Exception e){
			opt=false;
			System.out.println("Step : "+methodName+" Failed");
			}
		finally {return opt;
			}
		
	}
	public static boolean clickOn(String objectPath)
	{  boolean opt=true;
	   String methodName=str.getMethodName();
		try {  System.out.println("Step : "+methodName+" execution started");
				driver.findElement(By.xpath(objectPath)).click();;
				System.out.println("Step : "+methodName+" executed ssuccesfully");
			}
		catch(Exception e){
			opt=false;
			System.out.println("Step : "+methodName+" Failed");
			}
		finally {
			
			return opt;
			}
		
	}
	
}