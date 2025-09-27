package Automation;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> myCars= new ArrayList<>();
		myCars.add("Benz");
		myCars.add("Audi");
		myCars.add("Bmw");
		System.out.println(myCars);
		for(int i=0;i<=myCars.size()-1;i++) {
			if(myCars.get(i).equals("Audi")) {
				//to update
				myCars.set(i,"Jaguar");
				break;
			}	
		}
		System.out.println(myCars);

	}

}
