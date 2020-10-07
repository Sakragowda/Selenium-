package org.qsp.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneLakshmi5gm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.bluestone.com/");	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rigns",Keys.ENTER);
	    
	    WebElement price = driver.findElement(By.xpath("//span[text()='Price']/parent::span[@class='title style-fill i-right']"));
	    
	    Actions a = new Actions(driver);
	    a.moveToElement(price).build().perform();
	    WebElement pCoin = driver.findElement(By.xpath("//span[@class='prcs-dlh']/parent::div[@class='form-item selected ']"));
	    pCoin.click();
	    
	      WebDriverWait ww = new WebDriverWait(driver, 10);
	      ww.until(ExpectedConditions.titleContains("5 gram 24 KT Lakshmi Gold Coin"));
	      System.out.println(driver.getTitle());
	      driver.close();	
	      
	      		
		
	}

}
