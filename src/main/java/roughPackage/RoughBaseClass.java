package roughPackage;

import org.apache.poi.ss.util.CellRangeAddress;

import baseClass.Mainclass;
import dataFromExcel.ExcelReader;
import roughTestPackage.RoughTest1;
import utilityClass.UtilityMethods;

public class RoughBaseClass extends ExcelReader{
	
	public RoughBaseClass(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}


	public String[][] testArray()
	{   int a=7;
		String v1[][] ;
		String v2[];
		if(a>5)
		{
			v1=new String[2][1];
		}
		else
		{
			v1=new String[5][1];
		}
		v2=new String[3];
		
		return v1;
		
	}
	
	public void checkemptyRow()
	{
		System.out.println(" the row status :"+isRowEmpty(0, 2, 5));
	}

	/*public  String stringConcat(String inp1,String inp2)
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
	}*/
	public void celldata()
	{
		System.out.println("get cell data OPT String  : "+getCellData("Sheet1", 2, 1));
		System.out.println("get cell data OPT String and string col name  : "+getColumnCount("Sheet1",0));
		//System.out.println("get cell data OPT String  : "+getCellRowNum("Sheet1","0","1"));
		
		
	}
    public void setvalue(String inp1,String innp3,int inp4)
    {
    	//setCellData(sheet, "Method3", 4, "value1");
    	//System.out.println(" The method is executed 1 ");
    	//setCellData("Sheet1", "Method4", 5, "value2");
    	//addColumn(sheet, "method13",10);
    }
		
	public void methodDisplay()
	{
		System.out.println("get cell data OPT String  : "+getmergedcellValue("Method1"));
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			RoughBaseClass ob1=new RoughBaseClass("D:\\baseProject\\src\\main\\MainResources\\ExecutableDriver\\UserInput.xlsx");
			//ob1.checkemptyRow();
			
			UtilityMethods.getParameterName(RoughTest1.class.getDeclaredMethod("Method23",String.class,String.class,String.class));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
