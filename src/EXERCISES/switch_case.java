package EXERCISES;

import java.util.Scanner;

public class switch_case {
	public static void main(String[] args) {
		
	
		System.out.println("Enter day number, please");
		
		Scanner scan = new Scanner(System.in); 
		
		int daysNumber = scan.nextInt();
		
		switch (daysNumber) {
		case 1:
			System.out.println("Your chosen day is Sunday");
			break;
		case 2:
			System.out.println("Your chosen day is Monday");
		break;
		case 3:
			System.out.println("Your chosen day is Tuesday");
			break;
		case 4:
			System.out.println("Your chosen day is Wednesday");
			break;
		case 5:
			System.out.println("Your chosen day is Thursday");
			break;
		case 6:
			System.out.println("Your chosen day is Friday");
			break;
		case 7:
			System.out.println("Your chosen day is Saturday");
			break;
		default:
			System.out.println("invalid input. please try again");
		}
		
		scan.close();
	}
}







