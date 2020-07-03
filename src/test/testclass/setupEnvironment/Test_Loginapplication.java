package setupEnvironment;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.Mainclass;
import setupPages.OR_LoginPage;
import setupPages.RegScreen;

public class Test_Loginapplication extends Mainclass {
	//OR_LoginPage loginpage=new OR_LoginPage();
	@Test(priority=0)
	void loginApplication()
	{   
	   
		//OR_LoginPage.OR_setupLoginPage();
		boolean opt=OR_LoginPage.logintoApplicationwithinvalidCredential();
		softAssert.assertEquals(opt, true);
		
		
	}
	@Test(dependsOnMethods= {"loginApplication"},priority=1)
	void forgotPAssword() throws InterruptedException
	{
		boolean opt1=OR_LoginPage.navigateToforgotpassword();
		softAssert.assertEquals(opt1, true);
	}
	
	@Test(priority=2)
	void signUpScreen()
	{boolean opt=false;
	boolean opt1=OR_LoginPage.navigateToSignUP();
	softAssert.assertEquals(opt1, true);
	}
	
}

