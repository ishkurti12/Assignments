package Assignment_6;

public class Question7 {

	public static void main(String[] args) {
		
		for(int i=4;i>=1;i--) {
			for (int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			
			for (int m=i;m>0;m--) {
				System.out.print(m + " ");
			}
			
			System.out.println();
			
		}
		
	}
}