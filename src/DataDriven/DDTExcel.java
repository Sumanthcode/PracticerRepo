package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class DDTExcel {
	
	WebDriver driver;
	
	
	@Test(dataProvider="testdata")
	public void demoProject(String un,String pw) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(" https://community.cloud.automationanywhere.digital/");
	//	driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("submitLogin")).click();
		String actual = driver.getTitle();
		String expected="Control Room | Log in | Automation Anywhere";
		
		Thread.sleep(5000);
		
		
		/*if(actual.equals(expected))
		{
			System.out.println("valid credential");
		}
		else
			System.out.println("invalid");*/
		
		Assert.assertTrue(driver.getTitle().matches("Control Room | Log in | Automation Anywhere"),"invalid credential");
		System.out.println("valid credential");
	}
	
	@DataProvider(name="testdata")
	public String[][] testDataFeed()
	{
		ReadExcelFile config=new ReadExcelFile("./data/b1.xlsx");
		
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
