package Automation;

import java.util.Scanner;

public class NestedIfDemo2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter your Age:");
		int age=sc.nextInt();
		
		if( age < 18) {
			System.out.println("You are Minor, not eligible to work");
			
		}
		else if( age >= 18 && age <=60) {
			System.out.println("Your are eligible to work");
		}
		else {
		System.out.println("You are too old to work as per Govt. rules");
		}
	

	}

}
