package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//button[text()='Click Me']"));
     
     	Actions act = new Actions(driver);
     	act.click(button).perform();
		Thread.sleep(2000);
		
		String message1 = driver.findElement(By.id("dynamicClickMessage")).getText();
		
		if (message1.contains("dynamic click")) {
			
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		
		
		//step-6
		Thread.sleep(8000);
		driver.close();

     	

	}

}
