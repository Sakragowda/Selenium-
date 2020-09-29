package org.qsp.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipakrTiPHONE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.flipkart.com/");	   // load URL
	      Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();  // POPUP 
		  driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("i phones",Keys.ENTER);  // serch I PHONES
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='col col-7-12']/descendant::div[text()='Apple iPhone SE (Black, 64 GB)']")).click(); // click on FIRST i phone product
		  Thread.sleep(3000);
		  Set<String> tabs = driver.getWindowHandles() ;
	      for (String tab : tabs ) {  // Switch tab to another tab
	    	  driver.switchTo().window(tab);
	      }
	      driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	      Thread.sleep(2000);
	      driver.close();
		  
	}

}
