package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fram_Handle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();	
		
		driver.get("http://jqueryui.com/droppable/");
		WebElement k=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(k); //This will switch control inside the frame
		
		Actions i=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		i.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); //This will switch back control to the normal window 
		
		driver.findElement(By.xpath("//a[@href='http://jqueryui.com/sortable/']")).click();

	}

}
