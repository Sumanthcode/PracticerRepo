package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaleElementReferenceException {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement w = driver.findElement(By.linkText("Gmail"));
		w.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		try
		{
			w.click();
		}
		catch(StaleElementReferenceException e)
		{
			w= driver.findElement(By.linkText("Gmail"));
			w.click();
	
		}
			
		}
}
