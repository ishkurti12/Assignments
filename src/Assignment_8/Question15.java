package Assignment_8;

public class Question15 {

	public static void main(String[] args) {

		System.out.println(validateTask(true,2,1));
		System.out.println(validateTask(true,3,1));
		System.out.println(validateTask(false,3,2));
		
	}

	private static boolean validateTask(boolean check, int taskID, int currentID) {
		
		if((check == true) && (taskID - currentID == 1)) {
			return true;
		}else {
			return false;
		}	
	}
}