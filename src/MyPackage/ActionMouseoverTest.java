package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseoverTest {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.edureka.co/");
		WebElement categories = driver.findElement(By.xpath("(//span[contains(text(),'Categories')])[2]"));
		WebElement sf = driver.findElement(By.xpath("//a[@href='/software-testing-certification-courses']"));
		
		
		Actions act=new Actions(driver);
		
		/*act.moveToElement(categories).build().perform();
		act.moveToElement(sf).click().build().perform();*/
		
		
		act.moveToElement(categories).moveToElement(sf).click().build().perform();
		

	}

}
