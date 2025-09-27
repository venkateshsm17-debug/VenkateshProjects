package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadVisibleTextDemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.facebook.com");
		driver.manage().window().maximize();
	WebElement btnLogin=driver.findElement(By.name("login"));
	String loginTxt=btnLogin.getText();
	System.out.println(loginTxt);
	String loginName=btnLogin.getAttribute("name");
	System.out.println(loginName);
	//click on that element if it is enabled
	if(btnLogin.isEnabled()) {
		System.out.println("Login button enabled");
		btnLogin.click();
	}
		else {
			System.out.println("Login button is disabled");
		}
	}
	
}


