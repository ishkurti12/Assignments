package Lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		int firstnumber = scan.nextInt();
		int smallest = firstnumber;
		int largest = firstnumber;
		
		while (true) {
			System.out.println("Enter your next number: ");
			int num = scan.nextInt();
			
			if(num > largest) {
				largest = num;
			}else if(num < smallest) {
				smallest = num;
			}
			
			System.out.println("Do you want to enter another number: 0-No, 1- Yes");
			int verify = scan.nextInt();
			
			if (verify == 1) {
				continue;
			}else {
				break;
			}
		}
		
		System.out.println("Smallest number is " + smallest);
		System.out.println("Largest number is " + largest);
		
		scan.close();
		
	}
}