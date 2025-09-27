package Automation;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//Declare an array to 3 string values
		String[] myCars =new String[3];
		//insert values into array
		myCars[0]="Benz";
		myCars[1]="Audi";
		myCars[2]="Bmw";
		//find size of an array
		System.out.println("nuber of values are: "+myCars.length);
		//read single value from an array
		System.out.println(myCars[0]);
		//read multiple values from an array
		System.out.println(Arrays.toString(myCars));
		//read one by one value by using for loop
		System.out.println("forEach loop\n");
		for(int i=0;i<myCars.length-1;i++) {
			System.out.println(myCars[i]);
		}
		System.out.println("forEachsv loop\n");
		//read one by one value by using forEach
		for(String my:myCars)
		{
			System.out.println(my);
		}

	}

}
