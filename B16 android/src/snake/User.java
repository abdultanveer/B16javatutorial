package snake;

public class User {
	Snake cobra;
	public void start() {
		 cobra = new Snake();
		cobra.move(5);
		
	}
	
	
	public void tapArrowKey(int direction) {
		cobra.turn(direction);
	}
	
	public static void main(String[] args) {
		User abdul = new User();
		abdul.start();
		abdul.tapArrowKey(4);
	}

}
