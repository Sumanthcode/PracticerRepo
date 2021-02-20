package extrawork;

import java.io.IOException;

import org.testng.annotations.*;

public class DataProviderTest2 {
	
	@Test(dataProvider="data")
	public void test2(String a, String b)
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	@DataProvider(name="data")
	public String[][] readData() throws IOException
	{
		DataProviderTest2ReadExcel readbook=new DataProviderTest2ReadExcel("./data/b2.xlsx");
		int row=readbook.getRowCount(0);
		String [][]a=new String[row][2];
		
		for(int i=0;i<row;i++)
		{
			a[i][0]=readbook.excelData(0,i,0);
			a[i][1]=readbook.excelData(0,i,1);
		}
		
		
		return a;
	}
	

}
