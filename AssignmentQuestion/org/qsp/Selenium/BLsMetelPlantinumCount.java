package org.qsp.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BLsMetelPlantinumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.bluestone.com/");	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rigns",Keys.ENTER);
	    
	    WebElement price = driver.findElement(By.xpath("//span[text()='Metal']"));
	    
	    Actions a = new Actions(driver);
	    a.moveToElement(price).build().perform();
	    
	    driver.findElement(By.xpath("//span[@data-displayname='platinum']")).click();
	    
	    List<WebElement> ele = driver.findElements(By.xpath("//ul[@class=\"product-grid search-box-result\"]/li"));
	    
	    int count=0;
	    for (WebElement el : ele) {
			count++;
			System.out.println(el.getText());
		}
	    System.out.println(count);
		
	}

}
