package Web.Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabledemo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//to read all cell values from webtable 
	   WebElement cellData=driver.findElement(By.id("customers"));

	   //to find number of td tags
	   List <WebElement> tds =cellData.findElements(By.tagName("td"));
	   for(WebElement td:tds) {
		   System.out.println(td.getText());
		 //to find number of td tags
//		   List <WebElement> ths =cellData.findElements(By.tagName("th"));
//		   for(WebElement th:ths) {
//			   System.out.print(th.getText()+"<-------->");
		  // }

	   }
	   
	}

}
