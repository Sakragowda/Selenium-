package org.qsp.Selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;



public class AlertPopRuru99 {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//
//	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
//	      WebDriver driver = new ChromeDriver();
//	      driver.manage().window().maximize();        // Maximise the window
//	      driver.get("http://demo.guru99.com/test/simple_context_menu.html");	// GRUR99 URL
//	      
//		  WebElement rClick = driver.findElement(By.tagName("span"));
//	      Actions a = new Actions(driver);
//	      //a.contextClick(rClick).perform();
//	      WebElement dClick = driver.findElement(By.tagName("button"));
//	      a.doubleClick(dClick).perform();	
//	      Thread.sleep(2000);
//	      Alert al =   driver.switchTo().alert();
//	      al.accept();
	      
	
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		File screenShotSave = new File("./ScreenShot/facebook2.png");
		Files.copy(screenShot, screenShotSave);
		
	}

}
