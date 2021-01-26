package TestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.BaseClass;
import Pages.LoginPage;

@Listeners(Utility.ListnersClasses.class)

public class TestClass extends BaseClass {

	LoginPage LP;
	
	 @Test
	 public void init1() throws InterruptedException 
	 {
		 
		 System.out.println("Final2");
		 LP = PageFactory.initElements(driver, LoginPage.class);
		 LP.FROM(excel.getStringData("sheet1", 0, 0));
		 Thread.sleep(5000);
		 LP.MUM();
		 Thread.sleep(5000);
		 LP.TO(excel.getStringData("sheet1", 0, 1));
		 Thread.sleep(5000);
		 LP.DEL();
		 Thread.sleep(5000);
		 LP.ECO();
		 Thread.sleep(5000);
		 LP.BUI();
		 LP.ADULT();
		 LP.CHILD();
		 LP.DEPART();
		 LP.SEARCH();
	 }
	

	 
}
