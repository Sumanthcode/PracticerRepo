package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		PomLoginPage p=new PomLoginPage(driver);
		
		p.setEmail("hgjdjdff");
		p.setPass("1234");
		p.setLog();
		Thread.sleep(2000);
		driver.navigate().refresh();
		p.setEmail("7026977123");
		p.setPass("SUBS1996");
		p.setLog();
		
		
		
		
		
		
		
		

	}

}
