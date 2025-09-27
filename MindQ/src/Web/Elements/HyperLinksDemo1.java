package Web.Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com");
		//read all the links
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		//verify number of links are 300 or not
		if(links.size()==300) {
			System.out.println("Test passed, expected number of links exist in a page");
			
		}
		else {
		System.out.println("Test failed, Actual number of links are: "+links.size());
		}
		int count=0;
		for(WebElement vblink:links) {
		if(!vblink.getText().isEmpty()) {
			count++;	
		}
		}
		System.out.println("Total visible links in page: "+count);
		System.out.println("Total number of hidden links are: "+(links.size()-count));
		
		for(WebElement link:links) {
			System.out.println("print all links: "+link.getText());
		}
			;
	}

}