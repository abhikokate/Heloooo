package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("abhi");
		
	//	driver.findElement(By.name("pass")).click();
		
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
	//	driver.findElement(By.partialLinkText("password")).click();
		
	//	driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("abhi");
    System.out.println("ak");
	}

}
