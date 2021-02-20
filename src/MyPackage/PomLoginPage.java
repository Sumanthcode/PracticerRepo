package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement log;
	

	
	public PomLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	public void setEmail(String em)
	{
		email.sendKeys(em);
		
	}
	
	public void setPass(String p)
	{
		pass.sendKeys(p);
	}
	
	public void setLog()
	{
		log.click();
	}

}
