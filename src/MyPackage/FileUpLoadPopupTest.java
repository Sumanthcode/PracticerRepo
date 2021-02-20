package MyPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//using absolute path
public class FileUpLoadPopupTest {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		String path="D:/IMG20200124115053.jpg";
		//File fs=new File(path);
		
		driver.findElement(By.id("imagesrc")).sendKeys(path);

	}

}
