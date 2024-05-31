package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B3 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(2000);
		
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
Thread.sleep(5000);
	}

}

