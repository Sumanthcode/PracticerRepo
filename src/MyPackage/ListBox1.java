package MyPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("sumanth");
		driver.findElement(By.name("reg_email__")).sendKeys("balankoppasumanth@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SUBS1996");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s=new Select(day);
		s.selectByIndex(5);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(7);
		
		WebElement year= driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1996");
		
		List<WebElement> wb = s1.getOptions();
		int n=wb.size();
		 
		ArrayList<String> ar=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			String text = wb.get(i).getText();
			//System.out.println(text);
			ar.add(text);
			
		}
		 Collections.sort(ar);
		 
		 for(String sorted : ar)
		 {
			 System.out.println(sorted);
		 }
		
		

	}

}
