package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Demo1 {
	WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public void chromeBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7026977123");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("SUBS1996");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		
	}
	
	public void firefoxBrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		String s = driver.getTitle();
		System.out.println(s);
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://mail.google.com"))
		{
			System.out.println("we are in right page");
		}
		else
			System.out.println("we are not in right page");
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.chromeBrowser();
		//d.firefoxBrowser();
		

	}

}
