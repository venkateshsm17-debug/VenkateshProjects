package Web.Elements;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksDemo3 {

	public static void main(String[] args) {
		String expLink="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter expLink name");
		expLink=sc.nextLine();
		
		boolean myStatus=false;
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> fLinks=driver.findElements(By.tagName("a"));
		if(fLinks.size()==100) {
			System.out.println("expected links are existed");	
		}
		else {
			System.out.println("Actual number of links: "+fLinks.size());
		}
		
		int count=0;
		for(WebElement vsLink:fLinks) {
			if(!vsLink.getText().isEmpty()) {
				count++;
				
		}
		}
		System.out.println("visible links: "+count);
		System.out.println("Hidden links: "+(fLinks.size()-count));
		for(WebElement fLink:fLinks) {
			System.out.println(fLink.getText());
			String actLink=fLink.getText();
			if(actLink.equalsIgnoreCase(expLink)) {
				System.out.println("Expected link existed");
				fLink.click();
				myStatus=true;
				break;
				
			}
			}
		if(myStatus==false) {
			System.out.println("Expected link doesn't existed");
		}
			
		}
		

	}


