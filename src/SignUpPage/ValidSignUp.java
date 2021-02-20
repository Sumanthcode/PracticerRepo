package SignUpPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import KlearCard.KlearBase;

public class ValidSignUp{
	WebDriver driver;
	@BeforeMethod
	public void openApplication() {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://dev.klearcard.com");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	}
	
	@Test(dataProvider="testdata")
	public void companyInfo(String cn,String ca,String pc,String cno, String fn, String ln, String email,String pw, String rpw) throws InterruptedException
	{
		
		
		driver.findElement(By.name("name")).sendKeys(cn);
		driver.findElement(By.name("address")).sendKeys(ca);
		driver.findElement(By.name("zipCode")).sendKeys(pc);
		driver.findElement(By.name("number")).sendKeys(cno);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		String yourDetailActual = driver.findElement(By.xpath("(//div[@class='step active'])[2]/h2")).getText();
		
		String yourDetailexpected="Your Details";
		
		Thread.sleep(5000);
		
		Assert.assertEquals(yourDetailActual, yourDetailexpected);
		System.out.println("valid credential");
		
		driver.findElement(By.name("firstName")).sendKeys(fn);
		driver.findElement(By.name("lastName")).sendKeys(ln);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("_password")).sendKeys(rpw);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		
		
		
	}
	@DataProvider(name="testdata")
	public String[][] testData()
	{
		ReadCredentials config=new ReadCredentials("./data/b2.xlsx");
		
		int rows=config.getRowCount(0);
		
		String[][] credentials=new String[rows][9];
		
		for(int i=0;i<rows;i++)
		{
			credentials[i][0]=config.getData(0,i,0);
			credentials[i][1]=config.getData(0,i,1);
			credentials[i][1]=config.getData(0,i,2);
			credentials[i][1]=config.getData(0,i,3);
			credentials[i][1]=config.getData(0,i,4);
			credentials[i][1]=config.getData(0,i,5);
			credentials[i][1]=config.getData(0,i,6);
			credentials[i][1]=config.getData(0,i,7);
			credentials[i][1]=config.getData(0,i,8);
			
		}
		
		return credentials;
		
		
		
	}
		

}
