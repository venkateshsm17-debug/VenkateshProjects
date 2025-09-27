package oops.concepts;

public class OopsDemo1 {

public static int result;
	
	public static void addOne(){
		int a= 10;
		int b= 20;
		result= a+b;
		System.out.println("Addition of given values is: "+result);
	}
	
	public static void multiTwo(){
		int x= 10;
		int y= 20;
		result= x*y;
		System.out.println("multiplication of given values is: "+result);
	}

	public static void main(String[] args) {
		//to call sub methods
				addOne();
				multiTwo();
				
//		OopsDemo1 op1=new OopsDemo1();
//		op1.addOne();
//		op1.multiTwo();
		
//		OopsDemo1.addOne();
//		OopsDemo1.multiTwo();
		
		
			
	}

	
	}
	