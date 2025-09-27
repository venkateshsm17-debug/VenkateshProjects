package datadriven.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) throws IOException {
	
    FileInputStream fi= new FileInputStream("./Properties\\inputdata.properties");
		
		Properties propObj= new Properties();
		propObj.load(fi);
		
		WebDriver driver= new ChromeDriver();
		driver.get(propObj.getProperty("baseUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys(propObj.getProperty("userId"));
		driver.findElement(By.name("password")).sendKeys(propObj.getProperty("pwd"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}
