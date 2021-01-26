package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook xwb;
	
	public ExcelDataProvider() throws EncryptedDocumentException, IOException
	{

		File fw = new File("E:\\Velocity_Testing\\PHPTRAVELS\\src\\main\\java\\TestData\\PHPTRAVELS.xlsx");
		
		FileInputStream fis = new FileInputStream(fw);

		xwb = new XSSFWorkbook(fis);
		
	}
	
	public String getStringData(String string, int row, int coloumn)
	{
		return xwb.getSheet(string).getRow(row).getCell(coloumn).getStringCellValue();
	}
}
