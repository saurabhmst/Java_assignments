package com.taclab.ass04;
import java.util.*;
public class guess_word {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the word Guesser Game!");
		System.out.println("Here we will generate an 8 character word where some characters will be hidden, You will guess a single character A-Z if it related to string it will print on it's right position");
		System.out.println("Press 1 to start the Game");
		
		Scanner scanner= new Scanner(System.in);
		Random random = new Random();
		int choice = scanner.nextInt();
		
		while(choice==1)
		{
			
	     String word="";
	     
	     for(int i=0;i<8;i++)
	     {
	    	 int rand = random.nextInt(26);
	    	 word+=(char) (rand+'A');
	     }
			
	     System.out.println("string is "+word);	
	     
	    
	     String temp="--------";
	     String holder="";
	     int tries =0;
	     int n = 1+random.nextInt(8);
	     
	     for(int i = 0; i < n; i ++) {
	    	 int pos = random.nextInt(8);
                 
                 
                     holder = Character.toString(word.charAt(pos));
                     temp = temp.substring(0, pos) + holder + temp.substring( pos+1, temp.length());
                 
              
         }  
         
         
	     System.out.println(temp);

	     
	     
	    
	     do {
	            System.out.println("Enter your letter guess");
	            String guess = scanner.next();
	            
	        
	            for(int i = 0; i < word.length(); i ++) {
	                if (guess.equalsIgnoreCase(Character.toString(word.charAt(i)))) 
	                {
	                    
	                        holder = Character.toString(temp.charAt(i)).replace("-", guess).toUpperCase();
	                        temp = temp.substring(0, i) + holder + temp.substring( i + 1, temp.length());
	                    
	                } 
	          
	            }
	            tries++;
	            
	            
	            
	            System.out.println(temp);
	            if(temp.equals(word)) {
	                System.out.println("You guessed correctly! in "+tries+" triels");
	                break;
	            }
	        }while (tries < 10);
	     
	     if(tries>=10)
	     {
	     System.out.println("OOps!  you can try only 10 times!");
	     System.out.println("You lost the Game!");
	     return;
	     }
			choice = 0;
			
	    System.out.println("if you want to play again press 1");
	
		int again=scanner.nextInt();
		
		if(again==1)
		{
			choice=1;
		}	
			
			
		}
		
		System.out.println("Game Over!");

	}

}
