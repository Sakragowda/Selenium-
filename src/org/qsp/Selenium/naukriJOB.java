package org.qsp.Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriJOB {
 public static void main(String[] args) {
	
     System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.naukri.com/"); 
     @SuppressWarnings("unused")
	 String parenthandel = driver.getWindowHandle();
     System.out.println(parenthandel);
     @SuppressWarnings("unused")
	 Set<String> Windowhandels = driver.getWindowHandles();
     Windowhandels.remove(parenthandel);
     for (String wind : Windowhandels) {
    	 System.out.println(wind);
    	 driver.switchTo().window(wind);
    	 driver.close();
     }
     
}
}
