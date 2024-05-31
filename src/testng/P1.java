package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class P1 {
	
	public WebDriver driver;
	 @Parameters("browser")
	 @BeforeTest
	  public void initalization(String browser) throws InterruptedException {
		 
		 if(browser.equals("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
			 
		driver= new ChromeDriver();
		 }
		 else if(browser.equals("edge")) {
			 System.setProperty("webdriver.edge.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\msedgedriver.exe");
			 
			 driver=new EdgeDriver();
		 }
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/datepicker/");
		 Thread.sleep(5000);
	  }
	
	
     @Test
     public void getTitle(String val) throws InterruptedException {
    	 Thread.sleep(5000);
    	 
    	 String acttitle=driver.getTitle();
    	 System.out.println(acttitle);
    	 
  }
  
     @AfterTest
     public void tearDown() throws InterruptedException {
    	 
    	 Thread.sleep(4000);
    	 driver.close();
    	 
    	 
  }

}
