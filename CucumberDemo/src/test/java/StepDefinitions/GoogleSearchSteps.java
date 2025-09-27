package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step: browser is open");
		driver =new ChromeDriver();
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("Inside Step: user is on google search page");
	    driver.get("https://www.google.com");
	}

	@When("user enters text in a searchbox")
	public void user_enters_text_in_a_searchbox() throws InterruptedException {
		System.out.println("Inside Step: user enters text in a searchbox");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(5000);
	}

	@When("hits enter")
	public void hits_enter() {
	    System.out.println("Inside Step: hits enter");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step: user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}


}
