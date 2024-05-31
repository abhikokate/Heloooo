 package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exel2 {
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
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			//step-4 enter email
			driver.findElement(By.id("email")).sendKeys(readdata(0,0));
			Thread.sleep(3000);
			
			//step-5 enter password
			driver.findElement(By.id("pass")).sendKeys(readdata(0,1));
			
			//step-6 
			Thread.sleep(8000);
			driver.close();

		}

}
