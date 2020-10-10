package org.qsp.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutonotificationHerouappPOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");	// heroweb
		
	}

}
