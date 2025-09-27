package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
	driver.findElement(By.linkText("Register here")).click();
	//Thread.sleep(4000);
	Select countryList=new Select (driver.findElement(By.name("country")));
	//To select "Dec" using visible text
	countryList.selectByVisibleText("INDIA");
	Thread.sleep(4000);
	//To select  using index
	countryList.selectByIndex(1);
	Thread.sleep(4000);
	//To select Dec using value
	countryList.selectByValue("AUSTRALIA");
	
		
	}

}
