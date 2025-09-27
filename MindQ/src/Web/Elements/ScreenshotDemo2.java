package Web.Elements;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();

		System.out.println("Before click on Telugu link");

		//to check Telugu link visibility
		if(driver.findElement(By.linkText("తెలుగు")).isDisplayed()) {
			System.out.println("Telugu link displayed");
		}
		else {
			System.out.println("Telugu link is invisible");
		}
		
		//to click on Telugu link
		driver.findElement(By.linkText("తెలుగు")).click();
		
		Thread.sleep(4000);
		
		System.out.println("After click on Telugu link");
		try {
		if(driver.findElement(By.linkText("తెలుగు")).isDisplayed()) {
			System.out.println("Telugu link displayed");
		}
		}
		catch(Exception e) {
			System.out.println("Telugu link is invisible");
		}
		finally {
			File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date dt = new Date();
			DateFormat df= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			//to save file
			FileHandler.copy(myFile,new File("C:\\Users\\user\\eclipse-workspace\\MindQ\\MindQ\\Google1"+df.format(dt)+".png"));
			
		}

	}

}
