package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//step1 find text box element on web page
		
		WebElement textboxElement = driver.findElement(By.id("email"));
		textboxElement.sendKeys("kokate123");
		
		//enter value password box
		
		WebElement textbox1 = driver.findElement(By.name("pass"));
		textbox1.sendKeys("abhi9989");
		
		
		// show password
	WebElement seepassElement = driver.findElement(By.className("_9lsb"));
		seepassElement.click();
		
		
		
		//click on login button
	WebElement textbox2 =driver.findElement(By.name("login"));
		textbox2.click();
		
		//based on linktext
		WebElement linkElement = driver.findElement(By.linkText("Forgotten password?"));
		linkElement.click();
		
		
		
		//closing window
		
		
		}

	
		
		
	}
