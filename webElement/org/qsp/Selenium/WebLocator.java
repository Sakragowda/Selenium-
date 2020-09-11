package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
	      Thread.sleep(200);
		  WebElement serchEngine = driver.findElement(By.name("q"));
	      serchEngine.sendKeys("selenium",Keys.ENTER);		
		  WebElement serch = driver.findElement(By.name("btnk"));
	      serch.sendKeys("selenium");			
	}

}
