package org.qsp.Selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class abcd {
		public static void main(String[] args) throws InterruptedException, Exception
		{
		      System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe" );
		      WebDriver driver = new ChromeDriver();
		      driver.manage().window().maximize();        // Maximise the window
		      driver.get("https://www.facebook.com/");	// GGL URL		
		      Thread.sleep(2000);
		      TakesScreenshot ts = (TakesScreenshot) driver;
		      File screenShot = ts.getScreenshotAs(OutputType.FILE);   // run// its showing exception @23, but theres no diffeence
		      File screenShotSave = new File("‪./ScreenShot/FB.png");
		      //Files.copy(screenShot,screenShotSave);
		      Files.copy(screenShot,screenShotSave);
		}     
		

		//  ok
		
	   //   File screenShotSave = new File("‪./ScreenShot/FB.png");      my PATH ....ok!
	   //   Files.copy(screenShot,screenShotSave);		
		
		
		
//	public static void main(String[] args) throws InterruptedException, Exception 
//	{
//		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();//LOAD BROWSER
//		driver.manage().window().maximize();//MAXIMIZE WINDOW
//		driver.get("https://www.google.com");//load URL
//		Thread.sleep(2000);
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File screenshot = ts.getScreenshotAs(OutputType.FILE);
//		File screenShotSave = new File("./ScreenShot/google.png");
//		Files.copy(screenshot,screenShotSave);
//	}

}
