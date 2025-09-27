package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.moveToElement(button).contextClick().build().perform();  --lower version before selenium4
		act.contextClick(button).build().perform();		
		driver.findElement(By.xpath("//span[text()='Paste']")).click();	
		
		//To read msg from java alert
		String msg= driver.switchTo().alert().getText();
		System.out.println(msg);
		
		//To close java alert
		driver.switchTo().alert().accept();

	}

}
