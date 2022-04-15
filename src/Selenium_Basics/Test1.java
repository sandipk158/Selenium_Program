package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));  //Adult Xpath
		//WebElement c = driver.findElement(By.xpath("//span[@id='hrefIncChd']"));  ////Child Xpath
		
		for (int i = 0; i < 9; i++) {

			//driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			b.click();
			//c.click();

		}
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
