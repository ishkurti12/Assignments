package Assignment_4;

public class Question2 {
	public static void main(String[] args) {
		
		
		double income = 1500;
		double tax = 0;
		
		
		System.out.println("Your income : " + income);
		
		if(income <= 150000000) {
			System.out.println("The tax amount you have to pay : " + (income * 25 / 100));
		}else if(income <= 300000000) {
			System.out.println("The tax amount you have to pay : " + (income * 30 / 100));
		}else if(income <= 600000000) {
			System.out.println("The tax amount you have to pay : " + (income * 35 / 100));
		}else if(income <= 1200000000) {
			System.out.println("The tax amount you have to pay : " + (income * 40 / 100));
		}else if(income > 1200000000) {
			System.out.println("The tax amount you have to pay : " + (income * 50 / 100));
		}
		
			
	
		
	}
}