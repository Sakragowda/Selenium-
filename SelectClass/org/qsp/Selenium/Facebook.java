package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.facebook.com/");	
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[text='Create New Account']")).click();
	      Thread.sleep(2000);
	      WebElement day = driver.findElement(By.id("day"));
	      Select dy = new Select(day);
	   //   dy.selectByIndex(9);
	   //   dy.selectByValue("9");
	      dy.selectByVisibleText("9");
		
	}

}
