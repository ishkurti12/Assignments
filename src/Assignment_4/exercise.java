package Assignment_4;


		/*
		double bill, calls;
		calls = 400;

		if (calls < 100) {
		    System.out.println("Your bill is minimum 200$ for up to 100 calls");
		} else if (calls < 150) {
		    bill = ((calls - 100) * 0.60) + 200;
		    System.out.println("Your bill is: " + bill);

		} else if (calls < 200) {
		    bill = ((calls - 150) * 0.50) + (50 * 0.60) + 200;
		    System.out.println("Your bill is: " + bill);

		} else if (calls > 200) {
		    bill = ((calls - 200) * 0.40) + (50 * 0.50) +(50 * 0.60) + 200;
		    System.out.println("Your bill is: " + bill);

		} else {
			System.out.println("Please enter valid number...");
		}
		*/

		public class exercise {

			public static void main(String[] args) {
				
				double shippingCharge;
				int userWeight=20;
				
				if(userWeight<=2) {
					shippingCharge=1.10;
				}else if(userWeight<=6) {
					shippingCharge=2.2;
				}else if(userWeight<=10) {
					shippingCharge=3.7;
				}else {
					shippingCharge=3.8;
				}
				
				System.out.println("For every 500 miles, your shipping charge will be " + shippingCharge);

			
	}
}








