package org.qsp.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upPOP {

	public static void main(String[] args) throws InterruptedException, Throwable {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("http://demo.guru99.com/test/upload/");	// GRUR99 URL
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("//div[@id='file_wraper0']")).click();
	      Thread.sleep(2000);
	      Runtime r = Runtime.getRuntime();
	      Thread.sleep(2000);
	      r.exec("‪F:\\sakra ( Java n SQL )\\WebDev Rob2\\UP.exe");
	      
	}

}
