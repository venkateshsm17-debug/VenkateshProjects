package testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMHomePg {
	WebDriver driver;
	//Constructor
public OHRMHomePg(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	
}
	//To assign element locator values with PageFactory
			@FindBy(name="username")
			WebElement userNameObj;
			
			@FindBy(name="password")
			WebElement pwdObj;
			
			@FindBy(xpath="//button[@type='submit']")
			WebElement loginObj;
			
			
			//Methods to perform operations on WebElement

			public void setUid(String uid) {
				userNameObj.sendKeys(uid);
				System.out.println("entered usid is: "+uid);
			}
			
			public void setPwd(String pwd) {
				pwdObj.sendKeys(pwd);
				System.out.println("entered pswd is: "+pwd);
			}
			
			public void clickBtn() {
				loginObj.click();
			}
	}

