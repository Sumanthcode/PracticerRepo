package extrawork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement wb = driver.findElement(By.tagName("a"));
	//	WebElement wb = driver.findElement(By.xpath("//a[@class='gb_g']"));
		String s = wb.getText();
		System.out.println(s);
		

	}

}
