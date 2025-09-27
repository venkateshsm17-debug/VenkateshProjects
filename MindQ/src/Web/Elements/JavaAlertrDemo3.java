package Web.Elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertrDemo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Alerts']"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		Thread.sleep(4000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(4000);
		Alert enterName=driver.switchTo().alert();
		Thread.sleep(5000);
		enterName.sendKeys("Venkatesh");
		//enterName.accept();
		enterName.dismiss();

	}

}
