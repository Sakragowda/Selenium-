package org.qsp.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BLsRingCountBlw10K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.bluestone.com/");	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rigns",Keys.ENTER);
	    
	    WebElement price = driver.findElement(By.xpath("//span[text()='Price']/parent::span"));
	    
	    Actions a = new Actions(driver);
	    a.moveToElement(price).build().perform();
	    
	    driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
	    
	    int count=0;
	    
	    List<WebElement> list = driver.findElements(By.xpath("//img[@class='hc img-responsive center-block']"));	    
	    
	    
	    for (WebElement Elist : list) {
	    	count++;
		}
	    
	    System.out.println("The number of product below 10k is : "+count);
	    driver.close();	
	}
}
