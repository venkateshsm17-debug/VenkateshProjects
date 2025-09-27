package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;

	@BeforeTest
	@Parameters({"testBrowser"})
	public void setUp(@Optional("ff") String browserName) {
		switch (browserName.toUpperCase()) {
		case "CHROME":
			//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Tests are running in Chrome browser");
			break;
		case "FF":
			//System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Tests are running in FF browser");
			break;
		case "EDGE":
			//System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Tests are running in Edge browser");
			break;
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@Test(dataProvider="LoginData")
	public void OHRMLoginTest(String uid, String pwd) throws InterruptedException {
		Thread.sleep(5000);
		// to perform login operation
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);

		// to check "Dashboard" element visiblity
		try {
			if (driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
				System.out.println("Successful login operation");
				// to perform logout operation
				driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("Logout")).click();
			}
		} catch (Exception e) {
			System.out.println("Unsuccessful login operation");
			
		}
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider (name="LoginData")
	public Object[][] getData(){
		Object[][] data= {{"Admin","admin123"}};
		return data;
	}

}
