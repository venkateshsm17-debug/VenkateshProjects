package oops.concepts;

public class MethodOL {
	public void demoOne(int a, int b){
		int c= a*b;
	     System.out.println("multiplication of given values is: "+c);
		}

		public void demoOne(String x, String y){
			String z= x+y;
			System.out.println(z);
		}

		public static void main(String[] args) {
			MethodOL ml= new MethodOL();
			ml.demoOne(5, 6);
			ml.demoOne("Live", "Tech");
		}
	}
	