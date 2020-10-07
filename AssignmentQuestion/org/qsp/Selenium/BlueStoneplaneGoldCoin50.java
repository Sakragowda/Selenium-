package org.qsp.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneplaneGoldCoin50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();        // Maximise the window
	    driver.get("https://www.bluestone.com/");	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
	    
	    Actions a = new Actions(driver);
	    a.moveToElement(coin).build().perform();
	    WebElement pCoin = driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-50gms,m']"));
	    pCoin.click();
	    
	      WebDriverWait ww = new WebDriverWait(driver, 10);
	      ww.until(ExpectedConditions.titleContains("50 gram 24 KT Gold Coin"));
	      System.out.println(driver.getTitle());
	      driver.close();	
	      
	      
	}

}
