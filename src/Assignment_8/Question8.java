package Assignment_8;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
	    fib();
	  
	}
	  
	  public static void fib(){
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Input:");
		  int num = scan.nextInt();
		    
	      int previousNumber=0;
	      int nextNumber=1;
	      int sum =0;
	      
	      for (int i = 1; i < num-1; i++){
		       sum = previousNumber + nextNumber;
		       previousNumber = nextNumber;
		       nextNumber = sum;
		  }
		  System.out.println(sum);
		 
		  scan.close();
	  }
}