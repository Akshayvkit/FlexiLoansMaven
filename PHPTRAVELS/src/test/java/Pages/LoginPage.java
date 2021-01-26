package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
WebDriver driver;
String date = "2021-02-22";

    @FindBy(xpath = "(//a[@onClick = 'return false;'])[2]")
    private WebElement from;
    
    @FindBy(xpath = "//div[@class = 'select2-result-label']")
    private WebElement mumbai;
	
    @FindBy(xpath = "(//a[@onClick = 'return false;'])[3]")
	private WebElement to;
    
    @FindBy(xpath = "//div[@class = 'select2-result-label']")
    private WebElement delhi;
    
    @FindBy(xpath = "(//a[@class = 'chosen-single'])[1]")
    private WebElement eco;
	
    @FindBy(xpath = "(//li[@class = 'active-result'])[2]")
    private WebElement bui;

	@FindBy (xpath = "(//button[@type = 'button'])[7]")
	private WebElement adult;
	
	@FindBy (xpath = "(//button[@type = 'button'])[9]")
	private WebElement child;
	
	@FindBy (xpath = "//input[@id = 'FlightsDateStart']")
	private WebElement depart;
	
	@FindBy (xpath = "(//button[@type = 'submit'])[2]")
	private WebElement search;
	

	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void FROM(String str1)
	{
		from.click();
		from.sendKeys(str1);
	}

	public void MUM()
	{
		mumbai.click();
	}

	public void TO(String str2) 
	{
		to.click();
		to.sendKeys(str2);
	}
	
	public void DEL()
	{
		delhi.click();
	}
	
	public void ECO()
	{
		eco.click();
	}
	
	public void BUI()
	{
		bui.click();
	}

	public void ADULT()
	{
		adult.click();
	}
	
	public void CHILD()
	{
		for(int i = 0; i<=1; i++)
		{
			child.click();
		}
	}
	
	public void DEPART()
	{
		String date = "2021-02-22";
		Selectdatebyjs(driver, depart, date);
	}
	
	
	public static void Selectdatebyjs(WebDriver driver, WebElement depart, String date) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');",depart);
	}
	
	public void SEARCH()
	{
		search.click();
	}
}
