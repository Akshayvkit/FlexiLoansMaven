package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import Utility.ExcelDataProvider;
import Utility.TakeScreenshot;


public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public String keyToSearch;

	@BeforeSuite
	public void setUpSuite() throws Throwable 
	{
		excel = new ExcelDataProvider();
	}
	
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity_Testing\\Sample3Swarup\\src\\main\\java\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/home");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-name = 'flights']")).click();
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void tearDown() throws IOException
	{	
		System.out.println("Capture Screenshot for me");
		TakeScreenshot.captureScreenshot(driver);		
	}
	
	@AfterSuite
	public void quitAll()
	{
		driver.quit();
	}

}
	


