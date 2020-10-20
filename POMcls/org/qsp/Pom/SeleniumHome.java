package org.qsp.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SeleniumHome {
	
	@FindBy (name = "search")
	private WebElement search;

	public SeleniumHome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void sendText(String text, Keys enter) {
		// TODO Auto-generated method stub
		search.sendKeys(text,Keys.ENTER);
	}

       
//        @ FindBy (name = "search") 
//        private WebElement search;
        
//        public SeleniumHome(WebElement driver)
//        {
//        	PageFactory.initElements(driver, this);
//        }
//        Public void sendText(String text)
//        {
//        	search.sendKeys(text);
//        }
	}





