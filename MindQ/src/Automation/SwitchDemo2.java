package Automation;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		int dayNo;
		String day;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number from 1 to 7");
		dayNo=sc.nextInt();
		
		switch(dayNo)
		{
		case 1:
			day="Sunday";
			break;
		case 2:
			day="Monday";
			break;
		case 3:
			day="Tuesday";
			break;
		case 4:
			day="Wednesday";
			break;
		case 5:
			day="Thursday";
			break;
		case 6:
			day="Friday";
			break;
		case 7:
			day="Saturday";
			break;
		default:
			day="Invalid day";
			
		}
		System.out.println(day);

	}

}
