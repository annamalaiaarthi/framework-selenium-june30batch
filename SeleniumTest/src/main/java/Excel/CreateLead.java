package Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateLead
{
	@Test
	public Object createLead(String filename) throws IOException
	{
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = wBook.getSheet("login");
		int rowCount = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowCount][lastCellNum];
		
		for(int i = 1; i <= rowCount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j< lastCellNum; j++)
			{
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		wBook.close();
		return data;
	}
	
	
}
