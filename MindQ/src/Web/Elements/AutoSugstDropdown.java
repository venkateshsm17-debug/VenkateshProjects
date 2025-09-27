package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSugstDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.name("fromPlaceName")).sendKeys("hyd");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='HYDERABAD DARSHAN 3']")).click();
		driver.findElement(By.name("toPlaceName")).sendKeys("sur");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='SURYAPET']")).click();
		driver.findElement(By.id("txtJourneyDate")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		driver.findElement(By.xpath("//span[text()='August']")).click();
		driver.findElement(By.linkText("16")).click();
	}

}
