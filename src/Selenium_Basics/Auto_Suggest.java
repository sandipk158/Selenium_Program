package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.
		 * ARROW_DOWN);
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.
		 * ARROW_DOWN);
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.
		 * ENTER);
		 */

		// List<WebElement> a=driver.findElements
		List<WebElement> a = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for (WebElement b : a) {

			if (b.getText().equalsIgnoreCase("India")) {
				b.click();
				// break;

			}
		}
	}
}
