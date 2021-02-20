package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	static 
	{
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//div[text()='Jobs']"))).build().perform();
	//Thread.sleep(15000);
	driver.findElement(By.xpath("//span[text()='Later']")).click();
	driver.findElement(By.xpath("//a[text()='Search Jobs']")).click();
	String s = driver.getTitle();
	System.out.println(s);
	}

}
