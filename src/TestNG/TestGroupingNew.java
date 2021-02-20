package TestNG;

import org.testng.annotations.Test;

public class TestGroupingNew {
  @Test(groups="D")
  public void g1() {
  }
  
  @Test(groups="A")
  public void g2() {
  }
  
  @Test(groups="C")
  public void g3() {
  }
  
  @Test(groups="B")
  public void g4() {
  }
}
