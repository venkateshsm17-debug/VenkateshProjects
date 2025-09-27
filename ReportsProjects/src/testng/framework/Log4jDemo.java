package testng.framework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	private Logger logger;
	public WebDriver driver;
	@Test
	public void setUp() {
		logger=Logger.getLogger("Log4jDemo.class");
		PropertyConfigurator.configure("log4j.properties");
		driver=new ChromeDriver();
		logger.info("Browser launched");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		logger.info("Application opened");
		driver.manage().window().maximize();
	}

}
