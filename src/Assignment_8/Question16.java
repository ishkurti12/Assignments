package Assignment_8;

public class Question16 {

	public static void main(String[] args) {
		
		System.out.println(simpleRoomBook(false,2,1,2018));
		System.out.println(simpleRoomBook(true,2,1,2018));		
		System.out.println(simpleRoomBook(true,7,2,2018));
		
	}

	private static String simpleRoomBook(boolean check, int month, int day, int year) {
		
		if(check == true && year == 2018) {
			if(month == 7 && (day >=1 || day<=8)) {
				return "false";
		}else {
			return "true";
		}
		
			
		}else {
			return "false";
	}
}
}