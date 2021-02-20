package extrawork;

import org.testng.annotations.*;

public class DataProviderTest1 {
	
	
	@Test(dataProvider="testdata")
	public void getData(String a,String b)
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	@DataProvider(name="testdata")
	public String[][] provideData()
	{
		String [][]data=new String[2][2];
		
		data[0][0]="sujhd";
		data[0][1]="jjjjj";
		data[1][0]="uuuuuu";
		data[1][1]="kkkkk";
		return data;
		
	}
	
	
	
	

}
