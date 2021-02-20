package extrawork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderTest2ReadExcel {
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	
	
	public DataProviderTest2ReadExcel(String path) throws IOException
	{
		
		FileInputStream file=new FileInputStream(path);
		 workBook=new XSSFWorkbook(file);
		
		
	}
	
	public String excelData(int index,int rownum,int cell)
	{
		sheet=workBook.getSheetAt(index);
		String data=sheet.getRow(rownum).getCell(cell).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row=workBook.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}

}
