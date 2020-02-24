package week11_Review;

public class CastingWithPrimitives {

	public static void main(String[] args) {
		
		int intValue = 123;
		double doubleValue = intValue;
		
		
		Integer wrapperInt = Integer.valueOf(100);
		Double wrapperDouble = (double) wrapperInt;
		
		
	}
}