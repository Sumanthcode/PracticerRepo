package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo16 {
	@Test(priority=0,invocationCount=2)
	public void register()
	{
		Reporter.log("register",true);
		
	}
	final int i=1;
	@Test(priority=i)
	public void login()
	{
		Reporter.log("login",true);
	}

}
