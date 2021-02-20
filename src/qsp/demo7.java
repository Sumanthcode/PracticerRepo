package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo7 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/s4.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select select=new Select(listbox);
		String v = select.getWrappedElement().getText();
		System.out.println(v);
	}
		
		
		
	}


