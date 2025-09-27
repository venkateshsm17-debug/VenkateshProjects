package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement ele1= driver.findElement(By.id("draggable"));
		WebElement ele2= driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(ele1, ele2).build().perform();


	}

}
