package object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OHRMDashboardPg {
	

	
		
		//To assign web element locator value (i.e. Dashboard element)
		@FindBy(xpath="//h6[text()='Dashboard']")
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
