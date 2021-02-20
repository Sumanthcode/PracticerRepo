package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class slv {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/s3.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select select=new Select(listbox);
		List<WebElement> a = select.getAllSelectedOptions();
		int count1 = a.size();
		System.out.println(count1);
		
		for(int i=0;i<count1;i++)
		{
			WebElement e1 = a.get(i);
			String text1=e1.getText();
			System.out.println(text1);
		}
		
		WebElement e2 = select.getFirstSelectedOption();
		String text2 = e2.getText();
		System.out.println(text2);
		
		List<WebElement> b = select.getOptions();
		int count2 = b.size();
		System.out.println(count2);
		
		for(int i=0;i<count2;i++)
		{
			WebElement e= b.get(i);
			String text3=e.getText();
			System.out.println(text3);
		}
			driver.close();
		}

	}

