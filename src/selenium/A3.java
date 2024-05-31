package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v102.input.Input;

public class A3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//based on expression 
		//cssSelector:-
		
		// click on login button
		//1. using tag name and other attributes
		//syntax- tagname.[attribute='attributevalue']
		
		driver.findElement(By.cssSelector("button[name='login']")).click();

		
		//enter the text in text box
		// using the name and class name
		//syntax-tagname.classname
		
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("abc@123");
		
		// 3 again click on login button 
		//using tagname andid
		//syntax- tagname#id
		
 ((WebElement) driver.findElements(By.cssSelector("button#loginbutton"))).click();
 
 driver.close();
		


	}

}
