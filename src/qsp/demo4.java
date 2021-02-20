package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("win");
		WebElement a = driver.switchTo().activeElement();
		a.sendKeys("win");
		
		String s = "//span[contains(text(),'win')]";
		List<WebElement> ase = driver.findElements(By.xpath(s));
		int count = ase.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement b = ase.get(i);
		String text = b.getText();
		System.out.println(text);
		}
		ase.get(4).click();
		Thread.sleep(1000);
		String str = driver.getTitle();
		System.out.println(str);
				
		driver.navigate().back();

	}

}
