package aufgabe03;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * MesswerteB:
 * Lesen Sie fünf Messwerte einer Versuchsreihe ein und
 * bestimmen Sie den Mittelwert. 
 *  
 *  2. Variante:
 *	Benutzen Sie für alle Messwerte dieselbe Variable.
*/

import java.util.Scanner;

public class MesswerteB 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double summe;
		double mw;
		double mittel;
		
		summe = 0;
		System.out.print("Bitte geben Sie den 1. Messwert ein: ");
		mw = s.nextDouble();
		summe = summe + mw;
		System.out.print("Bitte geben Sie den 2. Messwert ein: ");
		mw = s.nextDouble();
		summe = summe + mw;
		System.out.print("Bitte geben Sie den 3. Messwert ein: ");
		mw = s.nextDouble();
		summe = summe + mw;
		System.out.print("Bitte geben Sie den 4. Messwert ein: ");
		mw = s.nextDouble();
		summe = summe + mw;
		System.out.print("Bitte geben Sie den 5. Messwert ein: ");
		mw = s.nextDouble();
		summe = summe + mw;
		
		mittel = summe / 5;
		
		System.out.println("Der Mittelwert beträgt: " + mittel);
        
        s.close();
	}

}
