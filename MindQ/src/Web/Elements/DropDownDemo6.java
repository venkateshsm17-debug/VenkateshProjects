package Web.Elements;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo6 {

	public static void main(String[] args) throws InterruptedException {
		String expCountry ="";
		boolean myStatus=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expected Country name");
		expCountry =sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register here")).click();
		Thread.sleep(4000);
		Select countryList=new Select (driver.findElement(By.name("country")));
		List<WebElement> opts= countryList.getOptions();
		for(WebElement opt:opts)
		{
			String actCountry=opt.getText();
			System.out.println(opt);
			if(actCountry.equalsIgnoreCase(expCountry)) {
			System.out.println("Expected Country name exist in Dropdown");
			countryList.selectByVisibleText(actCountry);
			myStatus=true;
			break;
			
			}
		}
		if(myStatus==false) {
			System.out.println("Expected Country name doesn't exist in Dropdown");
		}

	}

}
