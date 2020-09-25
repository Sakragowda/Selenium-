package org.qsp.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbenLaderXP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.urbanladder.com/");	
	      Thread.sleep(10000);
	      driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	      Thread.sleep(2000);
	      List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	      //Actions a = new Actions(driver);
	      for (WebElement mene : menus)
	      {
			System.out.println(mene.getText());
		  }
	      

	}

}
