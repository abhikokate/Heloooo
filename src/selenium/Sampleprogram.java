package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprogram {

	public static void main(String[] args) throws InterruptedException {
		
		// set property
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		
		// step -1 launch instance of chrome driver.
		
		WebDriver driver = new ChromeDriver();  //we can not create the instance of webdriver here
		// as we can not create the object of interface so we create object of class here
	
		//step4
		driver.get("https://www.facebook.com/");
		
		// step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3
	//	driver.manage().window().minimize();
		
	// step-5 navigate to seleniumwebpage
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		// step 6 navigate back
		driver.navigate().back();// use method to navigate back to previous page
		Thread.sleep(3000);
		
			
		// step 6 navigate forward
		driver.navigate().forward();// use method to navigate forward
		Thread.sleep(3000);
		
    // step 7 refresh webpage
		driver.navigate().refresh();  // method to refresh page
		
		// assignment no1
		//write a simple script to verify title of web page
		
		String actualTital = driver.getTitle();
		System.out.println(actualTital);//print actual tital
		
		String expectedTitleString = driver.getTitle();
		
		String expectedTitle ="selenium";
		if (actualTital.equals(expectedTitle)) {
			
			System.out.println("test case is passed");
			
		}
		else {
			System.out.println("test case failed");
		}
		
		//write a simple script to verify url of web page
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String expectedUrl = "https://www.selenium.dev/";
		if (actualUrl.contains(expectedUrl)) {
			System.out.println("test case passed");
			
			
		}
		else {
			System.out.println("test case failed");
		}
		 
		 
		 
	}

}
