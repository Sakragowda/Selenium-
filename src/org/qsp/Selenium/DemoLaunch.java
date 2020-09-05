package org.qsp.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.close();
      System.out.println("web is launching Succesfully");
	}

}
