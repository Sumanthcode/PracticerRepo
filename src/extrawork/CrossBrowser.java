package extrawork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class CrossBrowser {
	
	WebDriver driver;
	
	
	public void chromeDriver()
	{
		String expected;
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,100)");
		driver.findElement(By.cssSelector("a[href = '/projects']")).click();
	}
	
	public void fireFOxDriver()
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		
	}
	
	public void ieDriver()
	{
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
	}

	public static void main(String[] args)  throws Exception{
		CrossBrowser cb=new CrossBrowser();
		
		cb.fireFOxDriver();
		cb.chromeDriver();
		cb.ieDriver();

	}

}
