package org.qsp.Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneRINGproduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://www.bluestone.com/jewellery.html");  // load URL
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("Rings",Keys.ENTER);  // Serch  RIGNS
	      Thread.sleep(2000);
          driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();    // Click on 1ST product
          Set<String> tabs = driver.getWindowHandles();
          for (String tab : tabs) {
        	  driver.switchTo().window(tab);
		}
        driver.findElement(By.xpath("//span[@class='ring-size-box']")).click();      // view d SIZE
        Thread.sleep(2000);
         List<WebElement> size = driver.findElements(By.xpath("//ul[@id='sizeDropdown']/li"));
         for (WebElement mySize : size) {
			System.out.println(mySize.getText());       // Print all d avilable Size's
		}
        size.get(4).click();                   // Select d SIZE
        driver.findElement(By.xpath("//input[@class='exclusive btn style2 btn-block addToCart']")).click();  // click on BUY
        driver.findElement(By.xpath("//div[@class='place-order-wrap']")).click();   // PLACE ORDER
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='shippingAddress.customerId.email']")).sendKeys("SAKRA3196@GMAIL.COM");       // MAIL
        driver.findElement(By.xpath("//input[@id='contactNumber']")).sendKeys("7411943494");  // NUM
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='btn btn-lg proceed-to-addr']")).click(); // click on CONTINUE
	}

}
