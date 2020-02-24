package Assignment_4;

public class Question6 {

	public static void main(String[] args) {
		
		double mass,weight;	
		
		mass = 100;
		weight = mass * 9.8;
		
		if(weight > 1000) {
			System.out.println("its too heavy");
		}else if(weight < 10) {
			System.out.println("its too light");
		}else {
			System.out.println("its normal");
		}
	}
}