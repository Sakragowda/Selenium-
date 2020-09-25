package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class act {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://demo.actitime.com/login.do");	
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@id='popup_menu_support_createAccountColleague']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@class='logout']")).click();
	      //Thread.sleep(2000);
	      //driver.close();
	}

}
