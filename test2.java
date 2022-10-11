package FirstProject;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
  
public class SeleniumFirstTest { 
    public static void main(String args[]) 
    { 
        System.setProperty( 
            "webdriver.chrome.driver", 
            "/Users/hafizfolder/selenium/chromedriver"); 
        // Instantiate a ChromeDriver class. 
        WebDriver driver = new ChromeDriver(); 
  
        // Maximize the browser 
        driver.manage().window().maximize(); 
  
        // Launch Website 
        driver.get("https://www.cimb.com.sg/en/personal/home.html"); 
