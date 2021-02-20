package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

public class CrossBroserTest {
	
	WebDriver driver;
	@BeforeTest
    @Parameters("Browser")
	
    public void test(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  
		  
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		  driver=new FirefoxDriver();
		  
		  
	  }
	  else
	  {
		  
	  }
	  
	}
	
	@Test(dataProvider="getData")
	public void testParameter(String un,String pw)
	{
		
	 driver.get("https://www.edureka.co/");
	// driver.findElement(By.xpath("//a[text()='Blog']")).click();
	 driver.findElement(By.linkText("Log In")).click();
	 
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys(un);
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pw);
	 
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	// driver.navigate().refresh();
	 
		
	  
  }
	
	@DataProvider
	public String[][] getData()
	{
		String [][] data=new String[3][2];
		
		data[0][0]="fhghk";
		data[0][1]="24566";
		
		data[1][0]="abcd";
		data[1][1]="44775";
		
		data[2][0]="balankoppasumanth@gmail.com";
		data[2][1]="Nishanth@1996";
		
		return data;
		
		
	
	}
	
  
 
	  
	  
  
}
