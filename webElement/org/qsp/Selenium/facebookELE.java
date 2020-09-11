package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookELE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      Thread.sleep(200);		
	      WebElement userName = driver.findElement(By.id("email"));
	      userName.sendKeys("sakra3196@gmail.com"); 	
	     // WebElement Password = driver.findElement(By.id("pass"));
	      driver.findElement(By.id("pass")).sendKeys("sakra",Keys.ENTER);
	    //  WebElement Login = driver.findElement(By.name("login"));
	   //   Login.click();
	      	      
	}

}
