package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		  driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin"); 
		  driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123"); 
		  driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
