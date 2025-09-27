package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
	WebElement uidObj= driver.findElement(By.name("username"));
	uidObj.clear();
	uidObj.sendKeys("Mindq");
	Thread.sleep(4000);
	uidObj.clear();
	uidObj.sendKeys("Systems");
	Thread.sleep(4000);
	//read data
	String uid=uidObj.getAttribute("value");
	if(uid.equals("MindqSystems")) {
		System.out.println("send keys method will not over write the existing value");
	}
	else {
		System.out.println("send keys method will over write the existing value");

	}

	}

}
