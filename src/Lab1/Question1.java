package Lab1;

public class Question1 {

	public static void main(String[] args) {
		
		
		System.out.println(stringTimes("Hi",2));
		System.out.println(stringTimes("Hi",3));
		System.out.println(stringTimes("Hi",1));
		
		
	}
	
	public static String stringTimes(String str, int num) {
		
		if(num == 1) {
			return "Hi";
		}
		if(num == 2) {
			return "HiHi";
		}
		if (num == 3) {
			return "HiHiHi";
		}
		return str;
		
		
	}

}