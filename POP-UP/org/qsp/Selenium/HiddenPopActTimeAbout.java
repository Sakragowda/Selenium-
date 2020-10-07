package org.qsp.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopActTimeAbout {

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
	      driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();;
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	      
	      driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      System.out.println(driver.findElement(By.xpath("//span[text()='actiTIME 2020 Online']")).getText());		
		
	}

}
