package testng.testng.ng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class P2 {
WebDriver driver;
	
	@BeforeClass
	public void initalization() {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		//step -1 create object of chrome driver
		driver =new ChromeDriver();
		
		
		//step-2 maximize
		driver.manage().window().maximize();
		
		
		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

	
	@Test
	public void enterCred() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(6000);
		driver.close();
  }

}
