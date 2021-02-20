package extrawork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CountImg
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		A ob=new A();
		
			PageFactory.initElements(driver, ob);
	
		System.out.println(ob.getLinks());
		
		
	}
	
	
	
		
	
		
	
}
		
		
		
		
	  
	    
	    
	  
	
	
	

		
	


