package Assignment_8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		next3();
		
	}

	private static void next3() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number, please!");
		
		int firstNumber = scan.nextInt();
		
		System.out.println("Your entered number");
		System.out.println(firstNumber);
		System.out.println("");
		System.out.println("next 3 are:");
		System.out.println((firstNumber + 1) + " " + (firstNumber + 2) + " " + (firstNumber + 3));
		
		
		
		
	}

}
