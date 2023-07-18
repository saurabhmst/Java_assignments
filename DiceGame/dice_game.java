package com.taclab.Game;

	import java.util.Random;
	import java.util.Scanner;

	public class dice_game {
		public static int total_score=0;
	    public static void main(String[] args) {
	    	
	    	System.out.println("Welcome to the Dice Game.\nYour task is to generate the score greater then or equal to 20 to win the game"
	    			+ "\nif you want to play press one");
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	int choice = scanner.nextInt();
	    	
	    	if(choice==1)
	        playGame();
	    	
	    	System.out.println("Game over!");
	    }

	    public static void playGame() {
	        int score = 0;
	        boolean gameOver = false;

	        

	        while (!gameOver) {
	            int dice = rollDice();
	            System.out.println("You rolled a " + dice);

	            if (dice == 1) 
	            {
	            	total_score+=score;
	                score = 0;
	                System.out.println("Oops! You rolled a 1. Your score is reset now it is 0.");
	            } 
	           else 
	           {
	                score += dice;
	                
	                System.out.println("Your current score: " + score);

	                if (score >= 20) 
	                 {
	                	total_score+=score;
	                    System.out.println("Congratulations! You won the game!");
	                    gameOver = true;
	                 } 
	               else {
	                    System.out.print("Enter 'r' to roll again, or 'h' to hold: ");
	                    Scanner scanner = new Scanner(System.in);
	                    String input = scanner.nextLine().trim().toLowerCase();

	                    	if (input.equals("h")) 
	                    	{
	                        System.out.println("You decided to hold. Your score is saved.");
	                        System.out.println("Your current score is "+score);
	                        total_score+=score;
	                        score = 0;
	                        System.out.println("Do you want to play a new session select y/n");
	                        String option = scanner.nextLine().trim().toLowerCase();
	                        if(!option.contentEquals("y"))
	                        {
	                        	gameOver=true;
	                        }
	                        
	                    	} 
	                    	else if (!input.equals("r")) 
	                    	{
	                    		System.out.println("Invalid input. Please try again.");
	                    	}
	                    	
	                    	System.out.println();
	                    }
	                }
	        }

	        System.out.println("Thank you for playing the Dice Game!");
	        System.out.println("your total score in all sessions is ->"+total_score);
	    }

	    public static int rollDice() {
	        Random random = new Random();
	        return random.nextInt(6) + 1;
	    }
	

	
}
