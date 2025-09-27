package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.facebook.com");
		driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//label[text()='Custom']")).click();
	}

}
