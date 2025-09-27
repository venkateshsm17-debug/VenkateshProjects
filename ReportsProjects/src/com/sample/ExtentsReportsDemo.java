package com.sample;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReportsDemo {

		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;
		ExtentTest test;
		WebDriver driver;
		
		@BeforeClass
		public void extentInit() {
			//to specify the location
			htmlReporter=new ExtentHtmlReporter("./TestResults//ExtentReporter.html");
			// Title of the report
			htmlReporter.config().setDocumentTitle("Automation Report");
			//Name of the report
			htmlReporter.config().setReportName("Functional Report");
			//To Specify Theme like STANDARD/DARK
			htmlReporter.config().setTheme(Theme.STANDARD); 
			
			
			//create ExtentReports object and attach Reports
			extent=new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			extent.setSystemInfo("Hostname", "LocalHost");
			extent.setSystemInfo("OS", "Windows10");
			extent.setSystemInfo("Tester Name", "Madhukar");
			extent.setSystemInfo("Browser", "Chrome");
			
			//create ExtentTest object and specify Report Title
			test=extent.createTest("OrangeHRM_TitleTest"); 
			}
		
		
		@BeforeMethod
		public void setUp() throws InterruptedException
		{
			
			driver = new ChromeDriver();
			test.log(Status.INFO,"Chrome browser launched");
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(5000);
			test.log(Status.INFO,"Navigated Orange HRM Application");
		}
		
		
		@Test
		public void titleTest() throws IOException {
			
			String pgTitle=driver.getTitle();
			Assert.assertEquals("OrangeHRM", pgTitle);
			test.log(Status.PASS, "Expected title exist");
			
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//to get Date stamping with file
			Date dt= new Date();	
			//it will return system date
			
			DateFormat df1= new SimpleDateFormat("dd_MM_yyyy_HH_MM_ss");
			//to convert into required format
			
			//to save screenshot with date stamping
			FileHandler.copy(f,new File("D:\\titleScreenshot"+df1.format(dt)+".png"))  ;
			
			
			test.addScreenCaptureFromPath("D:\\titleScreenshot"+df1.format(dt)+".png");// adding screen shot
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
		@AfterClass
		public void endReport()
		{
			extent.flush();
		}

		}

