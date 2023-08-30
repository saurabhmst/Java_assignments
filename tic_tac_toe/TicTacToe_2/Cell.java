package TicTacToe_2;

public class Cell {
	
	Choices choice;
	
	public Cell() {
		choice=Choices.EMPTY;
	}

	public Choices getChoice() {
		return choice;
	}

	public void setChoice(Choices choice) {
		this.choice = choice;
	}
	
	

}
