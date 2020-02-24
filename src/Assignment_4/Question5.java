package Assignment_4;

public class Question5 {
	public static void main(String[] args) {
		int month,day,year;
		
		month = 6;
		day = 10;
		year = 60;
		
		
		if(day * month == year) {
			System.out.println("Date is magic");
		}else {
			System.out.println("Date is not magic");
		}
	}
}