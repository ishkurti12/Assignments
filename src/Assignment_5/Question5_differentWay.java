package Assignment_5;

public class Question5_differentWay {
	public static void main(String[] args) {
	
	int age = 8;
	String levelofBoys = null;
			
	if(age < 2) {
		levelofBoys = "ineligible";
	}else if(age == 2) {
		levelofBoys = "toddler";
	}else if(age >=3 && age <=5) {
		levelofBoys = "early childhood";
	}else if(age == 6 || age == 7) {
		levelofBoys = "young reader";
	}else if(age >=8 && age <=10) {
		levelofBoys = "elementary";
	}else if(age == 11 || age == 12) {
		levelofBoys = "middle";
	}else if(age == 13) {
		levelofBoys = "impossible";
	}else if(age >= 14 && age <= 16) {
		levelofBoys = "high school";
	}else if(age == 17 || age == 18) {
		levelofBoys = "scholar";
	}else {
		levelofBoys = "ineligible";
	}

	System.out.println("Age: " + age);
	
	System.out.println();

	System.out.println(levelofBoys);
}
}
