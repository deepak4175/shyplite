package roughTestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataFromExcel.DataProviderFromExcel;

public class RoughTest1 {
	
	@Test(dataProvider="InputData",dataProviderClass =DataProviderFromExcel.class,priority=0)
	void Method43(String a, String b,String c)
	{ System.out.println("The method 43 started");
	  System.out.println("The value of Int a: "+a+" int b: "+b+" third value: "+c);
	}
	
	@Test(dataProvider="InputData",dataProviderClass =DataProviderFromExcel.class,priority=1)
	void Method44(String a, String b,String c)
	{ System.out.println("The method 44 started");
	  System.out.println("The value of Int a: "+a+" int b: "+b+" third value: "+c);
	}
	
	@Test(dataProvider="InputData",dataProviderClass =DataProviderFromExcel.class,priority=2)
	void Method45(String a, String b,String c)
	{ System.out.println("The method 45 started");
	  System.out.println("The value of Int a: "+a+" int b: "+b+" third value: "+c);
	}
	
	@Test(dataProvider="InputData",dataProviderClass =DataProviderFromExcel.class,priority=2)
	void Method47(String a, String b,String c)
	{ System.out.println("The method 45 started");
	  System.out.println("The value of Int a: "+a+" int b: "+b+" third value: "+c);
	}
	
	void Method23(String inpt1,String inpt2,String inpnt4)
	{
		
	}

}
