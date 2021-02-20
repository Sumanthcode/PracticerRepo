package MyPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		//driver.findElement(By.name("emailid")).sendKeys("balankoppasumanth@gmail.com");
		//driver.findElement(By.name("btnLogin")).click();
		String parent = driver.getWindowHandle();
		
		 Set<String> w = driver.getWindowHandles();
		 System.out.println(w.size());
		 for(String a : w)
		 {
			 if(!parent.equalsIgnoreCase(a))
			 {
		    String title = driver.switchTo().window(a).getTitle();
		    System.out.println(title);
		    driver.close();
			 }
		    
		 
		 }

		 
		 
		 
		
	}
}
