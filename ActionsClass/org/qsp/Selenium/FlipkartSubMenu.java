package org.qsp.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSubMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.flipkart.com/");	
	      Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();  // POPUP 
		  Thread.sleep(1000);
		  Actions a = new Actions(driver);
		  List<WebElement> menues = driver.findElements(By.xpath("//div[@class='_1OSP27']/span"));
		  Thread.sleep(2000);
		  for (WebElement menu : menues) {
		  String name =menu.getText();
		  System.err.println(name);
		  a.moveToElement(menu).build().perform();
		    List<WebElement> subMenu = driver.findElements(By.xpath
				  ("//span[contains(.,'"+name+"')]/parent::div/descendant::div[@class='_35d-dw']/a"));
		         for (WebElement subMenus : subMenu) 
		         {
				    System.out.println(subMenus.getText());
			     }	
		}		
		
	}

}
