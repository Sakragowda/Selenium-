package org.qsp.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesourse {
	public static void main(String[] args) {

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
	      String pagesourse = driver.getPageSource();
	      System.out.println(pagesourse);
	      driver.close();
	}

}
