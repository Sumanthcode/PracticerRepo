package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TN1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String aTitle=driver.getTitle();
		String eTitle="google";
		/*if(aTitle.equals(eTitle))
		{
			Reporter.log("pass");
		}
		else
		{
			Reporter.log("fail");
			Assert.fail();
			
		}*/
		//Assert.assertEquals(aTitle, eTitle);//1.compare 2.report p/f
		SoftAssert s=new SoftAssert();// 1. only compare
		s.assertEquals(aTitle,eTitle); // driver.close will execute
		
		driver.close();
		
	s.assertAll();// 2. report p/f it should be last statement*/
		
		
	}


}
