package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
// u cant run directly or else we ll get TestNg exception
public class TestParameter {
	
	@Parameters("city")
  @Test
  public void f(String c) {
		Reporter.log(c,true);// if u want to see the output in both html report and consol
  }
}
