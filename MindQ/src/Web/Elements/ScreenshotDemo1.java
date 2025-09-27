package Web.Elements;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.facebook.com");
		driver.manage().window().maximize();
	//To capture screenshot of appl
		File myFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date dt=new Date();
		DateFormat df=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		//To save file
		FileHandler.copy(myFile, new File("C:\\Users\\user\\eclipse-workspace\\MindQ\\MindQ\\Defects"+df.format(dt)+".png"));

	}

}
