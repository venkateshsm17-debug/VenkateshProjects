package com.StepDef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MTLogin {
	public static WebDriver driver;
	
	
	@Given("^initialize browser$")
	public void open_chrome_browser_and_enter_url() throws IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\SelResource\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
	}
	
	@When("^user login$")
	public void user_login() throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();;
		Thread.sleep(5000);
	}
	
	
	@Then("^successful login operation$")
	public void successful_login_operation() {
		if(driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
			System.out.println("Successful login operation");
		}  
		else {
			System.out.println("Unsuccessful login operation");
		}
	}
}
