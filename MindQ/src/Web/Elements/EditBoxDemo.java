package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
	WebElement uidObj= driver.findElement(By.name("username"));
	uidObj.sendKeys("Mindq");
	//read value from "userName" editbox
	String uid=uidObj.getAttribute("value");
	System.out.println(uid);
	Thread.sleep(4000);
	//To clear data from "userName"
	uidObj.clear();
	
	
	

	}

}
