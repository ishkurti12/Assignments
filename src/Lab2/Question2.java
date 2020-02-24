package Lab2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		
		System.out.println("Enter your eaten cookies, please");
		Scanner scan = new Scanner(System.in);
		int cookies = scan.nextInt();
		int perCalori = 10 * 300 / 40;
		int totalCalories = cookies * perCalori;
		
		if (cookies >= 1 && cookies <= 40) {
			System.out.println("Your eaten cookies => " + cookies);
			System.out.println("Your eaten cookies calories => " + totalCalories);
		}else {
			System.out.println("Invalid value. enter from 1 to 40");
		}
		scan.close();
	}
}