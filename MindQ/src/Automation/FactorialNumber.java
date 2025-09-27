package Automation;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		//to read user input
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		sc.close();
			int fact=1;
			for(int i=1; i<=number; i++) 
			{
				fact=fact*i;
				}
			System.out.println("Factorial of "+number+" is: "+fact);



	}

}
