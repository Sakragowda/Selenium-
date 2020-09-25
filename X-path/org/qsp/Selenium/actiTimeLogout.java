package org.qsp.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeLogout {

	public static void main(String[] args) throws InterruptedException   {
		
		
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://demo.actitime.com/login.do");	
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");  // User Name
	      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");   // Pass word
	      driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login')]")).click(); // Login
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//div[@class='menu_icon']/ancestor::div[@class='popup_menu_button popup_menu_button_support']")).click(); //Click on "?" button 
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@id='popup_menu_support_createAccountColleague']")).click();  // Creat AC  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='logout']")).click();   // Logout

	}

}
