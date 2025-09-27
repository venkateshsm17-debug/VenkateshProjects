package Automation;

public class OddNumbers {

	public static void main(String[] args) {
		int limit= 20;
		System.out.println("Prininting Odd numbers between 1 to "+limit);
				
		for(int i=1; i <= limit; i++) {
			//if the number is not divisible by 2 then it is Odd
			if(i%2!=0) {
			System.out.print(i+", ");
				}
			}

	}

}
