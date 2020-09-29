package org.qsp.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class bangalore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeKey="webdriver.chrome.driver";
		String chromeDriverPath ="./software/chromedriver.exe";
		System.setProperty(chromeKey, chromeDriverPath);
		System.out.println(System.getProperty(chromeKey));
		
		ChromeDriver driver = new ChromeDriver();
	}

}
