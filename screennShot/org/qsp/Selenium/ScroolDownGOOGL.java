package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolDownGOOGL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	 //     driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.google.com/");	    
	      Thread.sleep(1000);
	      driver.findElement(By.name("q")).sendKeys("google",Keys.ENTER);	
	      
	      WebElement next = driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']"));
	      
	      String ttl = driver.getTitle();
//	      while(driver.getTitle().equalsIgnoreCase(ttl))
//	      {
//	    	  
//	    	  String txt = next.getText();
//	    	  if(txt.equalsIgnoreCase("Next"))
//	    	  {
//	    		  JavascriptExecutor js = (JavascriptExecutor) driver;
//	    		  Thread.sleep(1000);
//	    		  js.executeScript("arguments[0].scrollIntoView()", next);
//	    		  next.click();
//	    	  }
//	    	  else 
//	    	  {
//				ttl = driver.getCurrentUrl();
//			  }
//	      }
	      String txt = next.getText();
	      while (txt.equalsIgnoreCase("Next"))
	      {
    		  JavascriptExecutor js = (JavascriptExecutor) driver;
    		  Thread.sleep(1000);
    		  js.executeScript("arguments[0].scrollIntoView()", next);
    		  next.click();	 
    		  Thread.sleep(1000);
    		  next = driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']"));
    		  txt = next.getText();	  
	      }
	      
	      
		
	}

}
