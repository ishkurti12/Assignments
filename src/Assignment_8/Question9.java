package Assignment_8;

public class Question9 {

	public static void main(String[] args) {
		
		//System.out.println(max(1, 10));
		//System.out.println(max(11, 5));
		
		int result1 = max(1,10);
		int result2 = max(11, 5);
		
		System.out.println(result1);
		System.out.println(result2);
			
	}

	public static int max(int x,int max) {
		
		if (x > max) {
			return max;
		}else {
			return x;
		}
	}
}