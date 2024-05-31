package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void selectCalender( String month, String date,String calenderState) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\OneDrive\\Desktop\\selenium chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://jqueryui.com/datepicker/");
				
				//step-4 switch to frame -frame handling
				WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
				
				driver.switchTo().frame(frame);
				Thread.sleep(2000);
				
				//step -5 click on button
				driver.findElement(By.id("datepicker")).click();
				
				//step-6 select month & year
			
				while (true) {
					
					WebElement month1= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
					
					String monthValue= month1.getText();
					WebElement previous =driver.findElement(By.xpath("//a[@title='"+calenderState+"']"));
					
					WebElement nextButton =driver.findElement(By.xpath("//a[@title='Next']"));
					
					if(!monthValue.equals(month)) {
						
						previous.click();
					}
					else {
						
						break;
					}
				}
				Thread.sleep(2000);
				
				//step-7 select date-
				
				driver.findElement(By.xpath("//a[@data-date='"+date+"']")).click();
					
			   //step -9
				Thread.sleep(8000);
				driver.close();
				
	}	
				
				public static void main(String[] args) throws InterruptedException {
				
				selectCalender("March 2023", "15", "Next" );

			}
	
	
	}


