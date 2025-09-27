package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo3 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//To Navigate Url
		js.executeScript("window.location='https://login.salesforce.com'");
		Thread.sleep(5000);
		WebElement ele =driver.findElement(By.id("username"));
		
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px dashed red')",ele);
		
	}

}
