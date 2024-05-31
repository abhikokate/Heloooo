package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	    WebElement frame =	driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(frame);
	    
     	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/child::span"));

     	Actions act = new Actions(driver);
     	
     	act.clickAndHold(slider).moveByOffset(200, 0).release().build().perform();
     	Thread.sleep(10000);
     	
     	
     	
	}

}
