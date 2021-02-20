package MyPackage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("RPA");
		Thread.sleep(2000);
		List<WebElement> wb = driver.findElements(By.xpath("//span[contains(text(),'rpa')]"));
		wb.get(1).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		for(int i=0;i<6;i++)
		{
		js.executeScript("window.scrollBy(0,400)");
		}
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Photo/Rpa.png");
		FileUtils.copyFile(sr,dest);
		driver.close();
		
	}
		

}
