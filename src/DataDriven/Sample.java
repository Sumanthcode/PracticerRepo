package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get(" https://community.cloud.automationanywhere.digital/");
		//	driver.findElement(By.xpath("//div[text()='Login']")).click();
			
			driver.findElement(By.name("username")).sendKeys("balankoppasumanth@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Nishanth@1996");
			driver.findElement(By.name("submitLogin")).click();
			
			System.out.println(driver.getTitle());

	}

}
