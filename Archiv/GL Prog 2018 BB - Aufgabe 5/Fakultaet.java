package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 *
 * Fakult�t: 
 * 
 * Berechnen Sie die Fakult�t von n mit Hilfe einer Schleife.
 */ 
public class Fakultaet 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println(" *** Fakult�t ***");
		System.out.print("Bitte n eingeben: ");
		n = s.nextInt();
				
		System.out.println("Die Summe betr�gt: " + fakultaet(n));
	}

	public static int fakultaet(int n)
	{
		int fakultaet = 1;		// Startwert 1, weil multipliziert wird.
		
		for (int i = 1; i <= n; i++)
		{
			fakultaet *= i;
		}
		
		return fakultaet;
	}
}
