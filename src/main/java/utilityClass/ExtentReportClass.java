package utilityClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportClass {
	
	static ExtentReports extent;
	static ExtentTest test;
	
	public static ExtentReports createInstance(String extentreportPath)
	{
		ExtentHtmlReporter configExtent=new ExtentHtmlReporter(extentreportPath);
		  configExtent.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	      configExtent.config().setChartVisibilityOnOpen(true);
	      configExtent.config().setTheme(Theme.STANDARD);
	      configExtent.config().setDocumentTitle("report title.html");
	      configExtent.config().setEncoding("utf-8");
	      configExtent.config().setReportName("Test report");
	      
	      extent=new ExtentReports();
	      extent.attachReporter(configExtent);
		
	      return extent;
	}

}
