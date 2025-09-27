package Web.Elements;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter user name");
		String uid= sc.nextLine();
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		sc.close();
		
		//To initialize browser
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//To perform login operation
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Thread.sleep(5000);
		
		
		try {
			if(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
				System.out.println("Successful login operation");
				
				//to perform logout
				driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("Logout")).click();
			}
		}
		catch (Exception e) {
			System.out.println("Unsuccessful login operation");
			//To take the screenshot
			//To capture screenshot of appln
			File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			Date dt= new Date();
			DateFormat df= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			
			//To save file
			//FileHandler.copy(myFile, new File("C:\\Users\\user\\eclipse-workspace\\MindQ\\MindQ\\OHRM"+df.format(dt)+".png"));
			FileHandler.copy(myFile, new File("./Defects\\OHRM2"+df.format(dt)+".png"));
		}
		finally{
		driver.quit();
	}

	}

}
