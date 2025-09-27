//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginDemo_POM {
//WebDriver driver=null;
//LoginPageObject login;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//	    driver=new ChromeDriver();
//	    
//	}
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    Thread.sleep(5000);
//	    
//	    
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) {
//	  login=new LoginPageObject(driver);
//	  login.enterUsername(username);
//	  login.enterPassword(password);
//	}
//
//	@When("user clicks on login")
//	public void user_clicks_on_login() {
//	    login.clickLogin();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//	    driver.findElement(By.linkText("Dashboard")).isDisplayed();
//	}
//
//
//}
