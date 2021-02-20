//write a data into xl file
package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DemoE {
	@Test
	public void testA() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
	String p="./data/b1.xlsx";
	//open the workbook(xl file)
	Workbook book1=WorkbookFactory.create(new FileInputStream(p));
	
	Cell c=book1.getSheet("sheet1").getRow(0).getCell(0);
	c.setCellValue("bhanu");
	
	String p2="./data/b2.xlsx";
	book1.write(new FileOutputStream(p2));
	}

}
