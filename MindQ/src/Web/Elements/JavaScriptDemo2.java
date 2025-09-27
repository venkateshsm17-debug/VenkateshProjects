package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo2 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//To Navigate Url
		js.executeScript("window.location='https://login.salesforce.com'");
		Thread.sleep(5000);
		//js.executeScript("window.document.getElementById('username').value='MindQ'");
		WebElement element=driver.findElement(By.xpath("//input[@type='email']"));
		js.executeScript("arguments[0].value='MindQ';",element);
		//element.sendKeys("vs");
		Thread.sleep(5000);
		//To click on "Login"
		WebElement ele=driver.findElement(By.id("Login"));
		js.executeScript("arguments[0].click()", ele);

	}

}
