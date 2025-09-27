package oops.concepts;

public class OopsDemo4 {
public int result;



	
	public int Addone(int a, int b){
		
		result= a+b;
		return result;
	}
	
	public int multiTwo(int x, int y){
		
		result= x*y;
		return result;
	}

	public static void main(String[] args) {
		//create instance object for class
		OopsDemo4 AE= new OopsDemo4();
		//to call sub methods
		int m=AE.Addone(5, 6);
		int n=AE.multiTwo(9, 5);
		int o=AE.Addone(1, 5);
		System.out.println("addition of  and  is: "+m);
		System.out.println("multiplication of 9 with 5 is: "+n);
		System.out.println("addition of 5 and 6 is: "+o);
	}

}

