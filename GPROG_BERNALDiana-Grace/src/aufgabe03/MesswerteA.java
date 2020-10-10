package aufgabe03;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * MesswerteA:
 * Lesen Sie fünf Messwerte einer Versuchsreihe ein und
 * bestimmen Sie den Mittelwert. 
 *  
 *  1. Variante:
 *	Benutzen Sie für jeden der Messwerte eine eigene Variable.
*/

import java.util.Scanner;

public class MesswerteA 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double summe;
		double mw1, mw2, mw3, mw4, mw5;
		double mittel;
		
		System.out.print("Bitte geben Sie den 1. Messwert ein: ");
		mw1 = s.nextDouble();
		System.out.print("Bitte geben Sie den 2. Messwert ein: ");
		mw2 = s.nextDouble();
		System.out.print("Bitte geben Sie den 3. Messwert ein: ");
		mw3 = s.nextDouble();
		System.out.print("Bitte geben Sie den 4. Messwert ein: ");
		mw4 = s.nextDouble();
		System.out.print("Bitte geben Sie den 5. Messwert ein: ");
		mw5 = s.nextDouble();
		
		summe = mw1 + mw2 + mw3 + mw4 + mw5;
		mittel = summe / 5;
		
		System.out.println("Der Mittelwert beträgt: " + mittel);
        
        s.close();
	}

}
