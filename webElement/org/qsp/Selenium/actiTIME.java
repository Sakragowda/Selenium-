package org.qsp.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTagName;

public class actiTIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.actitime.com/login.do");	
	      driver.findElement(By.linkText("actiTIME Inc.")).click();
	      Set<String> tabs = driver.getWindowHandles();
	      for (String tab : tabs) {
	    	  driver.switchTo().window(tab);
	      }
	      @SuppressWarnings("unused")
		  String titele = driver.getTitle();
	      driver.close();
	      System.out.println(titele);
	     
	}

}
