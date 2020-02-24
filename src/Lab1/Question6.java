package Lab1;

public class Question6 {

	public static void main(String[] args) {
		
		cigarParty(30, false); //→ false
		cigarParty(50, false); //→ true
		cigarParty(70, true); //→ true
	}

	private static void cigarParty(int cigars, boolean weekend) {
		
		if(weekend == false) {
			if(cigars >= 40 && cigars <=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}if(weekend == true) {
			if(cigars >=40 && cigars>=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		}
}

