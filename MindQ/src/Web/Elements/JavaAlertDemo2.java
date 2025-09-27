package Web.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// To initialize Browser
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
				driver.switchTo().frame("iframeResult");
				//To click on "Try it"
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				Thread.sleep(5000);
						
						
				//To read msg from java Alert
				String msg= driver.switchTo().alert().getText();
				System.out.println(msg);
				
				//To close java Alert
				driver.switchTo().alert().accept();

	}

}
