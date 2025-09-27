package Web.Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemo2 {

	public static void main(String[] args) throws InterruptedException {
		//to Initialize browser
		
				WebDriver driver=new ChromeDriver();
				driver.get("http://google.co.in");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				WebElement searchTxt=driver.findElement(By.name("q"));
				searchTxt.sendKeys("selenium");
				Thread.sleep(2000);
				searchTxt.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000);
				searchTxt.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000);
				searchTxt.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000);
				searchTxt.sendKeys(Keys.ENTER);

	}

}
