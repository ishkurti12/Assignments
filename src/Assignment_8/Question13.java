package Assignment_8;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {

		
		System.out.println(waterBill());
		
		
	}

	private static double waterBill() {

		Scanner scan = new Scanner(System.in);
		double waterTax = scan.nextDouble();
		
		double fine = 0;
		
		if(waterTax <= 50) {
			fine = waterTax * 0.60;
		}
		if(waterTax > 50 && waterTax <= 100) {
			fine = waterTax * 0.90;
		}
		if(waterTax > 100 && waterTax <= 150) {
			fine = waterTax * 0.90 + 50;
		}
		if(waterTax > 150) {
			fine = waterTax * 0.90 + 100;
		}
		
		return fine;
			
	}
}