package Assignment_6;

public class Question4 {
	public static void main(String[] args) {
		
		int num = 62;
		
		int start = 1;

		int sum = 0;
		
		
		while (start <= num) {
			
			sum += start;
			
			start++;
			
			
		}
		
		System.out.println("Sum of the numbers from 1 to " + num + " is: " + sum);
		
	}
}