package extrawork;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A {
	
		@FindBy(xpath="//img")
		private List<WebElement> un;
		 
		
		
		
		
		
		public int getLinks()
		{
			int n = un.size();
			return n;
		}
		
		
	

}
