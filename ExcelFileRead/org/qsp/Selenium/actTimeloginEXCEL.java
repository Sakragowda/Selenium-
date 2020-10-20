package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actTimeloginEXCEL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://demo.actitime.com/login.do");	
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("loginButton")).click();		
		
	}

}
