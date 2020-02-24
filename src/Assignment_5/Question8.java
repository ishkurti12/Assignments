package Assignment_5;

public class Question8 {
	public static void main(String[] args) {
		
		int player = 10, house = 9;
		
		if(player+house >21) {
			System.out.println("Bust");
		}else if(house>player) {
			System.out.println("Player loses");
		}else if(player==house) {
			System.out.println("It's a tie");
		}else if(player>house) {
			System.out.println("Player wins");
		}
	}
}