package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class C1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apple.com/in/iphone-14-pro/specs/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		
		File trgFile = tss.getScreenshotAs(OutputType.FILE);
		
		File destinationFile = new File("C:\\Users\\91913\\eclipse-workspace\\selenium\\screenshot\\iphone.png");
		
		FileHandler.copy(trgFile,destinationFile);
		
		
	}

}
