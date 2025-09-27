package Web.Elements;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int c=a/b;
		
		}
		catch(Exception e) {
			System.out.println("enter b value except zero");
		}
		finally {
			System.out.println("Demo for Exception handling");
		}
	}

}
