package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aletr_Msg_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	      Thread.sleep(5000);
	      
	      //driver.switchTo().alert().getText();
	      System.out.println(driver.switchTo().alert().getText());
	      
	      driver.switchTo().alert().accept(); //To accept the alert
	       
	   // driver.switchTo().alert().dismiss(); //To dismiss the alert
	      
	   // driver.switchTo().alert().sendKeys("nvkjf"); //To type something on alert textbox

	}

}
