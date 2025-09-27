package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame("moneyiframe");
		
		//To enter "selenium"
		driver.findElement(By.name("query")).sendKeys("selenium");
		
		driver.findElement(By.name("query")).sendKeys(Keys.ENTER);

	}

}
