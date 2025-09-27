package Web.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='Hyderabad, India']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='Goa - Dabolim Airport, India']")).click();
		Thread.sleep(4000);
		String month1=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText();
		System.out.println(month1);
		if(month1.equals("December 2024")) {
			driver.findElement(By.xpath("//p[text()='25']")).click();
			}
	
		else{
			do {
		String month2=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText();
		System.out.println(month2);
		if(month2.equals("December 2024")) {
			driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]/div/p[1]")).click();
			break;
	}
		else {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
			}
		
		while(true);
		
}

	driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();	
	//driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/p/a")).click();

}
}
