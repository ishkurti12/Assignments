package Assignment_4;

public class Question9 {

	public static void main(String[] args) {
		
		int weight = 155;
		double charges = 0 ;
	
		
		if(weight <=2) {
			charges = 1.10;
			
			
		}else if(weight>2 && weight<=6) {
			charges = 2.20;
			
		}else if (weight>6 && weight<=10) {
			charges = 3.70;
			
		}else if(weight>10) {
			charges = 3.80;
		}
		
		System.out.println("For every 500 miles, your shipping charge will be " + charges);

	}

}
