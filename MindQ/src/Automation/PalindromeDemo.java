package Automation;

public class PalindromeDemo {

	public static void main(String[] args) {
		String str1="Mindq";
		String str2="";
		for(int i=str1.length()-1; i>=0; i--) {
		str2=str2+str1.charAt(i);
		}
		
		System.out.println(str2);
		
		//to check given string palindrome
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("it is a Palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}

	}

}
