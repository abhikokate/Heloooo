package selenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Argument;

public class A5 {

	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
	  
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
	  
	 driver.manage().window().maximize();
	 
	 driver.get("https://vctcpune.com/selenium/practice.html");

	 // scrolling
	 // scrolling operation using javaScriptexecutor- upcasting
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(3000);
	//js.executeScript("arugument[0].scrollIntoView()", args)
	 //scroll upto element
	 
	 WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
	 js.executeScript("arguments[0].scrollIntoview", checkbox);
	 Thread.sleep(3000);
	 
	 //find multiple button of type button
	 //get all check box
List<WebElement> checkboxes =	 driver.findElements(By.xpath("//input[@type='checkbox']"));
	 for (WebElement element : checkboxes) {
		 
		 element.click();
		 Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	 
	}

}
