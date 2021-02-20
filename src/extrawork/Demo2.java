package extrawork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement wb = driver.findElement(By.id("hplogo"));
		String s = wb.getTagName();
		 if(s.equals("img"))
		 {
			 System.out.println("it is image");
		 }
		 else
			 System.out.println("its not a image");
	}
		
}
