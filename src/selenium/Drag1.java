package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
	    WebElement frame =	driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(frame);
		//step-5 locate slider
		WebElement dragObject = driver.findElement(By.id("draggable"));
		
		//step -6 use actions class
		Actions act =new Actions (driver);
		
		act.dragAndDropBy(dragObject, 120, 40).perform();
	
		
		
		Thread.sleep(8000);
		driver.close();

	    

	}

}
