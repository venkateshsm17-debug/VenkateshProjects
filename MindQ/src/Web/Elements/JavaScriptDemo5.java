package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo5 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//To Navigate Url
	    //driver.get("https://rediffmail.com");
		js.executeScript("window.location='https://rediffmail.com'");
		Thread.sleep(5000);
		WebElement ele =driver.findElement(By.xpath("//h3[text()='Business']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

	}

}
