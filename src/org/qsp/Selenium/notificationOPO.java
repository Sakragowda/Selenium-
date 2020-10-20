package org.qsp.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationOPO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );  
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--disable-notifications");
	    
	    WebDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.redbus.in/");      // load URL
	    
	}

}
