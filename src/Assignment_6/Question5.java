package Assignment_6;

public class Question5 {
	public static void main(String[] args) {
		
		int start = 1;
		int end = 23;
		
				
		while (start <= end) {
			
		    if(start % 2 != 0){
		        System.out.print(start);
		        
	
		        if(end % 2 == 0){
		            if(start != (end - 1)) {
		            	 System.out.print(",");
		            }
		        } else {
						if(start != end) {
							System.out.print(",");
						}
		        }
		    }
		    start++;
		}
	}
}