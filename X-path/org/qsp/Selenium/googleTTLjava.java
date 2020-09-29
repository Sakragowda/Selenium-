package org.qsp.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTTLjava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.google.com/");	    
	      Thread.sleep(5000);
	      driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	      Thread.sleep(1000);
	      List<WebElement> hedttl = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']/span"));
	      Thread.sleep(2000);
	      for (WebElement ttl : hedttl) {
			System.out.println(ttl.getText());
		}
	    hedttl.get(2).click();	      
	    //driver.findElement(By.xpath("//div[@class='hpuQDe']")).sendKeys("hello Selenium");
	      
	}

}
