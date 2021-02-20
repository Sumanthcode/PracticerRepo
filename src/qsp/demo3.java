package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//enter the url
		driver.get("http://www.google.com");
		//find the element
		//driver.findElement(By.name("q")).sendKeys("java");
		WebElement e = driver.switchTo().activeElement();
		e.sendKeys("java");
		//find all auto suggestion
		//Thread.sleep(2000);
		String xp="//span[contains(text(),'java')]";
	    List<WebElement> allASE = driver.findElements(By.xpath(xp));
	    //count them
	    int count=allASE.size();
	    System.out.println(count);
	    //print all auto suggestion
	    for(int i=0;i<count;i++)
	    {
	    	WebElement ase=allASE.get(i);
	    	String text=ase.getText();
	    	System.out.println(text);
	    }
	    //select 1st auto suggestion
	    allASE.get(0).click();
	    }
		
		

	}


