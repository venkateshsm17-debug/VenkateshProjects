package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabledemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//to read 2nd row and 3rd column
	    String cellData=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]")).getText();
	    System.out.println(cellData);
	}

}
