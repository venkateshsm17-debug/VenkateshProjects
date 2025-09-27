package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediffmail.com");
		
		//create reference object
		WebElement myObj=driver.findElement(By.linkText("Business Email"));
	
		String toolTip=myObj.getAttribute("title");
		System.out.println(toolTip);


	}

}
