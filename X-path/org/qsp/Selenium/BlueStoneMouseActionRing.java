package org.qsp.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneMouseActionRing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.bluestone.com/");	
	      Thread.sleep(2000);
	      WebElement ring = driver.findElement(By.xpath("//a[@title=\"Rings\"]/parent::li[@class=\"menuparent repb\"]"));
          Actions a = new Actions(driver);
          a.moveToElement(ring).build().perform();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//ul[@class=\"two-col\"]/li/a[@title='Diamond Rings']")).click();
          driver.findElement(By.xpath("//img[@class=\"hc img-responsive center-block\"]/parent::a[@id='pid_7842']")).click();
          Set<String> wins = driver.getWindowHandles();
          for (String win : wins) {
			driver.switchTo().window(win);
		  }
          driver.findElement(By.xpath("//input[@id='buy-now']")).click();
          Thread.sleep(2000);
          System.out.println(driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText());
	}

}
