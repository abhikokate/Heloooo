package selenium;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	jsExecutor.executeScript("window.scrollBy(0,700)", "");
	Thread.sleep(2000);

	// enter the value text box
	String nameString="velocity";
	driver.findElement(By.cssSelector("input#name")).sendKeys("name");
	
	//click on confirm button
	driver.findElement(By.id("confirmbtn")).click();
	Thread.sleep(2000);
	//handle alert
	Alert al = driver.switchTo().alert();
	
	String alertMessageString=al.getText();
	System.out.println("alertmessage");
	
	//operation based on text on alert
	if (alertMessageString.contains("vedant"))
	
	{
	al.accept();
	System.out.println("text present on alert");
	}
	else {
		al.dismiss();
		System.out.println("text does not present on alert");
	}  
	
	}

}
