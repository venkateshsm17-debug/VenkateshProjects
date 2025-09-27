package Automation;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> myCars= new ArrayList<>();
		myCars.add("Benz");
		myCars.add("Audi");
		myCars.add(1,"Bmw");
		System.out.println(myCars);
		Collections.sort(myCars);
		System.out.println(myCars);
		System.out.println(myCars.size());
		//to read perticular value
		System.out.println(myCars.get(1));
		//to print one by one value from ArrayList
		for(int i=0; i<myCars.size()-1;i++)
		{
			System.out.println(myCars.get(i));
		}
		for(String car:myCars) {
			System.out.println(car);
		}
	}

}
