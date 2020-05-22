package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import dataFromExcel.ExcelReader;

//import basePackage.CommonMethod;
//import basePackage.PageGenerator;

public class Mainclass {
	
	
	public static WebDriver driver;
	//public  PageGenerator page1;
	public static WebDriverWait wait;
	//public CommonMethod commonMethod;
	public static SoftAssert softAssert=new SoftAssert();
	//public static Properties props=new Properties();
	public static Cell cell;	
	public static FileInputStream excelPath;
	public static XSSFWorkbook workbook;
	public static XSSFSheet worksheet;
	public static ExcelReader excelReader;
	public static HashMap<String, Integer> globalVar =new HashMap<String, Integer>();
	
	public static Properties prop=new Properties(); 
	public static Properties config=new Properties(); 
	public static Actions action;
	public static Select sel;
	@Parameters("browsername")
	@BeforeTest
	public  void setup(String browsername) throws IOException
	{ 
		//String browsername="chrome";
		System.out.println("setup method started");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
		propertysetup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//System.out.println("value: "+config.getProperty("Chromedriver"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+config.getProperty("Chromedriver"));
		driver=new ChromeDriver(options);
		action=new Actions(driver);
		System.out.println("chromedriver set");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
	    driver.get(config.getProperty("URL"));
	    
		}else
		if(browsername.equalsIgnoreCase("firefox"))
		{
		propertysetup();
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\MainResources\\ExecutableDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		action=new Actions(driver);
		System.out.println("firefox  set");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	    driver.get("https://hfclcorp--hfcuat.cs76.my.salesforce.com/");
		}else
		if(browsername.equalsIgnoreCase("internetExproler"))
		{
		propertysetup();
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\MainResources\\ExecutableDriver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		action=new Actions(driver);
		System.out.println("ie set");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	    driver.get("https://hfclcorp--hfcuat.cs76.my.salesforce.com/");
		}
		else
		{
			System.out.println("inserted input is not supported browser");
		}
	//	page1=new PageGenerator(driver);
	//	commonMethod=new CommonMethod();
	
		
	}
	void propertysetup() throws IOException
	{
		FileInputStream ob1=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\MainResources\\propertiesFile\\config.properties");
		FileInputStream ob2=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\MainResources\\propertiesFile\\props.properties");
		prop.load(ob2);
		config.load(ob1);		
	}
	
	@AfterSuite
	void teardown()
	{
		System.out.println("driver close");
		//driver.close();
	}
	
	public static String functionName()
	{
		return new Object() {}.getClass().getEnclosingMethod().getName();
	}
	/*public static void main(String args[]) throws IOException
	{
		Mainclass ob1=new Mainclass();
		ob1.setup();
	}*/
	
	


}
