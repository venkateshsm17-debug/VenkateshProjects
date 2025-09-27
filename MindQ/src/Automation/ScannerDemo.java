package Automation;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Name: ");
		String myVal= sc.nextLine();
		System.out.println("Enter any number : ");
		int myNumber=sc.nextInt();
		System.out.println("Entered name is : "+myVal);
		System.out.println("Entered number is : "+myNumber);
		sc.close();

	}

}
