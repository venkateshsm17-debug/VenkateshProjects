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
import testng.pageobject.OHRMHomePg;



public class OHRMLoginValidation {
	WebDriver driver;
	OHRMHomePg homePg;
	OHRMDashboardPg dashboardPg;
	
	
	
	@Test(priority = 0)
	public void loginmethods() throws InterruptedException{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id: ");
		String uid=sc.nextLine();
		System.out.println("enter pwd: ");
		String pwd=sc.nextLine();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePg=new OHRMHomePg(driver);
		
		homePg.setUid(uid);
		homePg.setPwd(pwd);
		homePg.clickBtn();
		
	}
	@Test(priority = 1)
	public void afteLoginmethods() {
		dashboardPg=new OHRMDashboardPg(driver);
		
		
		 if (dashboardPg.dashboardDisplayed()) {
		  System.out.println("Successful login operation"); 
		  } 
		 else {
		  System.out.println("Unsuccessful login operation"); 
		  }
		 
		
	}
	
	
		// To Initialize Browser
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter user id: ");
		 * String uid=sc.nextLine(); System.out.println("Enter user password: "); String
		 * pwd=sc.nextLine(); WebDriver driver = new ChromeDriver(); driver.get(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * driver.manage().window().maximize();
		 * 
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 */
				//Thread.sleep(5000);
				//To initialize "object.repository" package classes
				//System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
				//OHRMHomePg homePg= PageFactory.initElements(driver, OHRMHomePg.class);
				//OHRMDashboardPg dashboardPg= PageFactory.initElements(driver, OHRMDashboardPg.class);
				
				//To perform login operation
//				homePg.setUid(uid);
//				homePg.setPwd(pwd);
//				homePg.clickBtn();
				//Thread.sleep(5000);
				
				/*if (dashboardPg.dashboardDisplayed()) {
					System.out.println("Successful login operation");
				}
				else {
					System.out.println("Unsuccessful login operation");*/
				}
		

	


