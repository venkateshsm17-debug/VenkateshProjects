package com.Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OHRMLoginTest {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("initialization script executed");

	}
	
	@Test
	public void adminLogin() {
		try {
			if (driver.findElement(By.name("username")).isDisplayed()) {
				Reporter.log("'User name' Editbox displayed and Login script is executing...", true);

				// to perform login operation
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();

				// to check element present
				boolean myStatus = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
				Assert.assertEquals(myStatus, true);
				Reporter.log("Successful login operation", true);
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Unsuccessful login operation");
		}

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		System.out.println("Application closed");

	}


}
