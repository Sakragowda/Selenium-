package org.qsp.Selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTOP2DOWN {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	   //   driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.amazon.in");		
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      

			
//			  TakesScreenshot ts = (TakesScreenshot) driver; File screenShot =
//			  ts.getScreenshotAs(OutputType.FILE); File screenShotSave = new
//			  File("./ScreenShot/amazon3.png"); Files.copy(screenShot, screenShotSave);
//			  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			 
	      
	         

      
//	      driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']")).click();
//	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,25000)");		      
//	         TakesScreenshot t = (TakesScreenshot) driver;
//	         File screenShot1 = t.getScreenshotAs(OutputType.FILE);
//	         File screenShotSave1 = new File("./ScreenShot/amazon4.png");
//	         Files.copy(screenShot1, screenShotSave1);	    
//	         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	         
	}

}
