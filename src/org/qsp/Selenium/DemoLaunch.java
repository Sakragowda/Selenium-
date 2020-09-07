package org.qsp.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
 //     driver.navigate().back();
 //     Thread.sleep(2000);
 //     driver.navigate().forward();
      Thread.sleep(200);
      driver.navigate().to("https://www.Amazon.in/");
      Thread.sleep(200);
      String title = driver.getTitle();
      System.out.println(title);
      System.out.println(driver.getCurrentUrl());
      // System.out.println(driver.getPageSource());
      System.out.println(driver.getWindowHandle());
      driver.close();
      //driver.quit();
      System.out.println("WebSite launch Successfully");
	}
}
