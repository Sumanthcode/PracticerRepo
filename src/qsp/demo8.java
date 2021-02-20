package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo8 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/s4.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select select=new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		int count = allOptions.size();
		
		ArrayList<String>allText=new ArrayList<String>();
		
		for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			allText.add(text);
		}
		
		 Collections.sort(allText);
		
		
		for(String text:allText)
		{
			System.out.println(text);
		}
		
		TreeSet s=new TreeSet();
		s.addAll(allText);
		 NavigableSet e = s.descendingSet();
		 for(Object i:e)
		 {
		 System.out.println(i);
		 }
		
		
		driver.close();
		}
		

	}


