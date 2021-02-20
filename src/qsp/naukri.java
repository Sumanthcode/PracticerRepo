package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(9000);
		// Alert x = driver.switchTo().alert();
		// x.accept();
       driver.findElement(By.id("block")).click();
		
		driver.findElement(By.xpath("//div[text()='jobs']"));
		driver.findElement(By.xpath("//a[text()='search jobs']")).click();
		
		

	}

}
