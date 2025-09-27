package Automation;

import java.util.Scanner;

public class SumDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		sc.close();
			int sumOf=0;
			for(int i=1; i<=number; i++) 
			{
				sumOf=sumOf+i;
				}
			System.out.println("Sum of "+number+" is: "+sumOf);

	}

}
