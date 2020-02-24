package Assignment_3;

public class Question7 {
	public static void main(String[] args) {
		
		int input = 100;
		int itemPrice = 95;
		int change = input - itemPrice;
		
		int nicklesCount = 0;
		int dimesCount = 0;
		int quartersCount = 0;
		
		
		if(change == 25) {
			quartersCount++;
		}else if(change == 10) {
			dimesCount++;
		}if(change == 5) {
			nicklesCount++;
		} 
		
		
		System.out.println("Your change is " + quartersCount + " quarters, " + dimesCount + " dimes, and " + nicklesCount + " nickles");
		
		
		
		
	}
}