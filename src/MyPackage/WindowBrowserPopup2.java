package MyPackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//printing only child browser window title and closing
public class WindowBrowserPopup2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		
		String parent = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String s: windows)
		{
			if(!parent.equalsIgnoreCase(s))
			{
				String child = driver.switchTo().window(s).getTitle();
				System.out.println(child);
				driver.close();
				
			}
		}
	}

}
