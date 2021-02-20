package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo1 {
	

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/s2.html");
	    List<WebElement>allLinks=driver.findElements(By.tagName("a"));
	   //WebElement Link=allLinks.get(1);
	   // int count=allLinks.size();
	   // String s=Link.getText();
	   // Link.click();
	   // System.out.println(count);
	   // System.out.println(s);
	   for(int i=0;i<allLinks.size();i++)
	   {
		   WebElement Link=allLinks.get(i);
		   String s=Link.getText();
		   System.out.println(s);
	   }
	    

	}

}
