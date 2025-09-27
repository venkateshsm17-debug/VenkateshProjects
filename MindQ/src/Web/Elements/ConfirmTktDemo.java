package Web.Elements;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;

public class ConfirmTktDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.irctc.co.in/nget/train-search");
		driver.get("https://www.confirmtkt.com/rbooking-d/");
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> sz=driver.findElements(By.tagName("iFrame"));
		System.out.println(sz.size());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement searchTxt=driver.findElement(By.xpath("//div[@class='label-container']"));
		js.executeScript("arguments[0].click()", searchTxt);
		//Thread.sleep(5000);
		//js.executeScript("arguments[0].value='hyd';",searchTxt);
//		Thread.sleep(5000);
//		WebElement searchTxt1=driver.findElement(By.xpath("//span[text()='LKO  - Lucknow']"));
//		js.executeScript("arguments[0].click()", searchTxt1);
	
		Thread.sleep(5000);
		searchTxt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		searchTxt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		searchTxt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		searchTxt.sendKeys(Keys.ENTER);
		
	

       //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]/div/label")).click();
       //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]/div/label")).sendKeys("Luc");
       // Thread.sleep(5000);
      // searchTxt.click();
       
    
  
	}

}
