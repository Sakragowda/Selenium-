package org.qsp.Selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadGurur99POP {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("http://demo.guru99.com/test/upload/");	// GRUR99 URL
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //  Thread.sleep(3000);
	      driver.findElement(By.xpath("//div[@id='file_wraper0']/input[@id='uploadfile_0']")).click();
	   //   Runtime Run = Runtime.getRuntime();
		//  Run.exec("‪F:\\sakra ( Java n SQL )\\WebDev Rob2\\UploadAUOIT.exe");
	}

}
