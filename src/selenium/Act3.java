package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement button2 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		//step-5 Actions class
		Actions act =new Actions (driver);
		
		//right click
		act.contextClick(button2).perform();
		
		Thread.sleep(2000);
		
		 WebElement mestext2= driver.findElement(By.id("rightClickMessage"));
		 
		 String message2 = mestext2.getText();
		
		if (message2.contains("right click")) {
			
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		
   
	}

}
