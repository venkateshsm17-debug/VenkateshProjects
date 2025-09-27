package oops.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OopsDemo6GL {
	WebDriver driver;

	// Method-1: To initialize Browser
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		System.out.println("Initialized Browser");

	}

	// Method-2: To select specified language link
	public void langSelect(String myLanguage) throws InterruptedException {
		driver.findElement(By.linkText(myLanguage)).click();
		Thread.sleep(4000);
		System.out.println("selected language is: " + myLanguage);
	}

	// Method-3: to close application
	public void tearDown() {
		driver.close();
		System.out.println("Application closed");
	}

	public static void main(String[] args) throws InterruptedException {
		OopsDemo6GL gl = new OopsDemo6GL();
		gl.setUp();
		gl.langSelect("తెలుగు");
		gl.langSelect("हिन्दी");
		gl.langSelect("English");
		gl.tearDown();

	}

}

	