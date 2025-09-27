package Web.Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms09.htm");
	driver.findElement(By.xpath("//td[@class='table8']/input[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//td[@class='table8']/input[2]")).click();
	//Read all checkboxes from the page
	List<WebElement> chkBoxes =driver.findElements(By.name("Checkbox"));
	System.out.println(chkBoxes.size());
	for(WebElement check:chkBoxes) {
		if(!check.isSelected()) {
			check.click();
		}
	
		
	}


	}

}
