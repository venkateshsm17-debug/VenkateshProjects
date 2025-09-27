package Web.Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.facebook.com");
		driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(4000);
	//To read all the radiobuttons
	//List<WebElement> radiobtns=driver.findElements(By.className("_8esa"));
	//List<WebElement> radiobtns=driver.findElements(By.xpath("//input[@type='radio']"));
	List<WebElement> radiobtns=driver.findElements(By.xpath("//input[@name='sex']"));

	System.out.println(radiobtns.size());
	for(WebElement rdbtn:radiobtns) {
		System.out.println(rdbtn.getText());
		rdbtn.click();
		Thread.sleep(4000);
		
	}

	}

}
