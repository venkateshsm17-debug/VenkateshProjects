package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtJourneyDate")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//        driver.findElement(By.xpath("//span[text()='August']")).click();
//		driver.findElement(By.linkText("15")).click();
		//To select 15th August
		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/table/tbody/tr[3]/td[6]/a")).click();

	}

}
