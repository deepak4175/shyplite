package setupEnvironment;

import org.testng.Assert;
import org.testng.annotations.Test;

import setupPages.OR_LoginPage;

public class Test_Loginapplication {
	
	@Test
	void loginApplication()
	{
		boolean opt=OR_LoginPage.logintoApplication();
		Assert.assertEquals(opt, true);
		
	}

}
