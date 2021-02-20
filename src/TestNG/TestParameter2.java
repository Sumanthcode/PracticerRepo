package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//here we can run directly when we use @Optional
public class TestParameter2 {
  
    @Parameters({"s1","s2"})
	@Test
  public void f(@Optional("sad")String s1,@Optional("year")String s2) {
    	Reporter.log(s1 +" "+ s2,true);
  }
}
