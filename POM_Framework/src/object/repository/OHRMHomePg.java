package object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OHRMHomePg {
	
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

