package Selenium_Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots extends Common_Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Take Full Screenshots
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Minty\\Desktop\\Testing Document\\Screenshots\\screenshot.png"));

		// Take Partial Screenshots
		WebElement a = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		File src1 = a.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Users\\Minty\\Desktop\\Testing Document\\Screenshots\\screenshot1.png"));
		
		System.out.println("Screenshot completed");

	}

}
