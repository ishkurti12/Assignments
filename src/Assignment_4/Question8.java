package Assignment_4;

public class Question8 {
	public static void main(String[] args) {
		
		int numberPackages = 24;
		int packagePrice = 99;
		double discount = 0, total = 0;
		int subTotal = 0;
		
		if(numberPackages < 10) {
			subTotal = packagePrice * numberPackages;
			discount = 0;
			total = subTotal - discount;
		}else if(numberPackages <= 19 && numberPackages >= 10) {
			subTotal = packagePrice * numberPackages;
			discount = numberPackages * packagePrice * 0.2;
			total = subTotal - discount;
		}else if(numberPackages <=49 && numberPackages >=20) {
			subTotal = packagePrice * numberPackages;
			discount = numberPackages * packagePrice * 0.3;
			total = subTotal - discount;
		}else if(numberPackages >= 50 && numberPackages <=99) {
			subTotal = packagePrice * numberPackages;
			discount = numberPackages * packagePrice * 0.4;
			total = subTotal - discount;
		}else if(numberPackages >= 100) {
			subTotal = packagePrice * numberPackages;
			discount = numberPackages * packagePrice * 0.5;
			total = subTotal - discount;
		}
		
		System.out.println("SubTotal is " + subTotal);
		System.out.println("Discount is " + (int)discount);
		System.out.println("Total amount of the purchase after discount is " + (int)total);
		
		
	}
}