package oops.concepts;

public class ChildClass extends ParentClass{
	public void login(){
		System.out.println("setup program2");
	}

	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
		cc.setUp();
		cc.tearDown();
		cc.login();
		ParentClass pp= new ParentClass();
		pp.login();

	}

}
