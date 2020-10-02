package org.qsp.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.google.com/");	    
	      Thread.sleep(1000);
	      driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	      List<WebElement> sugg = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
	       Thread.sleep(2000);
	       for (WebElement sug : sugg) {
	    	System.out.println(sug.getText());
		}
	      // sugg.get(3).click();
	       Actions a = new Actions(driver);
	       //a.contextClick().perform();   Empty click
	      //  WebElement book = driver.findElement(By.xpath("//a[contains(.,'Books')]"));  // Book Rigth click
	        WebElement book = driver.findElement(By.xpath("//a[contains(.,'Maps')]/parent::div[@class='hdtb-mitem hdtb-imb']"));
	        a.contextClick(book).build().perform();
	}

}
