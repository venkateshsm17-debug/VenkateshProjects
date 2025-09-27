package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo3 {

	public static void main(String[] args) {
		// To initialize the browser
				WebDriver driver = new ChromeDriver();
				driver.get("https://google.co.in");
				driver.manage().window().maximize();
				
				//To create Object for Search editbox
				WebElement ele= driver.findElement(By.name("q"));
				
				Actions actObj= new Actions(driver);
				
				//To enter "madhukarqait youtube channel" then to click on "Enter" key
				
				actObj.keyDown(Keys.SHIFT).sendKeys(ele, "madhukarqait youtube channel").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
			

	}

}
