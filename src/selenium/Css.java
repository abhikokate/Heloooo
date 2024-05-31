package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//tag&id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abhi");
		
		//tag&class
		//driver.findElement(By.cssSelector("input._6luy")).sendKeys("aa");
		
		//tag& attribute
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("yy");

	}

}
