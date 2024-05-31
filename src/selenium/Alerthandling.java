package selenium;


import java.rmi.registry.LocateRegistry;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		//locate button element
		
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(2000);
		
		
		
		
		//handling of alert
		
		Alert al = driver. switchTo().alert();
		
		al.accept();
		Thread.sleep(8000);
		
		driver.close();
		
	}

}
