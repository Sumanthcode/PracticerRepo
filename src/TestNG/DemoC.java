package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoC {
	@Test
	public void testA() throws MalformedURLException
	{
		URL node=new URL("http://192.168.43.194:4444/wd/hub");
		
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName("chrome");
		
		WebDriver driver=new RemoteWebDriver(node,browser);
		
		driver.get("http://www.google.com");
		//driver.quit();
		
		
	}

}
