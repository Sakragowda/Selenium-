package org.qsp.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlsRingDeliveryCount {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub


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
		    
		    Robot r = new Robot();
		    
		   int count=0; 
		   List<WebElement> prd = driver.findElements(By.xpath("//div[@class='pr-i lazyload-bg']"));
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   for (@SuppressWarnings("unused") WebElement prds : prd)
		   {
			  // driver.findElement(By.xpath("//img[@alt=\"Loading..\"]/parent::div[@id='loadmoreajaxloader']")).click();
			   r.mouseWheel(50);
			   Thread.sleep(1000);
			   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			   count++;
		   }
		   System.out.println(count);
		   
	  }		
		
}


