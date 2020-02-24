package Lab1;

public class Question5 {

	public static void main(String[] args) {

		caughtSpeeding(60, false); //→ 0
		caughtSpeeding(65, false); //→ 1
		caughtSpeeding(65, true); //→ 0
		
	}

	private static void caughtSpeeding(int speed, boolean birthday) {

		if((speed<=60) || (birthday == true)) {
			System.out.println("0=no ticket");
		}else if(speed>=61 || speed<=80) {
			System.out.println("1=small ticket");
		}else if(speed >=81) {
			System.out.println("2=big ticket");
		}
		}
		

}
