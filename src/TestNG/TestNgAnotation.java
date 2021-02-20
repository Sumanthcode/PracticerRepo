package TestNG;

import org.testng.annotations.*;

public class TestNgAnotation {
  @Test
  public void f1() {
	  System.out.println("method");
  }
  
  @BeforeTest
  public void f2() {
	  System.out.println("Before test");
  }
  
  @AfterTest
  public void f3() {
	  System.out.println("After test");
  }
  
  @BeforeClass
  public void f4() {
	  System.out.println("Before class");
  }
  
  @AfterClass
  public void f5() {
	  System.out.println("After class");
  }
  
  @BeforeMethod
  public void f6() {
	  System.out.println("Before method");
  }
  
  @AfterMethod
  public void f7() {
	  System.out.println("After method");
  }
}
