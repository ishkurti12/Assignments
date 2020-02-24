package Assignment_8;

import java.util.Scanner;

public class Question7 {
	
	public static void main(String[] args) {
		
		
	    isPalindrome();
	
	}
	
	  public static void isPalindrome(){
		    Scanner scan = new Scanner(System.in);
		    System.out.print("Input:");
		    int num = scan.nextInt();
		    
		    int palindrome = num;
		    int reverse = 0;
	
		    while(palindrome != 0){
		      int remainder = palindrome % 10;
		      reverse = reverse * 10 + remainder;
		      palindrome = palindrome / 10;
		    }
		    
		    if(num==reverse){
		      	System.out.println(true);
		    }else{
		      	System.out.println(false);

		    }
		
	}
}