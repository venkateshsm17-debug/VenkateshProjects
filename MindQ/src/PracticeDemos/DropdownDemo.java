package PracticeDemos;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Automation Training']")).click();
		/*
		 * Select cl=new Select(driver.findElement(By.id("country")));
		 * cl.selectByValue("IN");
		 */

	}

}