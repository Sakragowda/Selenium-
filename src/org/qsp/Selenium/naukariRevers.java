package org.qsp.Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class naukariRevers {
   public static void main(String[] args) {
	
	     System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.naukri.com/"); 
	     @SuppressWarnings("unused")
		 String parenthandel = driver.getWindowHandle();
	     System.out.println(parenthandel);
	     @SuppressWarnings("unused")
		 Set<String> allWindowhandels = driver.getWindowHandles();
	     ArrayList<String> arr = new ArrayList<String>(allWindowhandels);
	     for (int i =arr.size() - 1 ; i >= 0 ; i--) {
	    	 System.out.println(arr.get(i));
	    	 driver.switchTo().window(arr.get(i));
	    	 driver.close();
	     
	     }
	    	  
   }
}
