package EXERCISES;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Task92 {

	public static void main(String[] args) {

		int [] numbers = new int [10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
			System.out.println(numbers[i] * 19);
			
		}
		
			System.out.println(Arrays.toString(numbers));
	}

}
