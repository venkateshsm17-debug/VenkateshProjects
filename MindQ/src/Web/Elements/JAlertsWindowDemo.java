package Web.Elements;

		

		import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class JAlertsWindowDemo {

			public static void main(String[] args) throws InterruptedException {
				// Asignment1: Handling Web Element - Window, Alert Handling
				
				
				WebDriver driver = new ChromeDriver();

				// Step1: Opening required Url
				driver.get("https://demoqa.com/");
				driver.manage().window().maximize();

				// Step2: click on Alert, frames and Windows
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				WebElement ele = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
				js.executeScript("arguments[0].scrollIntoView(true);", ele);
				ele.click();

				// Step3: Click on Browser Windows
				driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]")).click();
				Thread.sleep(2000);

				// Step3a: Open new child window within the Browser window
				driver.findElement(By.id("windowButton")).click();
				Thread.sleep(4000);

				// Step3b: Get handles of the windows
				String MainWindow = driver.getWindowHandle();

				// Step4: Switch to new window and handle
				Set<String> s1 = driver.getWindowHandles();
				Iterator<String> i1 = s1.iterator();

				while (i1.hasNext()) {
					String ChildWindow = i1.next();
						if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
							// Step4a: Click on the new window element and read the text displayed on the
							// window
							driver.switchTo().window(ChildWindow);
							// Reading Current Url
							String url = driver.getCurrentUrl();
							System.out.println("Child Window url is: " + url);
							// Reading title
							WebElement text = driver.findElement(By.id("sampleHeading"));
							System.out.println("Element found using text: " + text.getText());
							Thread.sleep(2000);
							// Closing child window
							driver.close();
							System.out.println("Child Window is closed ");
							Thread.sleep(2000);
							// Switch back to the main window which is the parent window.
							driver.switchTo().window(MainWindow);
						}

					}

					

					// Step5: Switch to Alerts
					WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Alerts')]"));
					js.executeScript("arguments[0].scrollIntoView(true);", ele1);
					ele1.click();
					Thread.sleep(2000);
					// Step6: Click on the 4th "Click me" button
					driver.findElement(By.id("promtButton")).click();
					Thread.sleep(4000);
//
					// Step6a: Move the alert window, which opens after above step "Click me"
					Alert altObj = driver.switchTo().alert();

					// Step7: Asking user to enter required name and reading it dynamically
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter your name");
					String name = sc.nextLine();
					sc.close();
					altObj.sendKeys(name);
					altObj.accept();
					Thread.sleep(4000);
//
					// Step 7a: Checking Prompt box text is matched or not
					WebElement promptResult = driver.findElement(By.id("promptResult"));
					String nameResult = promptResult.getText();
					System.out.println(nameResult);

					// Step7b: Comparing the entered text and displayed text
					if (nameResult.contains(name)) {
						System.out.println("Prompt box text is matched with entered text");
					} else {
						System.out.println("Prompt box text is not matched");
					}
					Thread.sleep(4000);

					// Step8: Click on Model Dialog and Large Model
					WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'Modal Dialogs')]"));
					js.executeScript("arguments[0].scrollIntoView(true);", ele2);
					ele2.click();
					Thread.sleep(2000);
					driver.findElement(By.id("showLargeModal")).click();

					//Step9: Close Large Model
					Thread.sleep(4000);
					driver.findElement(By.id("closeLargeModal")).click();

					// Closing the browser
					Thread.sleep(4000);
					driver.close();
					System.out.println("Main Window is also closed ");
						
			

	}

}
