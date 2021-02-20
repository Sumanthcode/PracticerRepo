package TestNG;

import org.testng.annotations.Test;

public class TestNgPrioritization {
  @Test(priority=1)
  public void f() {
	  System.out.println("from f");
  }
  
  @Test(priority=3)
  public void a() {
	  System.out.println("from a");
  }
  
  @Test(dependsOnMethods={"a"})
  public void b() {
	  System.out.println("from b");
  }
  
  @Test(enabled=false)
  public void h() {
	  System.out.println("from f");
  }
  
  
}
