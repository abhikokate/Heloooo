package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//enter the user name in email box
	WebElement usernamElement =	driver.findElement(By.name("email"));
	usernamElement.sendKeys("kokate@123");
	Thread.sleep(3000);
		
		WebElement pass=  driver.findElement(By.name("pass"));
		pass.sendKeys("banti123");
		Thread.sleep(3000);
		
		WebElement show=  driver.findElement(By.className("_9lsb"));
		show.click();
		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.name("login"));
		button.click();
		
		

	}

}
