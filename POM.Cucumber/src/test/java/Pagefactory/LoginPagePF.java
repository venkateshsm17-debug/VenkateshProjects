package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
	
	WebDriver driver=null;
	
	@FindBy(name="username")
	WebElement txt_username;
	@FindBy(name = "password")
	WebElement txt_password;
	@FindBy(xpath="//button[@Type='submit']")
	WebElement btn_login;
	
	public LoginPagePF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		if(!driver.getTitle().equals("OrangeHRM")) {
			throw new IllegalStateException("This is not Login Page. The Current page is "
					+driver.getCurrentUrl());
		}

	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password){
		txt_password.sendKeys(password);
	}
	public void clickLogin() {
		btn_login.click();
	}
	public void login_ValidUser(String username, String password) {

		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();

}
}
