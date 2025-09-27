package Automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MClogin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name: ");
		String uid=sc.nextLine();
		System.out.println("Enter Password");
		String psw=sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(psw);
		driver.findElement(By.name("submit")).click();
		String pgTitle=driver.getTitle();
		if(pgTitle.equals("Login: Mercury Tours"))
		
		System.out.println("Successful Login");
		else {
	System.out.println("Unsuccessful login");
		}
		
	}

}
