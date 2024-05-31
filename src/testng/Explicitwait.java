package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Explicitwait {
	
		
		WebDriver driver;
		
		@BeforeClass
		public void init() throws InterruptedException {
			
			
			//set path require while creating driver instance 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
			
			//step-1
			driver =new ChromeDriver();
			
			//step-2
			driver.manage().window().maximize();
			
			//step-3 open webpage
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			
			//step-4 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		}
		
		@Test
		public void handleAlert () throws InterruptedException {
			
			//click on button
			driver.findElement(By.id("alert")).click();
			
			//using explicit wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			//handling alert
			driver.switchTo().alert().accept();
			
			System.out.println("alert handled successfuly");
		
		}
		@Test
		public void handleButton() {
			
			driver.findElement(By.id("display-other-button")).click();
			
			//find Element
			WebElement button = driver.findElement(By.id("hidden"));
			
			//wait - fluent wait
			FluentWait<WebDriver> fwait =new FluentWait<WebDriver> (driver);
			
			fwait.withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(2));
			
			fwait.until(ExpectedConditions.elementToBeClickable(button));
			
			button.click();
			
			System.out.println("successfully clicked on button");
			
		}
		@AfterClass 
		public void tearDown() throws InterruptedException {
			Thread.sleep(8000);
			
			driver.close();
		}

	}
