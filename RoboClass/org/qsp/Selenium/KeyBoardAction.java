package org.qsp.Selenium;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAction {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      Robot r = new Robot();
	      r.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	      r.keyPress(java.awt.event.KeyEvent.VK_T);
	      r.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	      r.keyRelease(java.awt.event.KeyEvent.VK_T);	 
	        
	}

}
