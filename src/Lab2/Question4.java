package Lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter male person number");
		int male = scan.nextInt();
		System.out.println("Enter female person number");
		int female = scan.nextInt();
		
		int totalPerson = male + female;
		
		double percentMale = (double) male / totalPerson * 100;
		double percentFemale = (double) female / totalPerson * 100;
		
		System.out.println("%" + Math.round(percentMale));
		System.out.println("%" + Math.round(percentFemale));
		
		scan.close();
	}
}