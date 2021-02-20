package KlearCard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class KlearBase implements KlearConst{
	public WebDriver driver;
	public static int pass=0,fail=0;//new code
		
		static {
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			//System.setProperty(GECKO_KEY,GECKO_VALUE);
		}
		
		@BeforeMethod
		public void openApplication() {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
			driver.get(URL);
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		}
		
	/*	@AfterMethod
		public void closeApplication(ITestResult iTestResult) {
			
			if(iTestResult.getStatus()==2) {			
			String name=iTestResult.getName();
			//FWUtil.getPhoto(driver, PHOTO_PATH+name+".png");
			fail++;
			}
			else {
				pass++;
			}
		//	driver.close();
		}*/
	//new method
	/*	@AfterSuite
		public void writeReport() {
			FWUtil.setXLData(REPORT_PATH, "Sheet1", 1, 0, pass);
			FWUtil.setXLData(REPORT_PATH, "Sheet1", 1, 1, fail);
*/

}
