package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot 
{
	public static void captureScreenshot(WebDriver driver) throws IOException
	{

		TakesScreenshot obj = (TakesScreenshot)driver;
		File src = obj.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\Velocity_Testing\\PHPTRAVELS\\src\\main\\java\\Screenshots\\image3.png");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	
	}
}
