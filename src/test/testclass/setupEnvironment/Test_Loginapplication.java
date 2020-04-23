package setupEnvironment;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.Mainclass;
import setupPages.OR_LoginPage;
import setupPages.UserHomeScreen;

public class Test_Loginapplication extends Mainclass {
	
	@Test(priority=0)
	void loginApplication()
	{   
	   
		//OR_LoginPage.OR_setupLoginPage();
		boolean opt=OR_LoginPage.logintoApplication();
		softAssert.assertEquals(opt, true);
		boolean opt1=OR_LoginPage.navigateToSetup();
		softAssert.assertEquals(opt1, true);
		
	}
	@Test(dependsOnMethods= {"loginApplication"},priority=1)
	void selectLoginUser() throws InterruptedException
	{
		boolean opt=OR_LoginPage.logInThroughUser(config.getProperty("salesUsername"));
		softAssert.assertEquals(opt, true);
	}
	
	@Test(priority=2)
	void selectproject()
	{boolean opt=false;
		opt=UserHomeScreen.selectProject(prop.getProperty("ProjectName"));
		softAssert.assertEquals(opt, true);
	}
	
}

