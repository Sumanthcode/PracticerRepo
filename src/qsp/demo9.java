package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.id("nqame2")).sendKeys("policy123");
		//driver.findElement(By.xpath="spritimg dob-sprit-img"]).click();
		driver.findElement(By.linkText("6")).click();
		driver.findElement(By.id("proceed")).click();
		
		

	}

}
