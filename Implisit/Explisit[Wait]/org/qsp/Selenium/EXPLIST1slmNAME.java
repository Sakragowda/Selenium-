package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EXPLIST1slmNAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();                   // Maximise the window
	      driver.get("file:///F:/sakra%20(%20Java%20n%20SQL%20)/WebDev%20Rob2/EXPLISIT1slm.html");  // Load URL
	      
	      WebElement ele = driver.findElement(By.xpath("//input[@name='textA']"));       // find element
	      ele.sendKeys("name");                                                         // send NAME to BOX "A"
		
	      WebDriverWait ww = new WebDriverWait(driver, 10);
	      ww.until(ExpectedConditions.textToBePresentInElementValue(ele, "name"));      // if BOX "A" is having "name" then move to next line
	      driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("SAKRAGOWDA");
	      
	      
	}

}
