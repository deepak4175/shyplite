package setupEnvironment;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Mainclass;
import setupPages.OR_LoginPage;

public class Test_Loginapplication extends Mainclass {
	
	@Test
	void loginApplication()
	{   
	   
		OR_LoginPage.OR_setupLoginPage();
		boolean opt=OR_LoginPage.logintoApplication();
		softAssert.assertEquals(opt, true);
		boolean opt1=OR_LoginPage.navigateToSetup();
		softAssert.assertEquals(opt1, true);
		
	}
	@Test(dependsOnMethods= {"loginApplication"})
	void selectLoginUser() throws InterruptedException
	{
		boolean opt=OR_LoginPage.logInThroughUser(config.getProperty("salesUsername"));
		softAssert.assertEquals(opt, true);
	}
}

