package MyPackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBrowserPopup1 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String s: windows)
		{
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
		}
		
		

	}

}
