package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123");
        
        TakesScreenshot tss = (TakesScreenshot)driver;
        File srcFile = tss.getScreenshotAs(OutputType.FILE);
       
		String name= "akb";
		File destinationFile=new File(System.getProperty("user.dir") +"\\screenshot\\"+name+".png");
		FileHandler.copy(srcFile,destinationFile);
		System.out.println("screen shot taken");
		Thread.sleep(4000);
	}

}
