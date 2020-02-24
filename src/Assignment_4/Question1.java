package Assignment_4;

public class Question1 {
	public static void main(String[] args) {
		
		double pound,weight,height;
		int feet,inches;
		
		pound = 150;
		feet = 5;
		inches = 5;
		
		weight = pound / 2.2;
		height = ((feet * 12) + inches ) * 0.0254;
		
		double BMI = weight / (height * height);
		
		
		System.out.println("Your weight in pounds: " + pound);
		System.out.println("Your height in feet followed by a space then additional inches: " + feet + " " + inches);
		System.out.println("Your BMI is " + BMI);
		
		
		if(BMI < 18.5) {
			System.out.println("Your risk factory is Underweight");
		}else if(BMI >= 18.5 && BMI <25) {
			System.out.println("Your risk factory is Normal Weight");
		}else if(BMI >= 25 && BMI <30) {
			System.out.println("Your risk factory is Overweight");
		}else {
			System.out.println("Your risk factory is Obese");
		}
	}
}