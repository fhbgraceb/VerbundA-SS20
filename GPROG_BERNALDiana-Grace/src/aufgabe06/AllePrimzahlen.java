package aufgabe06;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * AllePrimzahlen:
 * 
 *  Lesen Sie eine Zahl ein und geben Sie alle Primzahlen aus,
 *  die kleiner als diese Zahl sind.
 *  
 *  Beispiel:
 *  	Eingabe: 10
 *  	Ausgabe: 2, 3, 5, 7
 *  (kann auch in mehreren Zeilen ausgegeben werden.)
 */
public class AllePrimzahlen 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl;
		boolean nIstPrimzahl;		// true oder false
		
		System.out.print("Bitte die Zahl eingeben: ");
		zahl = s.nextInt();
		
		/* 
		 * Äussere Schleife um eine Zahl nach der anderen zu Testen.
		 * Ausgabe der Zahlen erfolgt in der Schleife.
		 */
		System.out.println("Primzahlen kleiner als " + zahl + " sind:");
		for (int n = 2; n < zahl; n++)
		{
			nIstPrimzahl = true;
		
			/*
			 * Innre Schliefe für den Primzahltest.
			 * Primzahl ist nur durch 1 und sich selbst teilbar
			 * wenn es durch andere Zahl teilbar ist: keine Primzahl
			 */
			for (int i = 2;  i < n; i++)
			{
				if (n % i == 0)
				{
					nIstPrimzahl = false;
				}	
			}
		
			// Ausgabe der Primzahl
			if (nIstPrimzahl)
			{
				System.out.print(n + " ");
			}
		}
	}

}
