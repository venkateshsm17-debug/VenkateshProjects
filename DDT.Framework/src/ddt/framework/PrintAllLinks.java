package ddt.framework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		List<WebElement> pgLinks=driver.findElements(By.tagName("a"));
		
		//File Location
		FileOutputStream fo= new FileOutputStream("D:\\pglinks.xlsx");
		//to create workbook		
		XSSFWorkbook wb= new XSSFWorkbook();
		//create sheet
		XSSFSheet ws= wb.createSheet("links");
				
		
		  for(int i= 0; i<= pgLinks.size()-1; i++) { 
			  XSSFRow row1= ws.createRow(i);
		  if(!pgLinks.get(i).getText().isEmpty()) {
		  row1.createCell(0).setCellValue(pgLinks.get(i).getText());
		  }
		  }
		 
		  wb.write(fo);
		wb.close();
		fo.close();
		
		
		System.out.println("Writing data in excel was completed");
		System.out.println(pgLinks.size());
	}
	
}
