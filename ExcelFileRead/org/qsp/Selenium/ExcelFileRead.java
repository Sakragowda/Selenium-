package org.qsp.Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFileRead {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(".\\ioOpertation.xlsx");
	//	FileOutputStream fl = new FileOutputStream("");
	      System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();        // Maximise the window
	      driver.get("https://demo.actitime.com/login.do");	
	      Thread.sleep(2000);		
	      
	      //Excel file import
	      
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount = sh.getPhysicalNumberOfRows();
		int colCount = sh.getRow(0).getLastCellNum();

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				
				Cell c1 =  sh.getRow(i).getCell(j);             //.getCell(j);
				if(j%2 == 0 && i>0)
				{	                
				    String userName = c1.toString();
				    driver.findElement(By.id("username")).sendKeys(userName);
				    Thread.sleep(2000);		
	    		    System.out.print(userName+"   ");
				}
				else 
				{	
					  String passWord = c1.toString();
				      driver.findElement(By.name("pwd")).sendKeys(passWord);
				      Thread.sleep(4000);	
				      System.out.println("    "+passWord);
				      
				}

		//	    System.out.print("            "+ c1 +"        ");
	
			}
             System.out.println();
             driver.findElement(By.id("loginButton")).click();
             Thread.sleep(2000);
		}

	}

}
