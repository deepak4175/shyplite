package utilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClass.Mainclass;

public class UtilityMethods extends Mainclass {
	
	public static String screenshot(String filename) 
	{
		try {
		File srcLocation=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	FileUtils.copyFile(srcLocation, new File("D:\\baseProject\\src\\test\\resources\\screenshots\\"+filename+".png"));
	 	}
		catch(IOException e) {
			System.out.println("unable to take screenshot");
		}
		return "D:\\baseProject\\src\\test\\resources\\screenshots"+filename+".png";
		
	}
	public static String extentReportName()
	
	{
		Date date=new Date();
		DateFormat dateformat=new SimpleDateFormat("dd_MM_yyyy hh_mm");
		String stringDate=dateformat.format(date);
		String finaldate=stringDate.replace(" ", "_");
		
		String finaloutput= finaldate+" Extent Report";
		System.out.println(finaloutput);
		return finaloutput;
	}

}
