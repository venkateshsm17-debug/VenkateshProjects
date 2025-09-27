package Automation;

public class PrintIndexGivenChar {

	public static void main(String[] args) {
		String str="Mindqsystems";
		int cnt=0;
		for(int i=0; i <= str.length()-1; i++) {
			
			if(str.charAt(i)=='e') {
				cnt++;
				System.out.println("index of e is: "+i);
			}
			
			
		}
		System.out.println("Number of times e occurence is in a given string is: "+cnt);
	

	}

}
