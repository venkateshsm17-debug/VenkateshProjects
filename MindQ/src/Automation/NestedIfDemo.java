package Automation;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		int stMarks;
		String stGrade="";
		System.out.println("Enter student marks");
		//to read student marks from console
		Scanner sc= new Scanner(System.in);
		stMarks= sc.nextInt();
		
		if (stMarks >= 90){
			stGrade="A";
		}
		else if (stMarks >= 80){
			stGrade ="B";
		}
		else if(stMarks >= 70){
			stGrade ="C";
		}
		else{
			stGrade ="D";
		}
		
		System.out.println("Student marks are: "+stMarks);
		System.out.println("Student Grade is: "+stGrade);

	

	}

}
