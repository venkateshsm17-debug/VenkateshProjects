package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/***
 * Disable test methods in TestNg class: Sometimes we can disable particular
 * test case execution in a class using “enabled” option
 */
public class DemoClass4 {
	@Test (priority=1)
	public void userReg() {
		System.out.println("To validate user registration");
		Assert.assertEquals("ABCD", "ABCD");
	}
	
	@Test (priority=2, enabled= false)
	public void userLogin() {
		System.out.println("To validate login functionality");
		
	}

}
