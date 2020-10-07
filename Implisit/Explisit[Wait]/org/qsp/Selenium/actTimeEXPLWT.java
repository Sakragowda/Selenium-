package org.qsp.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actTimeEXPLWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();                   // Maximise the window
	      driver.get("https://demo.actitime.com/login.do");	
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   // implisit wait
	      
	      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");    // User Name
	      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");     // Pass word
	      driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login')]")).click(); // Login	 
	      
	      driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();       // click on view Time-Track
	      
	      WebDriverWait ww = new WebDriverWait(driver, 10);
	      ww.until(ExpectedConditions.titleContains("View Time-Track"));    // If it's true then next line
	      
	      driver.findElement(By.xpath("//a[text()='Logout']")).click();	    // Logout
		
	}

}
