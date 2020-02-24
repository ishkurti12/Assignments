package Assignment_8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		cube();		
		
	}
	
	public static void cube() {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the number");
		
		int number = scan.nextInt();
		
		int result = (number * number * number);
		System.out.println(result);
		scan.close();
	}
	
}
