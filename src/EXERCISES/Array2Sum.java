package EXERCISES;

public class Array2Sum {

	public static void main(String[] args) {

		
		int[] scores = {50,63,5,297,35,67,15,94,258,65,48,89,72,32};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		
		System.out.println("Sum is:" + sum);
		System.out.println("Total element in array is: " + scores.length);
		System.out.println("Avarage is: " + sum/scores.length);
	}

}
