package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
	
	WebDriver driver;
	By txt_username=By.name("username");
	By txt_password=By.name("password");
	By btn_login=By.xpath("//button[@Type='submit']");
	
	
	  public LoginPageObject(WebDriver driver) {
		  this.driver=driver;
		  if(!driver.getTitle().equals("OrangeHRM")) {
			  throw new IllegalStateException("This is not Login Page. The Current page is "
			  +driver.getCurrentUrl());
			  }
		  
	  }
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
		}
		public void enterPassword(String password){
		driver.findElement(txt_password).sendKeys(password);
		}
		public void clickLogin() {
		driver.findElement(btn_login).click();
		}
		public void login_ValidUser(String username, String password) {
			
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		
}
}
