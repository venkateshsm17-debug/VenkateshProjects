package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo4 {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.facebook.com");
		driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//div[@class='placeholder']/input[1]")).sendKeys("asc");
	driver.findElement(By.name("firstname")).sendKeys("asb");
	Select yearList =new Select(driver.findElement(By.name("birthday_year")));
	String opt =yearList.getFirstSelectedOption().getText();
	System.out.println(opt);
	if(opt.equals("2023")) {
		System.out.println("Required year alaready selected");
	}
	else{
		yearList.selectByVisibleText("1998");
	System.out.println("WD selected required year");
		}
	Select dayList =new Select(driver.findElement(By.id("day")));
	dayList.selectByValue("10");
	Select month =new Select(driver.findElement(By.id("month")));
	month.selectByValue("5");
	}

}
