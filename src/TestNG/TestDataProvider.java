package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	WebDriver driver;
  
	@DataProvider
	public String[][] getData()
	{
		String [][] data=new String[3][2];
		data[0][0]="abcd";
		data[0][1]="1234";
		
		data[1][0]="xvbs";
		data[1][1]="1676";
		
		data[2][0]="balankoppasumanth@gmail.com";
		data[2][1]="Nishanth@1996";
		
		return data;
	}
	
	@Test(dataProvider="getData")
  public void createUser(String un,String pw) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/user/login");
		
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		
		driver.navigate().refresh();
		driver.close();
		
  }
	/*@BeforeMethod
	public void beforMethod()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/user/login");
	}*/
}
