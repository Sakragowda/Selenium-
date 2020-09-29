package org.qsp.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraSubMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.myntra.com/");
	      Actions a = new Actions(driver);
	      List<WebElement> menu = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
	      Thread.sleep(2000);
	      for (WebElement menus : menu) 
	      {
		   System.err.println(menus.getText());
		   a.moveToElement(menus).perform();
		     List<WebElement> subMenu = driver.findElements(By.xpath("//ul[@class='desktop-navBlock']/li"));
		     for (WebElement subMenus : subMenu) 
		     {
			   System.out.println(subMenus.getText());
		     }
		 }
	}
}
