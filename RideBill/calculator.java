package com.techlab.assign01;
import java.util.*;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int height;
		System.out.println("Enter your height please");
		Scanner scanner = new Scanner(System.in);
		
		height = scanner.nextInt();
		int bill=0;
		
		if(height<120)
		{
			System.out.print("Can't ride");
		}
		
		else
		{
			System.out.println("Yes you can ride");
			System.out.println("Enter your age please");
			int age;
			age=scanner.nextInt();
			
			if(age<12)
			{
				bill=bill+5;
			}
			
			else if(age>=12 && age<18)
			{
				bill=bill+7;
			}
			
			else if(age>=18 && age<45)
			{
				bill=bill+12;
			}
			
			else
			{
				bill=bill+0;
			}
		}
		
		String pic;
				
		System.out.println("if you want pictures please write yes");
		pic = scanner.next(); 
		
		if(pic.equalsIgnoreCase("yes"))
		{
			bill=bill+3;
		}
		
		
		System.out.print("Your total bill of ride is ---->"+bill);

	}

}
