package Selenium_Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_Handle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.naukri.com/"); 		   
		 
		  driver.findElement(By.xpath("//img[@src='https://static.naukimg.com/s/4/100/i/naukri_Logo.png']")).click();
		  		  
		  		 
		     Set<String> c=driver.getWindowHandles();  // parent id and child browser
		     
		     Iterator<String> it=c.iterator();
		     String parent_Window=it.next(); 
		     String child_Window=it.next(); 
		   		     
		     driver.switchTo().window(child_Window);  //control will come to child window
		     
		     System.out.println(driver.getCurrentUrl()); //Child URL
		     //http://www.qaclickacademy.com/    
		 		   

		     driver.switchTo().window(parent_Window);
		     System.out.println(driver.getCurrentUrl()); //Parent URL
		     //https://rahulshettyacademy.com/AutomationPractice/


	}

}
