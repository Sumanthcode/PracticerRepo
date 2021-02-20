package MyPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// using relative path
public class FileUpLoadPopupTest2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	    String relativepath="./Photo/Rpa.png";
	    
	    File path=new File(relativepath);
	    String apath = path.getAbsolutePath();
	    driver.findElement(By.id("imagesrc")).sendKeys(apath);
	}
		

}
