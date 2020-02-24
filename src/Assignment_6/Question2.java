package Assignment_6;

public class Question2 {
	public static void main(String[] args) {
		
		int count = 9;
		
		int pre1 = 0, pre2 = 1;
		
		String print = "";
		
		System.out.println("Fibonacci Series of " + count + " numbers:");
		
		
		System.out.print(pre1 + " ");
		
		for (int i = 1; i <= count; i++){
		    
			System.out.print(pre2 + " ");
			
		   int sumOfPrevTwo = pre1 + pre2; 
		   pre1 = pre2;
		   pre2 = sumOfPrevTwo;
		   
		}
	}
}