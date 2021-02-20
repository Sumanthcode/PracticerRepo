package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class CompareGoogleImg {
  WebDriver driver;
  @Test
  public void f() {
	  
	  String aTagName=driver.findElement(By.tagName("img")).getTagName();
	  System.out.println(aTagName);
	  
	 /* String eTagName="img";
	  
	 Assert.assertEquals(aTagName,eTagName);
	  Assert.fail(); // if i want to fail this explicitly
	  driver.close(); // if above statement fails, driver.close() will not execute
*/  
	  String eTagName="img";
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(aTagName,eTagName); // even if this statement fails, below statemenys will execute 
	  driver.close();
	  
	  s.assertAll();
	  
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  
  }
}
