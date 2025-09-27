package Web.Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabledemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//to read all cell values from webtable
	   WebElement cellData=driver.findElement(By.id("customers"));
	   List <WebElement> trs =cellData.findElements(By.tagName("tr"));
	   System.out.println("number of rows are"+trs.size());
	   System.out.println("Company<-------------contact------------->country");
	   for(WebElement tr:trs) {
		   List <WebElement> tds=tr.findElements(By.tagName("td"));
		   for(WebElement td:tds) {
			   System.out.println(td.getText()+"<------------->");
		   }
		 //  System.out.println(tr.getText()+"<------------->");
		   System.out.println();
		   
		   
	   }

	}

}
