package org.qsp.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOrg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		  // actTime
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	 //   driver.manage().window().maximize();
	      driver.get("https://www.seleniumhq.org");		
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      WebElement drv = driver.findElement(By.xpath("//input[@id='gsc-i-id1']"));
	      drv.sendKeys("java",Keys.ENTER);
	      Thread.sleep(3000);
		  driver.navigate().back();
		  drv.sendKeys("testing",Keys.ENTER);
		  Thread.sleep(2000);
	}

}
