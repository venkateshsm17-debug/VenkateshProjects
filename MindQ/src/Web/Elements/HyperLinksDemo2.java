package Web.Elements;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksDemo2 {

	public static void main(String[] args) {
		String expLink ="";
		boolean myStatus=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expected link");
		expLink =sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			if (link.getText().equalsIgnoreCase(expLink)) {
				link.click();
				System.out.println("Expected link is existed");
				myStatus=true;
				break;
			}
		}
		if(myStatus==false) {
			System.out.println("Expected link doesn't existed");
		}

	}

}
