package com.techlab.assign01;
import java.util.*;

public class currency_dinomination {

	public static void main(String[] args) {
		
      System.out.println("Please enter your amount");
      
      int amt;
      int a=0,b=0,c=0,d=0;
      Scanner scanner = new Scanner(System.in);
        amt = scanner.nextInt();
       if(amt>50000)
        {
        	 System.out.println("Amount should be less then or equal 50000");
        	 return;
        }
       else if(amt%100 !=0)
        {
        	 System.out.println("Amount should be multiple of 100");
        	 return;
        }
         
        else
        {
        	
        	
            a = amt/2000;
            amt = amt-a*2000;
            
            b=amt/500;
            amt=amt-b*500;
            
            c=amt/200;
            amt = amt-c*200;
            
            d=amt/100;
            amt= amt-d*100;
        	
        	
        	
        }
        if(a>0)
        System.out.println("2000 notes are "+ a);
        if(b>0)
        System.out.println("500 notes are "+ b);
        if(c>0)
        System.out.println("200 notes are "+ c);
        if(d>0)
        System.out.println("100 notes are "+ d);
      
	}

}
