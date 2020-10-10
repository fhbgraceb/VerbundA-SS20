package aufgabe03;

/*
 * Beispielgruppe 2 - Unterprogramme
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

	public static double preis(double preis, int anzahl, double mwSt)
	{
		double ergebnis = 0;
		
		ergebnis = (preis * anzahl) * (100 + mwSt) / 100;
		
		return ergebnis;
	}
	
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

		gesamtpreis = preis(preis, anzahl, mwSt);

		System.out.println("Der Gesamtpreis beträgt: " + gesamtpreis + " €");
	}
}
