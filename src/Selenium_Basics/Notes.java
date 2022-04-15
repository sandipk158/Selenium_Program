package Selenium_Basics;

public class Notes {

}

//IF we try to use any method after driver.close it will give invalid session id
// IF we try to use any method after driver.quit it will give null session id  

/*get() is used to navigate particular URL(website) and wait till page load. 
 * driver. navigate() is used to navigate to particular URL and does not wait to page load. 
It maintains browser history or cookies to navigate back or forward.*/	

//Locator Techniques
//id
//classname--
//name
//tagname
//xpath
//css
//link text
//partial link text

/*Xpath type
Relative
Absulute--Parent --Child 

tagname--purple color and first word
Attribute=--orange color
value==blue color

//Syntax
//Xpath Syntax -- //tagname[@attribute='value'] 
//CSS syntax -- tagname[attribute='value']  
 
(//div[@id='username_container']//input)[1]
*/

/*Static wait and dynamic waits


Static waits
Thread.sleep--(java)-- it will wait for 10 seconds sure


Dynamic waits-


Selenium Waits-Synchronization in selenium-\

1.Implicit---

We will declare it globally
2.Explicit-to the specific elements
    1.Webdriver Wait --
    2.Fluent wait
*/