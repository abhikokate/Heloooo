package selenium;



import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.openqa.selenium.io.FileHandler;

public class A6 {
static WebDriver driver;
	public static void dropdownhandle() throws InterruptedException, IOException {


		System .setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver. manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(2000);
		
      driver.findElement(By.id("dropdown-class-example")) .click();
      Thread.sleep(2000);
      
      capturescreen("snap1");
      Thread.sleep(2000);
		
	}
		
		public static void capturescreen(String name)throws IOException{
			
			TakesScreenshot tss = (TakesScreenshot) driver;
			File sourceFile = tss.getScreenshotAs(OutputType.FILE);
			String path = "C:\\Users\\91913\\eclipse-workspace\\selenium\\screenshot\\snap.jpg";
			File destinationFile = new File(path);
			
			FileHandler.copy(sourceFile,destinationFile);
			System.out.println("screen shot successfully captured");
		
			
			
			
		}
		
		
		


		public static void main(String[] args) throws InterruptedException, IOException {
			
			dropdownhandle();
			
		}
	
	}

 
