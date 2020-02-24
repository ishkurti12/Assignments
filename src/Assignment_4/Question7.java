package Assignment_4;

public class Question7 {
	public static void main(String[] args) {
		
		int seconds = 20000;
		
		if(seconds >= 86400) {
			int day = seconds / 86400; 
			System.out.println("There are " + day + " days in it.");
		}else if(seconds >= 3600) {
			int hour = seconds / 3600;
			System.out.println("There are " + hour + " hours in it.");
		}else if(seconds >=60) {
			int minutes = seconds / 60;
			System.out.println("There are " + minutes + " minutes in it.");
		}
	}
}