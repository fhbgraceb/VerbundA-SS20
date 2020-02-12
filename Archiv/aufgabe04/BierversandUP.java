package aufgabe04;

import java.util.Scanner;

/*
 * Beispielgruppe 3 - Bedingugen
 * 
 * Bierversand: 
 * Ein Bierversand verkauft F�sser mit jeweils n Liter Fassungsverm�gen. 
 * Die Kunden k�nnen beliebige Mengen in ganzen Litern bestellen. 
 * 
 * Schreiben Sie ein Programm, das n und eine Bestellmenge einliest 
 * und die Anzahl der ben�tigten F�sser berechnet. 
 */
public class BierversandUP 
{

	public static int anzahlFaesser(int proFass, int benoetigteMenge)
	{
		int anzahlFaesser;

		/*
		 * Anmerkung:
		 * Beim Runden kann auch abgerundet werden.
		 * 
		 * Benutzt man zum Runden Math.ceil() kann man sich die if-Anweisung ersparen.
		 */
		anzahlFaesser = (int)(Math.round((double)benoetigteMenge / proFass));
		if (anzahlFaesser < proFass * benoetigteMenge) 
		{
			anzahlFaesser++;		// Anzahl der F�sser um 1 erh�hen
		}
		// Alternative:
		anzahlFaesser = (int)(Math.ceil((double)benoetigteMenge / proFass));

		return anzahlFaesser;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		final int fassInhalt;
		int bestellMenge;
		int faesser;
		
		System.out.print("Bitte den Fassinhalt eingeben: ");
		fassInhalt = s.nextInt();
		System.out.print("Bitte die Bestellmenge eingeben: ");
		bestellMenge = s.nextInt();
		
		faesser = anzahlFaesser(fassInhalt, bestellMenge);
		
		System.out.println("Es werden " + faesser + " F�sser ben�tigt.");
	}

}
