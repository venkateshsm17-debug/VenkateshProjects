package Automation;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a= 0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int c= a+b;
		while(c <= 100) {
			System.out.println(c);
			//swap the values
			a= b;
			b= c;
			c= a+b;
		}

//a-1b-1c-2 a-1b-2c-3

	}

}
