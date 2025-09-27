package Automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchCrossBrowser {

	public static void main(String[] args) {
		String testBrowser="";
		WebDriver driver=null;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter required Browser name");
		testBrowser = sc.nextLine();
		sc.close();
		
		switch(testBrowser.toUpperCase())
		{
		case "CHROME":
			driver= new ChromeDriver();
			break;
		case "FF":
			driver= new FirefoxDriver();
			break;
		case "EDGE":
			driver= new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser name");
			System.exit(1);
		}
		
		driver.get("https://google.co.in");
		driver.manage().window().maximize();


	}

}
