package extrawork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.get("https://www.ksrtc.in");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		for(int i=0;i<1;i++){
		j.executeScript("scrollBy(0,300)");
		}
			
		
		String s="//button[@class='btn btn-primary btn-lg btn-block btn-booking']";
		driver.findElement(By.xpath(s)).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Banglore");
		
		
		
		
		
		
		
		
		
	}

}
