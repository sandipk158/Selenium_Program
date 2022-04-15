package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class First_Program {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //Interface				//Class
        
        driver.get("https://www.amazon.com/");
        
        //driver.getCurrentUrl(); //To Display URL
        System.out.println(driver.getCurrentUrl());
        
        System.out.println(driver.getTitle());
       
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close(); //To close the current open browser
        driver.quit();  //To close all recently open browser if more than 1 browser open
              
	}
}





