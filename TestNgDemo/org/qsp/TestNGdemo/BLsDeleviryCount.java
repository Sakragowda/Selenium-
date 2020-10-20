package org.qsp.TestNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BLsDeleviryCount {
  @Test
  public void BLsDeleviry() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.bluestone.com/");	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rigns",Keys.ENTER);
	    
	    WebElement dlv = driver.findElement(By.xpath("//section[@id=\"Delivery Time-form\"]/span[@class='title style-fill i-right']"));
	    Thread.sleep(2000);
	    
		
	    Actions a = new Actions(driver);
	    a.moveToElement(dlv).build().perform();
	    
	    driver.findElement(By.xpath("//span[@data-displayname='next day delivery']")).click();
	    
	 
	   //System.out.println(count);	  
	  
  }
}
