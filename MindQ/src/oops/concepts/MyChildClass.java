package oops.concepts;

public class MyChildClass extends MyBaseClass {
	
	
	  public void setUp(){ 
		  System.out.println("Login with Invalid data");
	  
	     super.setUp(); }
	 

		public static void main(String[] args) {
			MyChildClass mcc= new MyChildClass();
			mcc.setUp();
			mcc.tearDown();
			
//			MyBaseClass mbc= new MyBaseClass();
//			mbc.setUp();
		}
	}


