package dataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import baseClass.Mainclass;

public class DataProviderFromExcel {
	
	
	@DataProvider(name="InputData")
	Object[][] ReadExcel() throws Exception{
	
		
		 Mainclass.excelPath=new FileInputStream("D:\\commontest\\src\\main\\java\\resources\\UserInput.xlsx");
		 Mainclass.workbook= new XSSFWorkbook(Mainclass.excelPath);
		 Mainclass.worksheet= Mainclass.workbook.getSheet("sheet1");
		int lastRowIndex= Mainclass.worksheet.getLastRowNum();
		int startColumnIndex=  Mainclass.worksheet.getRow(1).getLastCellNum();
		String  output[][]=new String[lastRowIndex+1][startColumnIndex];
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			for(int j=0;j<startColumnIndex;j++)
			{	
		    	output[i][j]=Mainclass.worksheet.getRow(i).getCell(j).getStringCellValue();
		    	
			}
			
		
		}
		
	return output;
	}
	
	
	}
