package Assignment_8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		sign();
		
		
	}

	private static void sign() {

		Scanner scan = new Scanner (System.in);
		

		
		System.out.println("Enter any number, please!");
		
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("because of your choose " + num + " result is " + "1");
		}else if(num < 0) {
			System.out.println("because of your choose " + num + " result is " + "-1");
		}else {
			System.out.println("because of your choose " + num + " result is " + "0");
		}
		
	
		
		
		
		
	}
}