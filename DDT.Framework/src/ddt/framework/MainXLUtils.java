package ddt.framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainXLUtils {

	public static void main(String[] args)  throws Exception {
			
			
			WebDriver driver= new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//path of excel file
			String path="D:\\demodata2.xlsx";
			//to set working file
			XLUtils.setExcelFile(path, "Students");
			//XLUtils.getCellCount(path, "Students",rows);
			int rows=XLUtils.getRowCount(path, "Students");
			
			for(int i =1; i<= rows; i++) {
				String uid= XLUtils.getCellData(path, "Students", i, 0);
				String pwd=XLUtils.getCellData(path, "Students", i, 1);
				
				//To perform login operation
				driver.findElement(By.name("userName")).sendKeys(uid);
				driver.findElement(By.name("password")).sendKeys(pwd);
				Thread.sleep(8000);
				driver.findElement(By.name("submit")).click();
				Thread.sleep(8000);
				//to read page title
				String pgTitle=driver.getTitle();
				if(pgTitle.equals("Login: Mercury Tours")) {
					System.out.println("Test passed");
					XLUtils.setCellData(path, "Students", i, 2, "Successful login operation");
					Thread.sleep(8000);
					driver.findElement(By.linkText("SIGN-OFF")).click();
					
					
				}
				else {
					System.out.println("Test Failed");
					XLUtils.setCellData(path, "Students", i, 2, "Unsuccessful login operation");
				}
				
				driver.get("http://demo.guru99.com/test/newtours/");

			}
			driver.close();  
		}

}
