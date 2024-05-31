package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("search_query_top")).sendKeys("Tshirts");
		
	//	driver.findElement(By.name("submit_search")).click();
		
	//	driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
	//	driver.findElement(By.partialLinkText("Printed ")).click();
		
		int links=driver.findElements(By.className("homeslider-description")).size();
System.out.println(links);

    int sliders =  driver.findElements(By.tagName("a")).size();
    System.out.println(sliders);


	}

	
	}


