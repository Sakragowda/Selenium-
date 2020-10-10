package org.qsp.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class actTimeFPW {


	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://demo.actitime.com/login.do");	
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");  // User Name
	      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");   // Pass word
	      driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login')]")).click(); // Login	
	      Thread.sleep(5000);
	      
	      
	      String path = "./ScreenShot/ActTime.png";
	      
	      WebDriverWait ww = new WebDriverWait(driver, 5);
	      ww.until(ExpectedConditions.titleContains("actiTIME - Login"));	      
	      System.out.println("Out put message = "+takescreenshot(driver,path));
	      
	      ww.until(ExpectedConditions.titleContains("actTIME - Enter Time-Track"));	      
	      System.out.println("Out put message = "+takescreenshots(driver,path));	      
	      
	}

	private static String takescreenshots(WebDriver driver, String path) throws Exception {
		// TODO Auto-generated method stub
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        File screenShotSave = new File(path);
        Files.copy(screenShot, screenShotSave);			
        String erro = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		
		return erro;
	}

	private static String takescreenshot(WebDriver driver, String path) throws IOException
	{
		// TODO Auto-generated method stub
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        File screenShotSave = new File(path);
        Files.copy(screenShot, screenShotSave);	  
        String erro = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
        
        return erro;
	}

}
