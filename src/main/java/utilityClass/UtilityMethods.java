package utilityClass;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClass.Mainclass;
import dataFromExcel.ExcelReader;

public class UtilityMethods extends Mainclass {
	
	public static String screenshot(String filename) 
	{
		try {
		File srcLocation=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	FileUtils.copyFile(srcLocation, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots"+filename+".png"));
	 	}
		catch(IOException e) {
			System.out.println("unable to take screenshot");
		}
		return System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots"+filename+".png";
		
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
	
	public static int  numberofParameter(Method m)
	{
		  Class<?>[] parameter= m.getParameterTypes();
	         return parameter.length;
	}

	public static String[]  TypeofParameter(Method m)
	{
		  String[] str = null;
		try {
			Class<?>[] parameter= m.getParameterTypes();
			  str = new String[parameter.length];
			  for(int i=0;i<str.length;i++)
			     {
			    	str[i]=parameter[i].getName();
			    	if(str[i].contains("String"))
			    	{
			    	 str[i]=str[i].substring(10);
			    	}
			     }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return str;
			
	         
	}
	
	public static boolean checkMethodExistinExcel(Method m,String path,String sheetname)
	{
		boolean opt=false;
		ExcelReader excel=new ExcelReader(path);
		excel.getColumnCount(sheetname,0);
		return opt;
	}
	public static  void getParameterName(Method m)
	{  System.out.println(" the method name "+m.getName());
		Parameter[] para=m.getParameters();
		for (Parameter p : para) {
			if (p.isNamePresent()==false) {
				System.out.println(" The parameter " +p.getName());
			}
		}
		
		String opt=para.toString();
		System.out.println(" the output "+opt);
	}
	
}
