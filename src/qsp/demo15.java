package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class demo15 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http:/demo.actitime.com");
		WebElement unTB = driver.findElement(By.id("username"));
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		unTB.sendKeys("admin");

	}

}
