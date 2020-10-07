package org.qsp.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectOptonHTML {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("file:///F:/sakra%20(%20Java%20n%20SQL%20)/WebDev%20Rob2/seleniumoptions.html");	
		  Thread.sleep(2000);
		  WebElement multi = driver.findElement(By.id("b"));
		  Select s = new Select(multi);
		  if(s.isMultiple())
		  {
			List<WebElement> opts = s.getOptions();
			s.selectByValue(opts.get(2).getText());
			Thread.sleep(2000);                                    // select options
			s.selectByValue(opts.get(0).getText());
			
			Thread.sleep(2000);
			System.out.println("!st option "+s.getFirstSelectedOption().getText());
			
		/*	for (WebElement opt : opts) {
				s.selectByValue(opt.getText());                   // select all options
				Thread.sleep(1000);  
			}   */
			List<WebElement> os = s.getAllSelectedOptions();
			for (WebElement slop : os) {                           // get all selected options
				System.out.println(slop.getText());		
			}
			
			
		//	s.deselectByIndex(2);
		//	s.deselectByValue("323");
		//	s.deselectByVisibleText("323");                         // De-select the options
			s.deselectAll();
			
			
		  }
		
	}

}
