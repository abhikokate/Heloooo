package selenium;


import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	
		JavascriptExecutor jsExecutor =(JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		
	WebElement dropdown =	driver.findElement(By.id("dropdown-class-example"));
		
		//using select class to handle dropdown
		Select sel = new Select (dropdown);
		
		//select base on index
	//	sel.selectByIndex(1);
		
		//select option based on visible text
	//	sel.selectByVisibleText ("Option3");
		
		//get all option from dropdown is multi selected
	List <WebElement> opt=sel.getOptions();
		System.out.println("Total option"+ "Opt.size()");
		Thread.sleep(2000);
		
		//use of below method when drodown is multi selected
	  System.out.println(sel.isMultiple());
	
		  
	  for ( WebElement ele : opt) {
			
			 String name = ele.getText();
			 System.out.println(name);
			 
			 if (name.equals("Option2")) {
				 
				 sel.selectByVisibleText(name);
				 System.out.println("inside if");
				 
			 }
			 
			 else  {
				 
				 System.out.println("inside else");
		
		
		
			 }
	  }
	}
}
		
		
	


