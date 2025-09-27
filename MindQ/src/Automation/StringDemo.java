package Automation;

public class StringDemo {

	public static void main(String[] args) {
		
		String str= "Mindqsystems";
		
		System.out.println(str);
		//find Length of String
		System.out.println("lenght of given String is:"+str.length());
		//find index of s
		System.out.println(str.indexOf("s"));//5
		System.out.println(str.indexOf("s",0));//5
		//find index of second occurrence of s
		System.out.println(str.indexOf("s",6));//7
		System.out.println(str.indexOf("s",str.indexOf("s")+1));//7
		System.out.println(str.indexOf("s")+2);//7
		//CharAt()
		//To read M
		System.out.println(str.charAt(0));//M
		//To read last character
		System.out.println(str.charAt(11));//s
		System.out.println(str.charAt(str.length()-1));//s
		//isEmpty
		System.out.println(str.isEmpty());//false
		//concatenation
		String str1="Mindq";
		String str2="Systems";
		int myval=456;
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		//to get MindQ456
		System.out.println(str1+myval);
		
		//Trim
		String str3=" Mindq ";
		System.out.println(str3.length());//7
		System.out.println(str3.trim().length());//5
		//replace
		//to replace "s" with "@"
		//str="Mindqsystems"
		System.out.println(str.replace("s", "@")); //Mindq@y@tem@
		System.out.println(str.replace("n", "$")); //Mi$dqsystems
		//sub string
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 12));
		System.out.println(str.substring(0, 5));

		String str4="Sr Nagar";
		//without space
		System.out.println(str4.replace(" ", ""));//SrNagar
		
	
		
		
		
		
		
	}

}
