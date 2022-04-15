package Selenium_Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 		   
		 
		  driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		  		  
		    /*drivr.getwindowhandle(): This method helps to get the window handle of the current window
		  driver.getwindowhandles(): This method helps to get the handles of all the windows opened
		  set: This method helps to set the window handles in the form of a string. set<string> set= driver.get.windowhandles()
		  switch to: This method helps to switch between the windows*/
		  		 
		     Set<String> b=driver.getWindowHandles();  // parent id and child browser
		     
		     Iterator<String> it=b.iterator();
		     String parent_Window=it.next(); 
		     String child_Window=it.next(); 
		   		     
		     driver.switchTo().window(child_Window);  //control will come to child winodw
		     
		     //driver.findElement(By.xpath("//body[@id='homepage']")).click();
		     //driver.findElement(By.xpath("//li[@class='active']/a")).click();
		     System.out.println(driver.getCurrentUrl()); //Child URL
		     //http://www.qaclickacademy.com/    
		 		   

		     driver.switchTo().window(parent_Window);
		     System.out.println(driver.getCurrentUrl()); //Parent URL
		     //https://rahulshettyacademy.com/AutomationPractice/


	}

}
