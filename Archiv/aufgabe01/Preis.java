package aufgabe01;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Preis:
 * Lesen Sie 
 *  * Artikelpreis, 
 *  * Anzahl der gekauften Artikel und 
 *  * Mehrwertsteuersatz ein und 
 * geben Sie den zu zahlenden Gesamtpreis aus.
 */

public class Preis 
{
	public static void main(String[] args) 
	{
		double preis;
		int anzahl;
		double mwSt;
		double gesamtpreis;
		
		preis = 12.50;
		anzahl = 4;
		mwSt = 20;

		gesamtpreis = (preis * anzahl) * (100 + mwSt) / 100;

		System.out.println("Der Gesamtpreis betr�gt: " + gesamtpreis + " �");
	}
}
