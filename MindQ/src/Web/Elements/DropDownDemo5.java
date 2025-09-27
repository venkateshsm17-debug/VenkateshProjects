package Web.Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register here")).click();
		Thread.sleep(4000);
		Select countryList=new Select (driver.findElement(By.name("country")));
		List<WebElement> opts= countryList.getOptions();
		System.out.println("Number of options are: "+opts.size());
		for(WebElement opt:opts) {
			System.out.println(opt.getText());
		}



	}

}
