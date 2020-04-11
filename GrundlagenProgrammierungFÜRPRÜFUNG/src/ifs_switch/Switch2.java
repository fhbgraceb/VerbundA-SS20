package ifs_switch;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Bitte eine Ziffer (n) eingeben: ");
		n = s.nextInt();
		
		/*
		 * Das folgende Statement stammt (als C Programm) aus Wikipedia:
		 * 
		 * 		http://en.wikipedia.org/wiki/Switch_statement
		 */
		switch (n) 
		{
		  case 0:
			  		System.out.println("You typed zero.");
			  	break;
		  case 4:
			  		System.out.println("n is an even number.");
		  case 1:
		  case 9:
			  		System.out.println("n is a perfect square.");
			  	break;  
		  case 2:
			  		System.out.println("n is an even number.");
		  case 3:
		  case 5:
		  case 7:
			  		System.out.println("n is a prime number.");
		    	break;
		  case 6:
		  case 8:
			  		System.out.println("n is an even number.");
		    	break;
		  default:
			  		System.out.println("Only single-digit numbers are allowed.");
		    	break;
		}
	}
}
