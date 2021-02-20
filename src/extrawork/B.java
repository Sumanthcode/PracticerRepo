package extrawork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class B {
	

	   
		@Test
	    public void test()
	    {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String atitle = driver.getTitle();
		String etitle="google";
		Assert.assertEquals(atitle,etitle);
		driver.close();
	    
		
		
	
		
		
	}
	}

	


