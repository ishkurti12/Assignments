package Assignment_5;

public class Question7 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		

		if(((num3 < num1) && (num1 < num2)) || ((num2 < num1) && (num1 < num3))) {
			System.out.println("Medium value is : " + num1);			
		}else if(((num3 < num2) && (num2 < num1)) || ((num1 < num2) && (num2 < num3))) {
			System.out.println("Medium value is : " + num2);
		}else {
			System.out.println("Medium value is : " + num3);
		}
	}
}
