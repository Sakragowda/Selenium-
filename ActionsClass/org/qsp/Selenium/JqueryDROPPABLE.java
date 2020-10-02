package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDROPPABLE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the windo 
	      
	      driver.get("https://jqueryui.com/droppable/");   // DROPPABLE URL
	      
	      WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	      driver.switchTo().frame(frame);
	      
	      Actions a = new Actions(driver);
	      WebElement drop = driver.findElement(By.id("draggable"));
	      Thread.sleep(2000);
	      WebElement dropPlace = driver.findElement(By.id("droppable"));
	    //  WebElement tl = driver.findElement(By.xpath("//div[@style='position: relative; left: 159px; top: 50px']"));
	      a.dragAndDrop(drop, dropPlace).perform();
	      Thread.sleep(2000);
	      System.out.println(dropPlace.getText());
	      drop.sendKeys();		
		
	}

}
