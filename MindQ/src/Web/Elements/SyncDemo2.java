package Web.Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncDemo2 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://apsrtconline.in/oprs-web");
		driver.manage().window().maximize();
	
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.name("source")).sendKeys("Hyd");
	//driver.findElement(By.xpath("//div[@class='placeholder']/input[1]")).sendKeys("asc");
	
	//explicit wait
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
	
	driver.findElement(By.xpath("//span[text()='HYDERABAD-AIRPORT-RGIA-PICKUPPOINT-D']")).click();
	
	}

	}


