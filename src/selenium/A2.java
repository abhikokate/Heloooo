package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// click on radio button
		
	driver. findElement(By.cssSelector("input[value='Radio1']")).click();
	
	Thread.sleep(8000);
		
		// click on multiple radio button
		
		List<WebElement> ele = driver.findElements(By.cssSelector("input[name='radio']"));
		
		System.out.println(ele.size());
		
		for (WebElement l : ele ) {
			
			l.click();
			Thread.sleep(2000);
		}
	

	}

}

