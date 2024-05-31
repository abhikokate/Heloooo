package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Captureuserdirectory {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@name='login']")).click();
       Thread.sleep(4000);
        
        TakesScreenshot tss = (TakesScreenshot)driver;
        File src =  tss.getScreenshotAs(OutputType.FILE);
        
       String name = "ss2";
        File destination = new File(System.getProperty("user.dir") +"\\screenshot\\"+name+".png");
        
        FileHandler.copy(src, destination);
        
        System.out.println("screenshot taken");
        Thread.sleep(4000);
        driver.close();         
        
        
        
        
        
        
        
	}

}
