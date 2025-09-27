package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/***
 * Dependency methods in TestNg class: “dependsOnMethods” using this option we
 * can specify current test case execution based on previous Test case/test
 * cases methods pass/fail
 */
public class DemoClass3 {
	@Test (priority=1)
	public void userReg() {
		System.out.println("To validate user registration");
		Assert.assertEquals("ABCD", "ABCD12");
	}
	
	@Test (priority=2, dependsOnMethods= {"userReg"})
	public void userLogin() {
		System.out.println("To validate login functionality");
		
	}

}
