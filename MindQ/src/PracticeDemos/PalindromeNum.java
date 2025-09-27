package PracticeDemos;

public class PalindromeNum {

	public static void main(String[] args) {
		int n=123;
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
			//System.out.println(sum);
		}
		System.out.println(sum);
		}
}



