package aufgabe05;

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
	public static boolean istPrimzahl(int zahl)
	{
		boolean istPrimzahl = true;
		
		// Test ob es eine Primzahl ist
		// Primzahl ist nur durch 1 und sich selbst teilbar
		//   wenn es durch andere Zahl teilbar ist: keine Primzahl
		for (int n = 2;  n < zahl; n++)
		{
			if (zahl % n == 0)
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
		
		if (n > 1)
		{
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
		else
		{
			System.out.println("Die Zahl muss größer als 1 sein.");
		}
		s.close();
	}

}
