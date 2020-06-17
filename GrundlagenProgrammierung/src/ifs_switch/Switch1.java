package ifs_switch;

import java.util.Scanner;

public class Switch1 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("Bitte eine Zahl eingeben: ");
		n = s.nextInt();
		
		switch (n) 
		{
			case 1 : System.out.println("Eins");
					 break;
			case 2 : System.out.println("Zwei");
					 break;
			case 3 : System.out.println("Drei");
					 break;
			default : System.out.println("Eine andere Zahl.");
		}
		System.out.println("Auf Wiedersehen!");
	}
}
