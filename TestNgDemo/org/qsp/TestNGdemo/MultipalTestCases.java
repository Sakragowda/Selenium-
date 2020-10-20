package org.qsp.TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MultipalTestCases {
	 WebDriver driver;
  @Test
  public void test1() throws InterruptedException  {  
	  driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	  System.out.println("Test case 1"); 
	  Thread.sleep(2000);
	 
  }
  @Test
  public void test2() throws InterruptedException  {  
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  System.out.println("Test case 2"); 
	  Thread.sleep(2000);
	  
  }  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
      driver = new ChromeDriver();
      driver.manage().window().maximize();        // Maximise the window
      driver.get("https://www.google.com/");
      System.out.println("Befor Method");
      Thread.sleep(2000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
	  driver.getCurrentUrl();
	  driver.close();
  }

}
