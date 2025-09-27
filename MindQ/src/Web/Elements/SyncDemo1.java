package Web.Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncDemo1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.facebook.com");
		driver.manage().window().maximize();
	
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.linkText("Create new account")).click();
	//driver.findElement(By.xpath("//div[@class='placeholder']/input[1]")).sendKeys("asc");
	
	//explicit wait
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
	
	driver.findElement(By.name("firstname")).sendKeys("MindQ");
	
	}

}
