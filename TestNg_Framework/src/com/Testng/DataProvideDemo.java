package com.Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideDemo {
	@Test (dataProvider= "getData")
	public void StringConcat(String a, String b) {
		
		String myStr =a.concat(b);
		System.out.println(myStr);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2]; 
		data[0][0]="Madhukar";
		data[0][1]="QAIT";
		
		data[1][0]="Mindq";
		data[1][1]="systems";
		
		data[2][0]="Selenium";
		data[2][1]="Java";
		
		return(data);

}
}
