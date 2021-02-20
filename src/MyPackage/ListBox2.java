package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {
	
	
	static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.facebook.com");
		 WebElement month = driver.findElement(By.id("month"));
		 Select s=new Select(month);
		 
		 String r = s.getWrappedElement().getText();
		 System.out.println(r);
		
		

	}

}
