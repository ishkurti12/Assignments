package Lab1;

public class Question2 {

	public static void main(String[] args) {

		
		love6(6, 4); //→ true"
		love6(4, 5); //→ false
		love6(1, 5); //→ true
		love6(12, 6); //->true
		
		
		
		
	}

	private static void love6(int num1, int num2) {

		if((num1 == 6 || num2 == 6) || (num1 + num2 == 6) || (num1-num2 == 6)) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
}
}