package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.facebook.com/");	
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	      Thread.sleep(2000);
	     // WebElement day = driver.findElement(By.id("day"));
	    //  Select dy = new Select(day);	
	      driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}

}
