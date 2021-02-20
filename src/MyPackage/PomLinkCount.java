package MyPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLinkCount {
	
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	public PomLinkCount(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public int link()
	{
		return allLinks.size();
		
	}
	

}
