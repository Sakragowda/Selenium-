package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClickAble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();                   // Maximise the window
	      driver.get("file:///F:/sakra%20(%20Java%20n%20SQL%20)/Selenium%20QSP%20Notes/ButtonClick.html");	 //  load URL		
		
	      
	      WebElement skey = driver.findElement(By.xpath("//input[@id='sBtn']"));
	      WebElement dkey = driver.findElement(By.xpath("//input[@id='otherBtn']"));
	      
	      WebDriverWait ww = new WebDriverWait(driver, 10);
	      ww.until(ExpectedConditions.elementToBeClickable(dkey));	
	      ww.until(ExpectedConditions.elementToBeClickable(skey));
	      skey.click();
	      dkey.click();
	}

}
