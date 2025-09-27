package PracticeDemos;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com");


        
        String currentHandle= driver.getWindowHandle();
        
    
        
        //getting all the window handles currently available
        Set<String> handles=driver.getWindowHandles();
        for(String actual: handles)
        {
            
         if(!actual.equalsIgnoreCase(currentHandle))
         {
             //switching to the opened tab
             driver.switchTo().window(actual);
             
             
         }
        }
        
   

		
	}

}
