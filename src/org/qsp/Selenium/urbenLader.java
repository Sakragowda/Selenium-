package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class urbenLader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.urbanladder.com/");	
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[@class='popup-text text-center vert large-6 columns']/a[@class='close-reveal-modal hide-mobile']")).click();
	    //  Thread.sleep(200);
	    //  driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/span[@class='topnav_itemname']"));
	      
   
	      
	      
	}
}
