package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.DAYS);

		driver.get("https://www.yatra.com");
		//driver.findElement(By.id("BE_flight_origin_city")).sendKeys("ban");
		WebElement s = driver.switchTo().activeElement();
		s.sendKeys("ba");
		//Thread.sleep(3000);
		
		//String x="//p[contains(text(),'alore')]";
		//List<WebElement> ase = driver.findElements(By.xpath(x));
		//int count = ase.size();
		//System.out.println(count);
		/*for(int i=0;i<count;i++)
		{
			 WebElement a = ase.get(i);
			 String b = a.getText();
			 System.out.println(b);
			
		}
		
		
		 ase.get(1).click(); */ 

	}

}
