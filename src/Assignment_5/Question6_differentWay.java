package Assignment_5;

public class Question6_differentWay {

	public static void main(String[] args) {
		
		int vehicleYear = 2016;
	
		if(vehicleYear == 1995 || vehicleYear == 1996 || vehicleYear == 1997 || vehicleYear == 1998) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if(vehicleYear == 2001 || vehicleYear == 2002) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if(vehicleYear == 2004 || vehicleYear == 2005 || vehicleYear <= 2006) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if(vehicleYear == 2015 || vehicleYear == 2016 || vehicleYear == 2017) {
			System.out.println("Your vehicle needs to be recalled!");
		}else {
			System.out.println("Your vehicle is fine, enjoy!");
		}
	}
}