package com.OHRM.TestScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.OHRM.lib.LoginKeywords;

public class OHRMLoginTest {
	@Test
	public void loginTest() throws IOException, InterruptedException {
		LoginKeywords loginKeys=new LoginKeywords();
		FileInputStream fi= new FileInputStream("./Keywords//48bActionsKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//to find number of rows
		int rows=ws.getLastRowNum();
		for(int i=1; i<= rows; i++) {
			//to read runmode
			String runMode=ws.getRow(i).getCell(4).toString();
			if(runMode.equals("YES")) {
				//to read Keyword
				String KW=ws.getRow(i).getCell(3).toString();
				
				switch (KW)
				{
				case"launchBrowser":
					loginKeys.launchBrowser();
					break;
				case"navigateURL":
					loginKeys.navigateURL();
					break;
				case"enterUsername":
					loginKeys.enterUsername();
					break;
					
				case"enterPassword":
					loginKeys.enterPassword();
					break;
				case"clickLogin":
					loginKeys.clickLogin();
					break;
				}
			}
		}
		
		
	}


}
