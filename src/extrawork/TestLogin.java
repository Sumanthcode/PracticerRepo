package extrawork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http:/demo.actitime.com");
		loginpom l=new loginpom(driver);
		
		l.setUserName("abcd");
		l.setPassword("xyz");
		l.clickLogin();
		
		Thread.sleep(2000);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLogin();
		


	}
}
