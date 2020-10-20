package org.qsp.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class NotificationPopRedBus {

	public static void main(String[] args) throws InterruptedException {
	

	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );    
	    ChromeOptions c = new ChromeOptions();
	    c.addArguments("--disable-notifiactions");
	    WebDriver driver = new ChromeDriver(c);
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.redbus.in/");      // load URL
		
	}

}
