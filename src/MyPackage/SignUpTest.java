package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDriven.ReadExcelFile;
import junit.framework.Assert;

public class SignUpTest {
	WebDriver driver;
  @Test(priority=1)
  public void f1() {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }
  
  @Test(dataProvider="signdata",priority=1)
  public void f2() {
	  driver.get("https://dev.klearcard.com");
	  driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	  WebElement reg = driver.findElement(By.xpath("//h3[text()='Registration']"));
	  String expected="Registration";
	  
	  if(expected.equals(reg.getText()))
	  {
		  driver.findElement(By.name("name")).sendKeys("ntt data");
			driver.findElement(By.name("address")).sendKeys("global");
			driver.findElement(By.name("zipCode")).sendKeys("560098");
			driver.findElement(By.name("number")).sendKeys("181004");
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			driver.findElement(By.name("firstName")).sendKeys(fn);
			driver.findElement(By.name("lastName")).sendKeys(ln);
			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("password")).sendKeys(pw);
			driver.findElement(By.name("_password")).sendKeys(rpw);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			
			
	  }
	  
	  
  }
  
  @DataProvider(name="signdata")
	public String[][] testData()
	{
		ReadExcel config=new ReadExcel("./data/b2.xlsx");
		
		int rows=config.getRowCount(0);
		
		String[][] credentials=new String[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			credentials[i][0]=config.getData(0,i,0);
			credentials[i][1]=config.getData(0,i,1);
			
		}
		
		return credentials;
		
	}
  
  
}
