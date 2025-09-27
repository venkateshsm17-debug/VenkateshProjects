package Automation;

import java.util.Scanner;

public class SwitchStmtDemo {

	public static void main(String[] args) {
		System.out.println("Enter any one character from -RGB");
		Scanner sc= new Scanner(System.in);
		String myColor=sc.nextLine();
		sc.close();

		switch(myColor.toUpperCase()){
		case "R":
			System.out.println("Your choice is: RED");
			break;
		case "G":
			System.out.println("Your choice is: GREEN");
			break;
		case "B":
			System.out.println("Your choice is: BLUE");
			break;
		default:
			System.out.println("Invalid entity");
		}


	}

}
