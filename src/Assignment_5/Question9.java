package Assignment_5;

public class Question9 {

	public static void main(String[] args) {

		int myNumber = 12345;
		int myNumber2 = 45678;
		
		int firstDigit =   myNumber / 10000;
		int secondDigit = (myNumber % 10000) / 1000;
		int thirdDigit =  ((myNumber % 10000) % 1000)/100;
		int fourthDigit = (((myNumber % 10000) % 1000)%100)/10;
		int fifthDigit =  myNumber % 10;

		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
		System.out.println(fourthDigit);
		System.out.println(fifthDigit);
		
		System.out.println();
		
		int firstDigit2 =   myNumber2 / 10000;
		int secondDigit2 = (myNumber2 % 10000) / 1000;
		int thirdDigit2 =  ((myNumber2 % 10000) % 1000)/100;
		int fourthDigit2 = (((myNumber2 % 10000) % 1000)%100)/10;
		int fifthDigit2 =  myNumber2 % 10;
		
		System.out.println(firstDigit2);
		System.out.println(secondDigit2);
		System.out.println(thirdDigit2);
		System.out.println(fourthDigit2);
		System.out.println(fifthDigit2);
		
	}

}
