package org.qsp.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AlertPopRuru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("http://demo.guru99.com/test/simple_context_menu.html");	// GRUR99 URL
	      
		  WebElement rClick = driver.findElement(By.tagName("span"));
	      Actions a = new Actions(driver);
	      //a.contextClick(rClick).perform();
	      WebElement dClick = driver.findElement(By.tagName("button"));
	      a.doubleClick(dClick).perform();	
	      Thread.sleep(2000);
	      Alert al =   driver.switchTo().alert();
	      al.accept();
	      
		
	}

}
