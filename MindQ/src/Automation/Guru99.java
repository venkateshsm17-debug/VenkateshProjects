package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("Mercury");
		driver.findElement(By.name("password")).sendKeys("Mercury");
		driver.findElement(By.name("submit")).click();
		driver.navigate().back();
		driver.navigate().forward();
	}

}

