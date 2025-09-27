package Automation;

import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a=sc.nextInt();
		System.out.println("Enter number b: ");
		int b=sc.nextInt();
		System.out.println("Sum of the given numbers is: "+(a+b));
		
	}

}
