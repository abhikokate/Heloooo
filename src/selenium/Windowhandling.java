package selenium;

import java.util.Set;



import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)", " ");
		
		Thread.sleep(2000);
		
		String title = driver .getTitle();
		System.out.println("intial parenttab title "+ title);
		
		String parenttab = driver.getWindowHandle();
		
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(2000);
		
		Set<String> alltabs = driver.getWindowHandles();
		int nooftabs = alltabs.size();
		System.out.println(nooftabs);
		
		for (String string:alltabs) {
			System.out.println();
	if (!parenttab.equals(string)) {
				
				driver.switchTo().window(string);
				System.out.println("Switched to child tab");
				String childTTabTitle = driver.getTitle();
				System.out.println("childTTabTitle " + childTTabTitle);
		}

		}
		
	}
	
}


