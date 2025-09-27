package Automation;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check it is Prime number or not");
		int n = sc.nextInt();
		int count= 0;
		
		for (int i =1; i <= n; i++) {
			
			if (n%i == 0) {
				count++;
			}
			
		}
		
		if (count == 2) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
		
		//1 to 20 Prime numbers
		int cnt;
		System.out.println("Printing Prime numbers from 1 to 20");
		//loop through the numbers one by one
		for(int m = 1; m <= 20; m++) {
			cnt=0;
			//to check if the number is prime
			for(int j=1; j<=m; j++) {
				if(m% j==0) {
					cnt++;
				}
			}
			
			if(cnt==2) {
				System.out.print(m+", ");
			}
		}


	}

}
