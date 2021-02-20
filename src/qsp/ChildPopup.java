package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.id("block")).click();
		 Set<String> s = driver.getWindowHandles();
		 int n = s.size();
		System.out.println(n);
		for(String j : s)
		{
			driver.switchTo().window(j);
			String tit = driver.getTitle();
			System.out.println(tit);
			String title="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
	 if((title.equals(driver.getTitle()))) // to close only parent window
	         {

			driver.close();
			}
			}	
		
	}
	}

		


