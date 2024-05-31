package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EEE {
	
	public static void writedata(int r, int c,String value) throws IOException   {
	
		String path = System.getProperty("user.dir")+ "\\Data\\testdata.xlsx";
		
		File file = new File (path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet2");
		
		XSSFRow row = sheet.createRow(r);
		
		XSSFCell cell = row.createCell(c);
		
		cell.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(file);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("data written successfully");
	}
	
	public static void main(String[] args) throws IOException {
		
		writedata(2, 0, "latur");
		
		

	}

}
