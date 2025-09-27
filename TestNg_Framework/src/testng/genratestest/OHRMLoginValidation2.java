package testng.genratestest;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testng.pageobject.OHRMDashboardPg;
import testng.pageobject.OHRMDashboardPg2;
import testng.pageobject.OHRMHomePg;



public class OHRMLoginValidation2 {
	
	
	
	//OHRMHomePg homePg= PageFactory.initElements(driver, OHRMHomePg.class);
	
	
	
	@Test
	public void loginmethods() throws InterruptedException{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id: ");
		String uid=sc.nextLine();
		System.out.println("enter pwd: ");
		String pwd=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		OHRMHomePg homePg= PageFactory.initElements(driver, OHRMHomePg.class);
		OHRMDashboardPg2 dashboardPg2= PageFactory.initElements(driver, OHRMDashboardPg2.class);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		homePg.setUid(uid);
		homePg.setPwd(pwd);
		homePg.clickBtn();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(dashboardPg2.dashboardDisplayed()) {
			System.out.println("Sucessfully Login");
		}
		else {
			System.out.println("Login unsucessfull");
		}
		
}
	
	}
	

	


