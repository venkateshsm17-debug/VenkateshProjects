package Automation;

public class StringWithoutSpace {

	public static void main(String[] args) {
		String str="Sr Nagar";
		System.out.println(str.length());
		
		int count= 0;
		for(int i =0; i<= str.length()-1; i++) {
			if(str.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.println("Number of characters are: "+count);


	}

}
