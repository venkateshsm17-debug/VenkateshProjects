package testng.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OHRMDashboardPg {
	WebDriver driver;
	//Constructor
	public OHRMDashboardPg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	

	
		
		//To assign web element locator value (i.e. Dashboard element)
		@FindBy(xpath="//span[text()='Dashboard']")
		WebElement dashboardObj;
		
		//Method: to return status based on "Dashboard" webelement availability
		
		public boolean dashboardDisplayed() {
			boolean myStatus=false;
			
			try {
				if(dashboardObj.isDisplayed()) {
					myStatus= true;
				}
			}
			catch(Exception e) {
				myStatus= false;
			}
			
			return (myStatus);
			
		}
}
