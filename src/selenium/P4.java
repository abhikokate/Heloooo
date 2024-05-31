package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.batik.bridge.UserAgent;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P4 {
	
	public static String readdata(int r,int c) throws IOException  {
		
		String pathString = System.getProperty("user.dir")+ "\\data\\testdata.xlsx";
		File file = new File(pathString);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wbWorkbook  = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbWorkbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(r);
		
		XSSFCell cell = row.getCell(c);
		
		String valString= cell.getStringCellValue();
		
		
		
		return valString;
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println(readdata(0, 0));


	}

}
