package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {
	static
	{
		System.setProperty("webdriver.chrome.driver","./webdriver.chrome.driver");
	}

	private void executeScript(String string) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com");
	      JavaScriptExecuter js = (JavaScriptExecuter)driver;
	      for(int i=0;i<2;i++)
	      {
	      js.executeScript("window.scrollBy(0,500)");
	      Thread.sleep(1000);
	      js.executeScript("window.scrollBy(0,-500)");
	      }
	}
}

	
	
