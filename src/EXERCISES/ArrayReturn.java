package EXERCISES;

public class ArrayReturn {

	public static void main(String[] args) {

		int[] values;
		values = getArray();
		for (int numbers : values) {
			System.out.print(numbers + " ");
		}
		 
		
	}
		public static int[] getArray() {
			
			int[] numbers = {12,52,23,10};
			return numbers;
		
		
	}

}
