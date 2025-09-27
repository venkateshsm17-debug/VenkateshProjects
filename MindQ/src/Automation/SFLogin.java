package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFLogin {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Mindqsystems");
	driver.findElement(By.id("password")).sendKeys("Sr Nagar");
	driver.findElement(By.id("Login")).click();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
	driver.findElement(By.name("userName")).sendKeys("Mercury");
	driver.findElement(By.name("password")).sendKeys("Mercury");
	driver.findElement(By.name("submit")).click();
	}

}
