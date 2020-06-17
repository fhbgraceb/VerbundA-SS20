package aufgabe02;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Flaschen: 
 * Sie haben eine bestimmte Anzahl gleich großer Flaschen. 
 * Lesen Sie das Fassungsvermögen einer Flasche und ihre Anzahl ein. 
 * Berechnen Sie das gesamte Fassungsvermögen aller Flaschen zusammen.
 */

import java.util.Scanner;

public class Flaschen 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double fassung;	// Es gibt auch 1,5 Liter oder 0,33 Liter Flaschen
		int anzahl;		// Es gibt keine halben Flaschen
		double gesamt;
		
		// Werte einlesen
		System.out.print("Bitte die Anzahl der Flaschen eingeben: ");
		anzahl = s.nextInt();
		System.out.print("Bitte das Fassungsvermögen einer Flasche eingeben: ");
		fassung = s.nextDouble();
		
		// Berechnung durchführen
		gesamt = anzahl * fassung;
		
		// Ergebnis ausgeben
		System.out.println(anzahl + " Falschen à " + fassung +  " Liter fassen zusammen " + gesamt + " Liter.");
        
        s.close();
	}

}
