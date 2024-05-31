package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		
        WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
       driver.switchTo().frame(frame);
      Thread.sleep(2000);
      
      driver.findElement(By.id("datepicker")).click();
      Thread.sleep(8000);
      
      
      while(true) {
    	  String 
    	  s=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
    	  System.out.println("Current Title is:"+s);
    	  if(!s.equalsIgnoreCase("December 2017"))
    	  {
    	  driver.findElement(By.xpath("//a[@title='Prev']")).click();
    	  }
    	   else
    	   {
    	  break;
    	   }
      }
    		
      
	}

}
