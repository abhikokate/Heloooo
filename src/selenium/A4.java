package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// type of x path- 1.Absolute x path
		// it is not recommended to use
		
		driver.findElement(By.xpath("/html/body/script[1]"));
		
		// type 2- Relative x path
		//syntax- //tagname[@attriutename='attribute value']
		
		driver.findElement(By.xpath("//input[@name='email']"));
// x path - text present on element
// syntax- //tagname[text()='textvalue']
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
