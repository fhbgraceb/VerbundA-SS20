package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Hier werden verschiedene Berechnungen durch ein Menügesteuertes Programm aufgerufen.
 * 
 */
public class Berechnungen 
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

	public static long nHochN(long n)
	{
		long summe;
		long produkt;

		summe = 0;
		/*
		 * In der äußeren Schleife wertden die Produkte aufsummiert. 
		 */
		for (int i = 1; i <= n; i++)
		{
			/* 
			 * In der inneren Schleife werden die Produkte gebildet.
			 * 
			 * Also 1, 2*2, 3*3*3, ...
			 */
			produkt = 1;
			for (int j = 1; j <= i; j++)
			{
				produkt *= i;
			}
			summe += produkt;
			// Zur Kontrolle:
//			System.out.println("i: " + i + " Produkt: " + produkt + " Summe: " + summe);
		}
		
		return summe;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int n;
		int auswahl;
		boolean weitermachen;
		
		// Zahl einlesen
		System.out.print("Bitte eine Zahl (n) eingeben: ");
		n = s.nextInt();
		
		weitermachen = true;
		do {
			// Auswahl ausgeben
			System.out.println("Was wollen Sie tun?");
			System.out.println("  1) Neuen Wert für n eingeben");
			System.out.println("  2) Primzahltest für n");
			System.out.println("  3) Die Summe n hoch n berechnen");
			System.out.println("  0) Programm beenden");
			
			// Wahl einlesen
			System.out.print("Ihre Wahl: ");
			auswahl = s.nextInt();
			
			// Abhängig von der Auswahl
			switch (auswahl)
			{
				case 1 :System.out.print("Bitte eine Zahl (n) eingeben: ");
					 	n = s.nextInt();
					break;
				case 2 :if (istPrimzahl(n))
						{
							System.out.printf("Ja! Die Zahl %d ist eine Primzahl.\n", n);
						}
						else
						{
							System.out.printf("Nein! Die Zahl %d ist keine Primzahl.\n", n);
						}
					break;
				case 3 :System.out.println("Die Summe n hoch n ist: " + nHochN(n));
					break;	
				case 0: weitermachen = false;
					break;
				default : System.out.println("Sie haben leider eine ungültige Wahl getroffen.");
			}
		} while (weitermachen);
		
		System.out.println("Auf Wiedersehen!");

	}

}
