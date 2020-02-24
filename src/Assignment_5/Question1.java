package Assignment_5;

public class Question1 {

	public static void main(String[] args) {
		
		int numberOfBedrooms = 2;
		int startingPrice = 0;
		
		if(numberOfBedrooms == 1) {
			System.out.println("One Bedroom Selected");
			startingPrice = 1100;
			System.out.println(startingPrice);
		}else if(numberOfBedrooms == 2) {
			System.out.println("Two Bedroom Selected");
			startingPrice = 1850;
			System.out.println(startingPrice);
		}else if(numberOfBedrooms == 3) {
			System.out.println("Three Bedroom Selected");
			startingPrice = 2550;
			System.out.println(startingPrice);
		}else {
			System.out.println("No such Bedrooms available");
			startingPrice = 0;
			System.out.println("Starting Price: " + startingPrice);
		
		}
	}
}