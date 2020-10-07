package org.qsp.Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueSoneRingToKadaAsnmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.bluestone.com/");	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement ring = driver.findElement(By.xpath("//a[@title=\"Rings\"]/parent::li[@class=\"menuparent repb\"]"));
	    
        Actions a = new Actions(driver);
        a.moveToElement(ring).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//ul[@class=\"two-col\"]/li/a[@title='Diamond Rings']")).click();              // click on Dimond
        driver.findElement(By.xpath("//img[@class=\"hc img-responsive center-block\"]/parent::a[@id='pid_7842']")).click();  // click on 1st product
   
        Set<String> wins = driver.getWindowHandles();         // Switch to new window
        for (String win : wins) {
			driver.switchTo().window(win);
	        driver.findElement(By.xpath("//span[@class='logo-icon']")).click();			
		  }       

        WebElement jwell = driver.findElement(By.xpath("//li[@class='menuparent']/a[@title='Jewellery']"));
        a.moveToElement(jwell).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//a[@title='Kadas']")).click();             // click on kada 
        driver.findElement(By.xpath("//img[@alt='The Udith Kada For Him']")).clear();  // click on 1st product 
	}

}
