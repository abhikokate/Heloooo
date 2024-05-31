package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();

		//select method
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select sel = new Select(dropdown);
		//sel.selectByVisibleText("Option1")	;	
		//sel.selectByValue("option1")	;
	//	sel.selectByIndex(3);		
		
		List<WebElement>alloption=sel. getOptions();
		
		for(WebElement option:alloption) {
			if(option.getText().equals("Option2")) {
				option.click();
				break;
				
			}
		}
		
		
	}
	
}


 