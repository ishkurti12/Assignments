package Assignment_8;

public class Question14 {

	public static void main(String[] args) {
		
		System.out.println(threeLocks(true,false,false));
		System.out.println(threeLocks(true,true,false));
		System.out.println(threeLocks(true,true,true));
		System.out.println(threeLocks(false,true,false));
		System.out.println(threeLocks(false,true,true));
		
	}

	private static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		
		if(a && b == true || c == true) {
			return true;
		}else {
			return false;
		}
	}
}