package Lab1;

public class Question3 {

	public static void main(String[] args) {

		specialEleven(22);// → true
		specialEleven(23);// → true
		specialEleven(24);// → false
		
		
	}

	private static void specialEleven(int i) {

		if(i % 11 == 0 || i % 11 == 1) 
			System.out.println(true);
		
		else 
			System.out.println(false);
		
		
	}

}
