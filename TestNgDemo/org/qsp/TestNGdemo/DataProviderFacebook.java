package org.qsp.TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Arrays;

public class DataProviderFacebook {
  @Test(dataProviderClass = org.qsp.TestNGdemo.ReadFromExcel.class , dataProvider = "read")
  public void FaceBook(String name,String pass) throws  Exception {
	  
      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      Thread.sleep(200);	
      driver.findElement(By.id("email")).sendKeys(name);;
      driver.findElement(By.id("pass")).sendKeys(pass,Keys.ENTER);
  }
}
