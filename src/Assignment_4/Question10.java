package Assignment_4;

public class Question10 {

		public static void main(String[] args) {
			
			double totalNumberOfCalories=25;
			double fatGrams=5;
			double caloriesFromFat;
			double percentageOfCaloriesFromFat;
			
			caloriesFromFat=fatGrams*9;
			percentageOfCaloriesFromFat=caloriesFromFat/totalNumberOfCalories;
			
			if(caloriesFromFat>totalNumberOfCalories) {
				System.out.println("The input is invalid");
			}else {
				if(caloriesFromFat<(0.3*totalNumberOfCalories)) {
					System.out.println("The food is low in fat ");
				}
			}

		}

	}