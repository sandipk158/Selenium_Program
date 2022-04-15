package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
		
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     
	     WebElement b=driver.findElement(By.xpath("//a[@id='opentab']"));
	     WebElement c=driver.findElement(By.xpath("//button[@id='openwindow']"));

	     Actions a=new Actions(driver);
	     
	     a.contextClick(b).perform();  //To perform the right click
	     a.doubleClick(c).perform(); //To perform the double click
	     a.doubleClick().perform();
	     

	}

}

//Action is Interface 
//Actions is class