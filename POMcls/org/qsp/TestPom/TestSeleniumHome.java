package org.qsp.TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.Pom.SeleniumHome;

public class TestSeleniumHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.seleniumhq.org");		
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          SeleniumHome sh = new SeleniumHome(driver);
          sh.sendText("java",Keys.ENTER);
          Thread.sleep(2000);
          driver.navigate().back();
          Thread.sleep(2000);
          sh.sendText("testing",Keys.ENTER);
	}

}
