package eingabe;

import java.util.Scanner;

public class NextLine 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String name;
		String temp;
		int n;
		
		System.out.print("Bitte Ihren Namen eingeben: ");
		name = s.nextLine();						// Liest eine ganze Zeile ein
		System.out.println("Name: " + name);
		System.out.println("Test: >" + name + "<");	// Name steht nun direkt zwischen ">" und "<"

		System.out.println();
		System.out.print("Bitte Ihren Namen eingeben: ");
		name = s.next();			// Liest bis zum ersten Leerzeichen, Tab oder Enter ein.
		temp = s.next();
		System.out.println("Name: " + name);
		System.out.println("temp: " + temp);
		
		System.out.println();
		System.out.print("Bitte eine Zahl eingeben: ");
		n = s.nextInt();
		// s.nextLine();		// räumt die Eingabe auf!
		System.out.print("Bitte Ihren Namen eingeben: ");
		name = s.nextLine();
		System.out.println("Die Zahl: " + n);
		System.out.println("Ihr Name (steht zwischen > und <: >" + name + "<");
		
	}

}
