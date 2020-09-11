package org.qsp.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.actitime.com/login.do");		
	      WebElement userName = driver.findElement(By.id("username"));
	      userName.sendKeys("admin"); 
	      WebElement Password = driver.findElement(By.name("pwd"));
	      Password.sendKeys("manager");
	      WebElement Login = driver.findElement(By.id("loginButton"));
	      Login.click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("logoutLink")).click();
	      
	      //GetAlertText
	    
	 
	}

}
