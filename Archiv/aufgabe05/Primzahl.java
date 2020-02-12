package aufgabe05;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Primzahl: 
 * 
 * Bestimmen Sie, ob eine eingegebene natürliche Zahl eine Primzahl ist. 
 */
import java.util.Scanner;

public class Primzahl 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl;
		boolean istPrimzahl;		// true oder false
		
		System.out.print("Bitte die Zahl eingeben: ");
		zahl = s.nextInt();
		istPrimzahl = true;
		
		/*
		 *  Test ob es eine Primzahl ist
		 *  Primzahl ist nur durch 1 und sich selbst teilbar
		 *  wenn es durch eine andere Zahl teilbar ist: keine Primzahl
		 */
		if (zahl > 1)
		{
			for (int n = 2;  n < zahl; n++)
			{
				if (zahl % n == 0)
				{
					istPrimzahl = false;
				}	
			}
			
			// Ausgabe Primzahl ja/nein
			if (istPrimzahl)
			{
				System.out.println(zahl + " ist eine Primzahl.");
			}
			else
			{
				System.out.println(zahl + " ist keine Primzahl.");
			}
		}
		else
		{
			System.out.println("Die Zahl muss größer als 1 sein.");
		}
		s.close();
	}

}
