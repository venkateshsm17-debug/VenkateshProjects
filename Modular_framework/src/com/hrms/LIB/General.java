package com.hrms.LIB;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.objects.ObjectsInfo;

public class General extends ObjectsInfo{
	public void setUp() throws InterruptedException{
		driver=new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(5000);
	}
	public void adminLogin() throws InterruptedException {
		driver.findElement(By.name(txt_userName)).sendKeys(uid);
		driver.findElement(By.name(txt_password)).sendKeys(pwd);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();

}
}
