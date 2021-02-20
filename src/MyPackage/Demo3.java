package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("RPA");
		Thread.sleep(2000);
		List<WebElement> wb = driver.findElements(By.xpath("//span[contains(text(),'rpa')]"));
		
		int n=wb.size();
		System.out.println(n);
            for(int i=0;i<n;i++)
     		{
			    WebElement s = wb.get(i);
			    s.getText();
			    System.out.println(s.getText());
	        }
	
	       	wb.get(1).click();		
		

	}

}
