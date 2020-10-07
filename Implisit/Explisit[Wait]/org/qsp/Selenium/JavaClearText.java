package org.qsp.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaClearText {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     // Thread.sleep(2000);
	      driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);	
	      driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
		
	}

}
