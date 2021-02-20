package extrawork;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Sumanth");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select se=new Select(day);
		se.selectByIndex(1);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		
		s2.selectByIndex(1);
		
		List<WebElement> option = se.getOptions();
		int n=option.size();
		
		for(int i=0;i<n;i++)
		{
			WebElement w = option.get(i);
			String s = w.getText();
			System.out.println(s);
		}
	}
		
}
