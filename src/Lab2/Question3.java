package Lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a positive nonzero any value");
		int input = scan.nextInt();
		
		for (int i = 1; i <= input; i++) {
			sum = sum + i;
		}


		System.out.println(sum);
		
	
		scan.close();
	}
}