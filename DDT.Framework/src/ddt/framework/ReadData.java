package ddt.framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		//to specify file location
				FileInputStream fi= new FileInputStream("D:\\demodata.xlsx");
				//to specify workbook
				XSSFWorkbook workbook= new XSSFWorkbook(fi);
				//to specify worksheet
				XSSFSheet sheet=workbook.getSheet("Students");
				//to find number of rows
				int rows=sheet.getLastRowNum();
				int cols=sheet.getRow(0).getLastCellNum();
				System.out.println("Number of rows are: "+(rows+1));
				System.out.println("Number of columns are: "+cols);
				/*
				 * XSSFRow row1=sheet.getRow(0);
				 *  XSSFCell cell1= row1.getCell(0);
				 *   XSSFCellcell2= row1.getCell(1); 
				 *   String myVal1=cell1.toString(); 
				 * String myVal2=cell2.toString();
				 *  System.out.print(myVal1+"\t");
				 * System.out.print(myVal2+"\t"); 
				 * System.out.println();
				 */
				
				for(int r=0; r<= rows; r++) {   
					XSSFRow row=sheet.getRow(r);//r0//St_Name	Subject	
					                            //r1//Rajesh	Selenium
					for(int col=0; col<cols;col++) {
						XSSFCell cell= row.getCell(col);
						String myVal=cell.toString();
					   System.out.print(myVal+"\t");
						
					}
					System.out.println();
				}


	}

}
