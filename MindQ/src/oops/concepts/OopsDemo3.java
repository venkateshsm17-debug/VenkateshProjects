package oops.concepts;

public class OopsDemo3 {

public int result;
	
	public void addone(int a, int b){
		
		result= a+b;
		System.out.println("Addition of given values is: "+result);
	}
	
	public void multiTwo(int x, int y){
		
		result= x*y;
		System.out.println("multiplication of given values is: "+result);
	}

	public static void main(String[] args) {
		//create instance object for class
		OopsDemo3 AE= new OopsDemo3();
		
		//to call sub methods
		AE.addone(10,20);
		AE.multiTwo(2,4);
	}

}