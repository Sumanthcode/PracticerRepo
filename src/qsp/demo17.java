package qsp;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo17 {
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][2];
		data[0][0]="UserA";
		data[0][1]="A1";
		
		data[1][0]="UserB";
	    data[1][1]="B1";
		
		data[2][0]="UserC";
	    data[2][1]="C1";
	    
	    return data;
	}
	@Test(dataProvider="getData")
	public void createUser(String un,String pw)
	{
		Reporter.log("creater:"+un+ "pw" +pw, true);
	}

}
