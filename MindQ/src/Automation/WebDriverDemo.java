package Automation;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://facebook.com");
	driver.manage().window().maximize();
	//driver.switchTo().newWindow(WindowType.TAB);
	String pgTitle= driver.getTitle();
	System.out.println("Page Title is:"+pgTitle);
	String pgUrl= driver.getCurrentUrl();
	System.out.println("Page url is:"+pgUrl);
	String sourceCode=driver.getPageSource();
	System.out.println("Source code is:"+sourceCode);
	driver.navigate().to("https://google.co.in");
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	driver.manage().window().minimize();
	
	
	//driver.quit();
	
	}

}
