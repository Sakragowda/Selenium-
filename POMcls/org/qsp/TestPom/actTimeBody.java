package org.qsp.TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.Pom.actTimePOM;

public class actTimeBody {



	public actTimeBody(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	     // driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://demo.actitime.com/login.do");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	      driver.findElement(By.id("username")).sendKeys("admin");
//	      Thread.sleep(2000);
//	      driver.findElement(By.name("pwd")).sendKeys("manager");
//	      Thread.sleep(2000);

	      actTimePOM act = new actTimePOM(driver);
	      act.sendUserName("admin");
	      //driver.findElement(By.id("username")).sendKeys("sakra");
	      Thread.sleep(2000);
	      act.sendPassWord("sakra3196");
	      Thread.sleep(2000);
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(5000);
	      driver.navigate().back();
          //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      Thread.sleep(2000);
	      //driver.findElement(By.id("username")).sendKeys("admin");
	      act.sendUserName("admin");
	      Thread.sleep(2000);
	      act.sendPassWord("manager");
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(3000);  
		  
	}

}
