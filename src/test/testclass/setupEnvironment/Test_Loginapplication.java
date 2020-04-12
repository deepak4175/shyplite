package setupEnvironment;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Mainclass;
import setupPages.OR_LoginPage;

public class Test_Loginapplication extends Mainclass {
	
	@Test
	void loginApplication()
	{   
	     //OR_LoginPage login=new OR_LoginPage();
		OR_LoginPage.OR_setupLoginPage();
		boolean opt=OR_LoginPage.logintoApplication();
		Assert.assertEquals(opt, true);
		
	}

}
