package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class acti {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do;jsessionid=0485E5137B2E4B0751CCFB9E17FA501F");
		String s1 = driver.getTitle();
		System.out.println(s1);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Enter"));
		String s2 = driver.getTitle();
		System.out.println(s2);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		wait.until(ExpectedConditions.titleContains("Login"));
		String s3=driver.getTitle();
		System.out.println(s3);
		
		
		

	}

}
