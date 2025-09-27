package Web.Elements;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksDemo4 {

	public static void main(String[] args) {
		String expLink="";
		Boolean check=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter expLink: ");
	    expLink=sc.next();
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		WebElement languages=driver.findElement(By.id("SIvCob"));
        List<WebElement> pgLinks=languages.findElements(By.tagName("a"));
        System.out.println(pgLinks.size());
        for(WebElement pgLink:pgLinks) {
        	System.out.println(pgLink.getText());
        	String actualLink=pgLink.getText();
        	if(actualLink.equalsIgnoreCase(expLink)){
        		pgLink.click();
        		System.out.println(actualLink);
        		check=true;
        		break;
        	}
        }
        if (check==false)
        {
        	System.out.println("expected language doen't exist");
        }
	}

}
