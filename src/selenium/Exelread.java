package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;

public class Exelread {
	
	public static String readdata(int r,int c) throws IOException {
	//step-1 path of file
	String path = System.getProperty("user.dir")+ "\\Data\\testdata.xlsx";
	
	//step-2 file object creation
	File file =new File(path);
	
	//step-3 create object to read file
	FileInputStream fis =new FileInputStream(file);
	
	//step-4 Creating object of XSSFWorkbook
	XSSFWorkbook wb=new XSSFWorkbook (fis);
	
	//step-5 get sheet from workbook
	XSSFSheet sheet = wb.getSheetAt(0);
	
	//step-6 get Row
	XSSFRow row=sheet.getRow(r);
	
	//step-7 get Cell
	XSSFCell cell=row.getCell(c);
	
	//step-8 get value
	String val = cell.getStringCellValue();
	
	
	return val;
	
}
	
	
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		System.out.println(readdata(0, 0));

	}

}
