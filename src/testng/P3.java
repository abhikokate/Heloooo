package testng;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P3 {
	WebDriver driver;
@BeforeClass
public void initalization() {

	//set path require while creating driver instance 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
	
	//step -1 create object of chrome driver
	driver =new ChromeDriver();
	
	
	//step-2 maximize
	driver.manage().window().maximize();
	
	
	//step-3 open webpage
	driver.get("https://www.facebook.com/");
		
}

  @Test(dataProvider = "testdata")
  public void login(String username, String pass) throws InterruptedException {
	  
  WebElement emailbox	 = driver.findElement(By.xpath("//input[@name='email']"));
  emailbox.sendKeys(username);
  Thread.sleep(4000);
  
   driver.findElement(By.id("pass")).sendKeys(pass);
   Thread.sleep(4000);
   
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   Thread.sleep(4000);
  
  driver.navigate().back();
  Thread.sleep(3000);
  
  driver.navigate().refresh();
  Thread.sleep(3000);
  
  driver.findElement(By.xpath("//input[@name='email'")).clear();
  }
  
  @DataProvider(name="testdata")
  public String[][]getdata(){
	  
   String [][]data= {{"abc","123"},{"xyz","456"},{"pqr","789"}};


return data;
  }

   @AfterClass
   public void tearDown() throws InterruptedException {
	   
	   Thread.sleep(3000);

driver.close();

  }
}
