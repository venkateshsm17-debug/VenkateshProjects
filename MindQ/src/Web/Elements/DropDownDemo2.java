package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.facebook.com");
		driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(4000);
	Select monthList=new Select (driver.findElement(By.id("month")));
	//To selct Dec using visible text
	monthList.selectByVisibleText("Dec");
	//To selct Dec using index
	monthList.selectByIndex(0);
	//To selct Dec using value
	monthList.selectByValue("3");
	
	}

}
