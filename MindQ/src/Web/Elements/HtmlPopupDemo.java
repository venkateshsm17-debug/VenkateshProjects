package Web.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlPopupDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//To clickon "Create new account" link
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(4000);
		
		//To enter "Mindq"
		driver.findElement(By.name("firstname")).sendKeys("Mindq");

	}

}
