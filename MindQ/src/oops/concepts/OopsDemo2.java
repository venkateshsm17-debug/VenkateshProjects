package oops.concepts;

public class OopsDemo2 {

public int result;
	
	public void addone(){
		int a= 10;
		int b= 20;
		result= a+b;
		System.out.println("Addition of given values is: "+result);
	}
	
	public void multiTwo(){
		int x= 10;
		int y= 20;
		result= x*y;
		System.out.println("multiplication of given values is: "+result);
	}

	public static void main(String[] args) {
		//create instance object for class
		
		  OopsDemo2 AE= new OopsDemo2();
		  
		  //to call sub methods
		  AE.addone();
		  AE.multiTwo();
		 
		
	}

}

