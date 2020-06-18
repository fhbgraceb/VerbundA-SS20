package aufgabe06;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Primzahl: 
 * 
 * Bestimmen Sie, ob eine eingegebene natürliche Zahl eine Primzahl ist. 
 */
import java.util.Scanner;

public class PrimzahlUP 
{
	public static boolean istPrimzahl(int n)
	{
		boolean istPrimzahl = true;
		
		// Test ob es eine Primzahl ist
		// Primzahl ist nur durch 1 und sich selbst teilbar
		//   wenn es durch andere Zahl teilbar ist: keine Primzahl
		for (int i = 2;  i < n; i++)
		{
			if (n % i == 0)
			{
				istPrimzahl = false;
			}	
		}
		
		return istPrimzahl;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("Bitte die Zahl eingeben: ");
		n = s.nextInt();		
		
		// Ausgabe Primzahl ja/nein
		if (istPrimzahl (n))
		{
			System.out.println(n + " ist eine Primzahl.");
		}
		else
		{
			System.out.println(n + " ist keine Primzahl.");
		}	
	}

}
