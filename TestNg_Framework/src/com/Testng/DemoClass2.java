package com.Testng;

import org.testng.asserts.SoftAssert;


/*Soft asserts are just the opposite of hard asserts. In soft asserts, the subsequent assertions keep on 
running even though one assert validation fails, i.e., the test execution does not stop. Soft assert does not include 
by default in TestNG.*/
public class DemoClass2 {
	public void adminRegistration() {
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals("Rajesh", "Rajesh123");
		System.out.println("To validate Registration functionality");
		
	}
}
