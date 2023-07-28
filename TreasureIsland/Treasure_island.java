package com.techlab.assign01;
import java.util.*;

public class Treasure_island {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the tresure island please select movement right or left");
		
		Scanner scanner = new Scanner(System.in);
		
		String move = scanner.next();
		
		if(move.equalsIgnoreCase("left"))
		{
			System.out.println("select move swim or wait");
			String move2 = scanner.next();
			
			if(move2.equalsIgnoreCase("wait"))
			{
				System.out.println("select a door among all three Red, Blue, Yellow");
				String door = scanner.next();
				
					
					if(door.equalsIgnoreCase("Red"))
					{
						System.out.println("Burned by fire Game Over.");
					}
					
					else if(door.equalsIgnoreCase("Blue"))
					{
						System.out.println("Eaten bye beats Game Over.");
					}
					
					else if(door.equalsIgnoreCase("Yellow"))
						
					{
						System.out.println("You Win!");
					}
					
					else
					{
						System.out.println("Game Over");
				    }
			
		    }
			
			else
			
				System.out.println("Attack by trout Game Over.");
			
		
		//System.out.println(move);
		
       
	}
	
		
		else
			System.out.println("fall into a hole Game Over");
		
		
	}

	
}
