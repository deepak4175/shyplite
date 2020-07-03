package utilityClass;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import baseClass.Mainclass;


public class ListenerClass implements ITestListener {
	
	ExtentReports reports=ExtentReportClass.createInstance(System.getProperty("user.dir")+"\\test-output\\ExtentReports\\"+UtilityMethods.extentReportName()+".html");

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
    
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentReportClass.test=reports.createTest(result.getName());
		ExtentReportClass.test.log(Status.PASS,"Test passed ");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentReportClass.test=reports.createTest(result.getName());
		ExtentReportClass.test.fail("test failed").log(Status.FAIL,result.getThrowable());
		try {
			
			ExtentReportClass.test.addScreenCaptureFromPath(UtilityMethods.screenshot(result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		reports.flush();
		
	}

}
