package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capturescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
       // WebElement dropdown =driver.findElement(By.id("dropdown-class-example"));
      //  dropdown.click();
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		
	    File sourceFile=tss.getScreenshotAs(OutputType.FILE);
	    
	    File destination=new File("C:\\Users\\91913\\eclipse-workspace\\selenium\\screenshot\\ss.png");
	    
	    FileHandler.copy(sourceFile, destination);
	    
	    System.out.println("screenshot taken");
	    Thread.sleep(4000);
	    driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
