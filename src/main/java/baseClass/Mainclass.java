package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

//import basePackage.CommonMethod;
//import basePackage.PageGenerator;

public class Mainclass {
	
	
	public static WebDriver driver;
	//public  PageGenerator page1;
	public static WebDriverWait wait;
	//public CommonMethod commonMethod;
	public static SoftAssert softAssert=new SoftAssert();
	public static Properties props=new Properties();
	public static Cell cell;	
	static FileInputStream excelPath;
	static XSSFWorkbook workbook;
	static XSSFSheet worksheet;
	public static Properties prop=new Properties(); 
	public static Properties config=new Properties(); 
	@Parameters("browsername")
	@BeforeClass
	public  void setup(String browsername) throws IOException
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
		propertysetup();
		System.out.println("value: "+config.getProperty("Chromedriver"));
		System.setProperty("webdriver.chrome.driver", config.getProperty("Chromedriver"));
		driver=new ChromeDriver();
		System.out.println("chromedriver set");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	    driver.get("https://hfclcorp--hfcuat.cs76.my.salesforce.com/");
	    
		}else
		if(browsername.equalsIgnoreCase("firefox"))
		{
		propertysetup();
		System.setProperty("webdriver.gecko.driver", "D:\\commontest\\src\\main\\java\\resources\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("firefox  set");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	    driver.get("https://hfclcorp--hfcuat.cs76.my.salesforce.com/");
		}else
		if(browsername.equalsIgnoreCase("internetExproler"))
		{
		propertysetup();
		System.setProperty("webdriver.ie.driver", "D:\\commontest\\src\\main\\java\\resources\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
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
		FileInputStream ob1=new FileInputStream("D:\\commontest\\Config\\config.properties");
		FileInputStream ob2=new FileInputStream("D:\\commontest\\Config\\Props.properties");
		prop.load(ob2);
		config.load(ob1);		
	}
	/*static {
		//System.setProperty("webdriver.chrome.driver", "D:\\commontest\\src\\main\\java\\resources\\chromedriver.exe");
		// driver=new ChromeDriver();	
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		
	}*/
	
	/*@BeforeTest
	public static WebDriverWait explicitWait()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait;
		
	}*/
	

	@AfterTest
	void teardown()
	{
		driver.close();
	}
	
	


}
