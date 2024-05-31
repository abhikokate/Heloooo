package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {
	
	public class Excel2 {
		
		public static void writeData(int r, int c, String val ) throws IOException {
			
			//step- 1
			String path = System.getProperty("user.dir")+ "\\Data\\testdata.xlsx";
			
			//step-2 handle file info
			File file =new File(path);
			
			//step-3 
			FileInputStream fis =new FileInputStream(file);
			
			//step-4 
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			//step-5 
			XSSFSheet sheet = wb.getSheet("Sheet2");
			
			//step-6
			XSSFRow row= sheet.createRow(r);
			
			//step-7
			XSSFCell cell = row.createCell(c);
			
			//step-8 set value
			cell.setCellValue(val);
			
			//step-9
			FileOutputStream fos= new FileOutputStream(file);
			
			//step-10 
			wb.write(fos);
			
			//step-11
			wb.close();
			
			System.out.println("data written successfully");
			
		}


	public static void main(String[] args) throws IOException {
		
		writeData(2,0, "Nashik");
	}

}
}
	
	
