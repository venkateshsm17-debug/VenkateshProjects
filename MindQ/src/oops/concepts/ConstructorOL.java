package oops.concepts;

public class ConstructorOL {
	public ConstructorOL(int a, int b){
		int c= a*b;
      System.out.println("multiplication of given values is: "+c);
	}
	public ConstructorOL(String x, String y){
		String z= x+y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		
		ConstructorOL ce= new ConstructorOL(5,6);
		ConstructorOL cex= new ConstructorOL("Live","Tech");
	}
}


