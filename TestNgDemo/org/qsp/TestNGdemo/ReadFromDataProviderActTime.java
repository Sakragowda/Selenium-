package org.qsp.TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ReadFromDataProviderActTime {
	int passed , fail ;
  @Test(dataProviderClass = org.qsp.TestNGdemo.ReadFromExcel.class , dataProvider = "read")
  
  public void m1(String name,String pass) throws InterruptedException , Exception { 
	  
      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();          // Maximise the window
      driver.get("https://demo.actitime.com/login.do");	
      
      Thread.sleep(2000);
      
      driver.findElement(By.id("username")).sendKeys(name);
      driver.findElement(By.name("pwd")).sendKeys(pass);
      Thread.sleep(2000);
      driver.findElement(By.id("loginButton")).click();	  
      String ttl = driver.getTitle();
      
      if(ttl.equals("View Time-Track")) {
    	  passed++;
    	  System.out.println("passed Testcase user & pass = "+name + " : "+pass);
      }
      else
      {
    	  fail++;
    	  System.out.println("failed Testcase user & pass = "+name + " : "+pass);
      }
      
	  System.out.println("pass Testcase count :"+passed);
	  System.out.println("failed Testcase count :"+fail);
  
	  
  }
}
