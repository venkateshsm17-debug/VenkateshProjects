package ddt.framework;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		//to specify File location
				FileOutputStream fo=new FileOutputStream("D:\\demodata.xlsx");
				//to create workbook
				XSSFWorkbook workbook= new XSSFWorkbook();
				//create sheet
				XSSFSheet sheet=workbook.createSheet("Students");
				
				//to specify Row-1
				XSSFRow row1=sheet.createRow(0);
				//to enter data in a column
				row1.createCell(0).setCellValue("St_Name");
				row1.createCell(1).setCellValue("Subject");
				
				//to specify Row-2
						XSSFRow row2=sheet.createRow(1);
						//to enter data in a column
						row2.createCell(0).setCellValue("Rajesh");
						row2.createCell(1).setCellValue("Selenium");

						//to specify Row-3
						XSSFRow row3=sheet.createRow(2);
						//to enter data in a column
						row3.createCell(0).setCellValue("Gowtham");
						row3.createCell(1).setCellValue("UFT");
						
						workbook.write(fo);
						
						System.out.println("write excel is completed");


	}

}
