package TicTacToe_2;

public class InValidException extends RuntimeException{
	
	public InValidException() {
		super("Please enter a valid choice");
	}
	
}
