package com.taclab.Game;

	import java.util.Random;
	import java.util.Scanner;

	public class dice_game_updated {
		public static int total_score=0;
	    public static void main(String[] args) {
	    	
	    	System.out.println("Welcome to the Dice Game.\nYour task is to generate the score greater then or equal to 20 in less then 15 attempts to win the game"
	    			+ "\nif you want to play press y/n");
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	String choice = scanner.next();
	    	
	    	
	    	while(choice.equalsIgnoreCase("y"))
	    	{
	         if(playGame()==false)
	        	 break;
	         System.out.println("your total score in all sessions is ->"+total_score);
             System.out.println("Do you want to play again y/n");
             String ans=scanner.next();
             if(ans.equalsIgnoreCase("y"))
             {
             choice = "y";
             continue;
             }
             choice = "n";
	    	}
	    	
	    	System.out.println("Game over!");
	   
	    }
        
	    
	    public static boolean playGame() {
	        int score = 0;
	        int atempt=0;

	        

	        while (atempt<10) {
	        	atempt++;
	            int dice = rollDice();
	            total_score+=dice;
	            System.out.println("You rolled a " + dice);

	            if (dice == 1) 
	               {
	            	
	                score = 0;
	                System.out.println("Oops! You rolled a 1. Your score is reset now it is 0.And attempts are"+atempt);
	                continue;
	              } 
	           
	                score += dice;
	                
	                System.out.println("Your current score: " + score+ " and atempts =" +atempt);

	                if (score >= 20) 
	                 {
	                	
	                	win(atempt);
	                  
	                    return true;
	                 } 
	               
	                    System.out.print("Enter 'r' to roll again, or 'h' to hold: ");
	                    Scanner scanner = new Scanner(System.in);
	                    String input = scanner.nextLine().trim().toLowerCase();
	                    
	                   if(select_choice(input,scanner,atempt,score))
	               
	                	   return true;

//	                    	
	                 }
	               

	        System.out.println("Attempt limit has exceeded");
	        System.out.println("Your current score is "+score+" and total generated score is "+total_score);
	        
			return false;
	   }

	    private static boolean select_choice(String input, Scanner scanner,int atempt,int score) {
			// TODO Auto-generated method stub
	    	if (input.equals("h")) 
        	{
            System.out.println("You decided to hold. Your score is saved.");
            System.out.println("Your current score is "+score+" and attempts are "+atempt);
            
            System.out.println("Do you want to play a new session or resume it select n/c");
            String option = scanner.nextLine().trim().toLowerCase();
            if(option.contentEquals("n"))
            {
               return true;
            }
            
            return false;
            
        	} 
	    	
	    	while (!input.equals("r")) 
        	{
        		System.out.println("Invalid input. Please try again.");
        		 String input1 = scanner.nextLine().trim().toLowerCase();
        		 input=input1;
        	}
	    	return false;
		}


		private static void win(int atempt) {
			// TODO Auto-generated method stub
            System.out.println("Congratulations! You won the game! \nin "+atempt+" atempts");

			
		}


		public static int rollDice() {
	        Random random = new Random();
	        return random.nextInt(6) + 1;
	    }
	

	
}
