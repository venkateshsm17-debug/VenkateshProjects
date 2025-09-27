package Web.Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://login.salesforce.com");
		//driver.navigate().to("https://login.salesforce.com");
		Thread.sleep(5000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//To Navigate Url
		js.executeScript("window.location='https://login.salesforce.com'");
		Thread.sleep(5000);
		//To get Java alert
		js.executeScript("window.alert('Hi, Iam JSExecutor Running')");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
