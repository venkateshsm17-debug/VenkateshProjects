package test.cases;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import object.repository.OHRMDashboardPg;
import object.repository.OHRMHomePg;

public class OHRMLoginValidation {

	public static void main(String[] args) {
		// To Initialize Browser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id: ");
		String uid=sc.nextLine();
		System.out.println("Enter user password: ");
		String pwd=sc.nextLine();
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//Thread.sleep(5000);
				//To initialize "object.repository" package classes
				//System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
				OHRMHomePg homePg= PageFactory.initElements(driver, OHRMHomePg.class);
				OHRMDashboardPg dashboardPg= PageFactory.initElements(driver, OHRMDashboardPg.class);
				
				//To perform login operation
				homePg.setUid(uid);
				homePg.setPwd(pwd);
				homePg.clickBtn();
				//Thread.sleep(5000);
				
				if (dashboardPg.dashboardDisplayed()) {
					System.out.println("Successful login operation");
				}
				else {
					System.out.println("Unsuccessful login operation");
				}
		

	}

}
