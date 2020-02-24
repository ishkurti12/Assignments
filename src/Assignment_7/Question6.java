package Assignment_7;

public class Question6 {

	public static void main(String[] args) {
		
		
		int a=0;
		int row=5;
		
		for(int i=1;i<=row;i++) {
			
			a=i;
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(a+" ");
				
				a=a+row-j;
				
			}
			
			System.out.println();
		}
		
	}

}
