package aufgabe01_Prog2018;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Flaschen: 
 * Sie haben eine bestimmte Anzahl gleich großer Flaschen. 
 * Lesen Sie das Fassungsvermögen einer Flasche und ihre Anzahl ein. 
 * Berechnen Sie das gesamte Fassungsvermögen aller Flaschen zusammen.
 */

public class Flaschen 
{

	public static void main(String[] args) 
	{
		double fassung;	// Es gibt auch 1,5 Liter oder 0,33 Liter Flaschen
		int anzahl;		// Es gibt keine halben Flaschen
		double gesamt;
		
		// Werte einlesen
		anzahl = 20;
		fassung = 0.5;
		
		// Berechnung durchführen
		gesamt = anzahl * fassung;
		
		// Ergebnis ausgeben
		System.out.println(anzahl + " Falschen à " + fassung +  " Liter fassen zusammen " + gesamt + " Liter.");
 	}

}
