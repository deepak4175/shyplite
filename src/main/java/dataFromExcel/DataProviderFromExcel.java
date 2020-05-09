package dataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import baseClass.Mainclass;
import utilityClass.UtilityMethods;

public class DataProviderFromExcel {
	
	
	@DataProvider(name="InputData" )
	Object[][] ReadExcel(Method m) throws Exception
	{    
		 Object[][] output;
         System.out.println("Method name execution "+m.getName());
         int numberOfparameter=UtilityMethods.numberofParameter(m);
         String[] Parametertype=UtilityMethods.TypeofParameter(m);
         String methodName=m.getName();
         System.out.println("the path "+System.getProperty("user.dir")+Mainclass.config.getProperty("ExcelFile"));
         Mainclass.excelReader=new ExcelReader(System.getProperty("user.dir")+Mainclass.config.getProperty("ExcelFile"));
        
		 Mainclass.excelPath=new FileInputStream(System.getProperty("user.dir")+Mainclass.config.getProperty("ExcelFile"));
		 Mainclass.workbook= new XSSFWorkbook(Mainclass.excelPath);
		 Mainclass.worksheet= Mainclass.workbook.getSheet("sheet1");
		 int lastRowIndex= Mainclass.worksheet.getLastRowNum();
		 if(lastRowIndex==0)
		 {
			 lastRowIndex=1;
		 }
		 int LastmethodNameColumnIndex=(Mainclass.worksheet.getRow(0).getLastCellNum());
		 
		 boolean outputinExcelworksheet=Mainclass.excelReader.getmergedcellValue(methodName);
		 if(outputinExcelworksheet==true)
		 { 
			
			
		     int rowStartIndex=0,
		    	 columnStartIndex=Mainclass.globalVar.get("FirstIndexColumn"),
		         lastcolumnIndex=numberOfparameter+columnStartIndex;
		     
//checking null value in cell to avoid passing null value  to method
	         int rowWithValues=0;
		     for(int i=2;i<=lastRowIndex;i++)
		     {
		    	 if(Mainclass.excelReader.isRowEmpty(columnStartIndex, lastcolumnIndex, i)==false)
		    		 rowWithValues++;
		     }
		     if(rowWithValues==0)
		     {
		    	 rowWithValues=1;
		     }
		    System.out.println(" rowWithValues "+rowWithValues);
//setting value for final return  type
		    output=new String[rowWithValues-1][numberOfparameter];
		     for(int i=2;i<(rowWithValues+1);i++)
		    {  int columnCount=0;
			   for(int j=columnStartIndex;j<lastcolumnIndex;j++)
			      {	
				   output[rowStartIndex][columnCount]=Mainclass.worksheet.getRow(i).getCell(j).getStringCellValue();
				   	System.out.println(" the i value "+i+" the j value "+j+" output: "+output[rowStartIndex][columnCount]);
				   	columnCount++;
				   	
			      }
			     rowStartIndex++;
			 }
		 }
		 
		else
		 {	
			output=new String[0][0];
			System.out.println("Step: MethodValue does not exist in Excel started ");
			System.out.println("startColumnIndex "+LastmethodNameColumnIndex+"  numberOfparameter  "+numberOfparameter);
			int columnsize=(LastmethodNameColumnIndex+numberOfparameter)-1;
			System.out.println(" methodName "+methodName);
			
			
			Mainclass.excelReader.setDataInMergedCell(methodName,0, 0, LastmethodNameColumnIndex, columnsize);
			
			 System.out.println("Step: MethodValue does not exist in Excel");
			 
			
		 }
		    
		 return output;
	 }
	
	  
	
	}
