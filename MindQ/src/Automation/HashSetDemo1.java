package Automation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		Set mySet= new HashSet();
		mySet.add("MadhukarQAIT");
		mySet.add(250);
		mySet.add(10.786);
		//To find number of values
		System.out.println("Number of Values are"+mySet.size());
		//To read all the values
		System.out.println(mySet);
		//remove specific value
		//mySet.remove(10.786);
		//System.out.println(mySet);
		Iterator<Object> myData=mySet.iterator();
		//To read one by one value
		for(int i=1;i<=mySet.size();i++) {
			System.out.println(myData.next());
		}
		
		

	}

}
