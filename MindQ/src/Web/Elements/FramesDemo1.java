package Web.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize Browser
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				//To switch to frame
				driver.switchTo().frame("iframeResult");
				//To click on "Try it" button
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
	}

}
