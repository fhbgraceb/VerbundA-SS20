package aufgabe02;

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

import java.util.Scanner;

public class Preis 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double preis;
		int anzahl;
		double mwSt;
		double gesamtpreis;
		
		System.out.print("Einzelpreis: ");
		preis = s.nextDouble();
		System.out.print("Anzahl: ");
		anzahl = s.nextInt();
		System.out.print("MwSt: ");
		mwSt = s.nextDouble();

		gesamtpreis = (preis * anzahl) * (100 + mwSt) / 100;

		System.out.println("Der Gesamtpreis beträgt: " + gesamtpreis + " €");
        
        s.close();
	}
}
