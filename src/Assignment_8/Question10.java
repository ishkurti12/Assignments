package Assignment_8;

public class Question10 {

	public static void main(String[] args) {
			
		System.out.println(isEven(1));
		System.out.println(isEven(8));
		System.out.println(isEven(0));
		
	}

	private static String isEven(int num) {
		
		if(num %2 == 0) {
			return "true";
		}else{
			return "false";
		}
	}
}