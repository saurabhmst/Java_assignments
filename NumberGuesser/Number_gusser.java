package com.techlab.assgn02;
import java.util.*;

public class Number_gusser {

	public static void main(String[] args) {
		
		System.out.println("Welcome to number Gusser Press 1 to start the Game");
		System.out.println("Press 1 to start the Game");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		
		while(choice==1)
		{
		 Random randI = new Random();
		 int number =randI.nextInt(100);
		 System.out.println("number is="+number);
		 
		 
		 System.out.println("Guess the number between 1 to 100");
		 
		 int input_number = scanner.nextInt();
		 int ct=1;
		 
		 while(number!=input_number && ct<11)
		 {
			 
	     if(input_number>100 || input_number<1)
	     {
	    	 System.out.println("please enter number between 1 to 100"); 
	    	 System.out.println("Try again");
			 input_number=scanner.nextInt();
	     }
		 
	     else if(input_number>number)
		 {
			 ct++;
			 System.out.println("Sorry this is too high");
			 System.out.println("Try again");
			 input_number=scanner.nextInt();
			 
		 }
			
			
	     else if(input_number<number)
		 {
			 ct++;
			 System.out.println("Sorry this is too low");
			 System.out.println("Try again");
			 input_number=scanner.nextInt();
			 
		 }
		 
		 
			
		 }
		 
		 if(ct<10)
		 {
		 System.out.println("congratulation! you Won the game in "+ct+" attempt");
		 }
		 
		 else
		 {
			 System.out.println("you took greater then 10 attempts");
		 }
		 System.out.println("if you want to play again press 1");
		 
		 choice = scanner.nextInt();
		 
			
		}
		
		System.out.println("Game Over!");
		
        
	}

}
