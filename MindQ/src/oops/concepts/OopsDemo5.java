package oops.concepts;

public class OopsDemo5 {
	
		int result;
		
			//to perform multiplication
			public String multiply(int x, int y) {
				int a = x;
				int result= y;
				this.result = a * result;
				return("Multiplicatio of given numbers is: "+this.result);
			}

		public static void main(String[] args) {
			OopsDemo5  myCalc = new OopsDemo5();
			
			String x= myCalc.multiply(5,9);
			System.out.println(x);

		}

	}
