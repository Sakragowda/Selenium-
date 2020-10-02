package org.qsp.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaDcNewTBPast {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximise the window

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER); // serch JAVA
		Thread.sleep(3000);

		Actions a = new Actions(driver);
		WebElement Dclick = driver.findElement(By.xpath("//span[text()='Java']")); // JAVA element
		a.doubleClick(Dclick).build().perform(); // Double click on JAVA
		Thread.sleep(2000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);	
	//	r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	//	r.keyRelease(KeyEvent.VK_CONTROL);
		Set<String> tab = driver.getWindowHandles();
		for (String tb : tab) {
			driver.switchTo().window(tb);
			Thread.sleep(2000);
		}
   		r.keyPress(KeyEvent.VK_CONTROL);
  		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
