package Web.Elements;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmDemo2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid user name");
		String uid=sc.nextLine();
		System.out.println("Enter valid password");
		String pasw=sc.nextLine();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pasw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		   


	}

}
