package aufgabe04;

import java.util.Scanner;

/*
 * Beispielgruppe 3 - Bedingungen
 * 
 * Sortieren: 
 * Lesen Sie 3 Zahlen ein und sortieren Sie diese
 * ohne Verwendung von logischen Verknüpfungen (&& (and), || (or), etc). 
 */
public class Sortieren 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int zahl1, zahl2, zahl3;
		
		System.out.print("Bitte die erste Zahl eingeben: ");
		zahl1 = s.nextInt();
		System.out.print("Bitte die zweite Zahl eingeben: ");
		zahl2 = s.nextInt();
		System.out.print("Bitte die dritte Zahl eingeben: ");
		zahl3 = s.nextInt();
	
		/*
		 *  Zuerst die ersten beiden Zahlen vergleichen
		 *  Danach die dritte zwischen diesen positionieren
		 *  
		 *  Sind zwei Zahlen gleich groß ist die Reihenfolge egal
		 */
		if (zahl1 < zahl2)
		{
			if (zahl3 < zahl1)
			{
				System.out.println(zahl3 + " " + zahl1 + " " + zahl2);
			}
			else if (zahl3 < zahl2)		// zahl3 ist aber nicht kleiner als zahl1
			{
				System.out.println(zahl1 + " " + zahl3 + " " + zahl2);
			}
			else	// zahl3 muss die größte sein (oder gleich zahl2)
			{
				System.out.println(zahl1 + " " + zahl2 + " " + zahl3);
			}
		}
		else	// zahl1 >= zahl2 also zahl2 <= zahl1
		{
			if (zahl3 < zahl2)
			{
				System.out.println(zahl3 + " " + zahl2 + " " + zahl1);
			}
			else if (zahl3 < zahl1)		// zahl3 ist aber nicht kleiner als zahl1
			{
				System.out.println(zahl2 + " " + zahl3 + " " + zahl1);
			}
			else	// zahl3 muss die größte sein (oder gleich zahl2)
			{
				System.out.println(zahl2 + " " + zahl1 + " " + zahl3);
			}			
		}
	}

}
