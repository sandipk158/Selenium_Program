package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Technics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://login.salesforce.com/?locale=in");
        
        //driver.findElement(By.name("username")).sendKeys("Sandip");
        //driver.findElement(By.id("password")).sendKeys("123");
        //driver.findElement(By.name("Login")).click();
        //driver.findElement(By.linkText("Forgot Your Password?")).click();
        //driver.findElement(By.partialLinkText("Use Custom Domain")).click();
        
      //Xpath Syntax -- //tagname[@attribute='value'] 
      //  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sandip");
      //  driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Sandip");
      //  driver.findElement(By.xpath("Login")).click();
                  
       
        driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("Minal");
        driver.findElement(By.xpath("(//form[@name='login']/input)[2]")).sendKeys("123");
        driver.findElement(By.xpath("(//form[@name='login']/input)[3]")).click();
        
      //CSS syntax -- tagname[attribute='value']   
        
	}
}
