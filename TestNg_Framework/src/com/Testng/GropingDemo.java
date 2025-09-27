package com.Testng;

import org.testng.annotations.Test;

public class GropingDemo {
	@Test(groups= {"Regression"})
	public void method02() {
		System.out.println("Method-2 from Class-2");
	}

}
