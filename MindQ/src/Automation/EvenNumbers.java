package Automation;

public class EvenNumbers {

	public static void main(String[] args) {
		int limit= 20;
		System.out.println("Prininting Even numbers between 1 to "+limit);
		
		for(int i=1; i <= limit; i++) {
			//if the number is divisible by 2 then it is Even
			if(i%2==0) {
				System.out.print(i+",");
			}
		}

	}

}
