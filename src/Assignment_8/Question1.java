package Assignment_8;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
	plus(); //plus method name 
		
		
	}

	public static void plus() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter first number");
		int number1 = scan.nextInt();
		
		System.out.println("enter second number");
		int number2 = scan.nextInt();
		
		int result = (number1) + (number2);
		
		System.out.println("result: " + result);
		
		scan.close();

	
		
	}
}