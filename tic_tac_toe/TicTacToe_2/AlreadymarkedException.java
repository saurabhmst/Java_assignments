package TicTacToe_2;

public class AlreadymarkedException extends RuntimeException{
	
	public AlreadymarkedException() {
		super("Cell is Already Marked");
	}
}
