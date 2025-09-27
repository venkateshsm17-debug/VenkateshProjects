package Web.Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo4 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//To Navigate Url
	    //driver.get("https://rediffmail.com");
		js.executeScript("window.location='https://rediffmail.com'");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		

	}

}
