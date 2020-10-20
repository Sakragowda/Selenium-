package org.qsp.Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OutPutStreamUrbenLader {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
     FileInputStream fis = new FileInputStream(".\\OutPutStreamUrbenLader.xlsx");
     Workbook wb = WorkbookFactory.create(fis);
     int row = 0;
	 Date value = null;
	 wb.getSheet("Sheet1").createRow(row).createCell(row).setCellValue(value);;
     FileOutputStream fos = new FileOutputStream(".\\OutPutStreamUrbenLader.xlsx");   
	 wb.write(fos);
	}

}
