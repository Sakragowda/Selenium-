package org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actTimePOM {

	@FindBy (id = "username")
	private WebElement id;
	@FindBy (name = "pwd")
	private WebElement name;
	
	public actTimePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}	

	public void sendUserName(String text) {
		// TODO Auto-generated method stub
		id.sendKeys(text);
	}	
	public void sendPassWord(String text1) {
		// TODO Auto-generated method stub
		name.sendKeys(text1);
	}	
	
}
