package org.qsp.Selenium;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacbookCaMonths {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.facebook.com/");	
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	      Thread.sleep(2000);
	      WebElement mon = driver.findElement(By.id("month"));
	      Select mn = new Select(mon);
	      
	      List<WebElement> months = mn.getOptions();       // we can get into consule
	      
	//      TreeSet<String> set = new TreeSet<String>();     // NATURAL Sorting order
         Set<String> set = new TreeSet<String>();        // UPCOSTED TO SET INTERFACE 
	      
	      for (WebElement month : months) {
	    	  System.out.println(month.getText());
	    	  set.add(month.getText());
	    	  if(month.getText().equalsIgnoreCase("May"))
	    		  mn.selectByVisibleText("May");
			
		}
	      System.out.println("****************************************");
	      for (String  month : set) {
			System.out.println(month);
		}
	      
	}

}
