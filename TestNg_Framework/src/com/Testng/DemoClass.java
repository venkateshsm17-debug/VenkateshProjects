package com.Testng;
import org.testng.annotations.Test;

public class DemoClass {

		@Test (priority=1)
		public void userReg() {
			System.out.println("To validate user registration");
		}
		
		@Test (priority=2)
		public void userLogin() {
			System.out.println("To validate login functionality");
			
		}
	}


	
