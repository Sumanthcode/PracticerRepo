package TestNG;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class DemoD {
	@Test
	public void testA()
	{
	String p="./data/b1.xlsx";
	//open the workbook(xl file)
	Workbook book1=WorkbookFactory.create(new FileInputStream(p));
	for(int i=0;i<=3;i++){
	Cell c=book1.getSheet("sheet1").getRow(i).getCell(1);
	
	//String s=c.getStringCellValue();//getNumericCellvalue()
	String s=c.toString();
	
	System.out.println(s);
	}
	book1.close();
	}

}
