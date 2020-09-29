package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDraggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the windo 
	      
	      driver.get("https://jqueryui.com/draggable/");      // DRAGGABLE
	      
	      WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	      driver.switchTo().frame(frame);
	      
		  Actions a = new Actions(driver);
		  WebElement slider = driver.findElement(By.id("draggable"));   // DRAGGABLE
		  a.dragAndDropBy(slider, 200 , 0 ).perform();	
		  
	}

}
