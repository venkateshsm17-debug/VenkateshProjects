package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hookssteps {
	
	WebDriver driver=null;
	
	@Before(value="@smoke",order=0)
	public void browserSetup() {
		driver =new ChromeDriver();
		System.out.println("I am Inside before1");
	}
	@Before(order=1)
	public void browserSetup2() {	
	System.out.println("I am Inside before2");
	}
	
	@After(order=1)
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	@After(order=2)
	public void tearDown2() {
		System.out.println("I am Inside tearDown2");
	}
	@BeforeStep
	public void beforeSteps() {
		
	}
	@AfterStep
	public void afterSteps() {

	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	   
	}
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	    
	}
}
