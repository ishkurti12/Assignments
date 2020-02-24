package Lab1;

public class Question4 {

	public static void main(String[] args) {

		deerPlay(70, false); //- > true
		deerPlay(95, false); //- > false
		deerPlay(95, true); //- > true
		
	}

	private static void deerPlay(int i, boolean isSummer) {

		if(isSummer == true) { 
			if(i >= 60 && i <=100) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		}
		
		if(isSummer == false) {
			if(i >= 60 && i <=90) {
			System.out.println(true);
		}else
			System.out.println(false);
	}
	}
}