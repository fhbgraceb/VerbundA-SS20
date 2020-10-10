package aufgabe04_Prog2018;

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
public class Bierversand 
{

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
		
		/*
		 * Anmerkung:
		 * Beim Runden kann auch abgerundet werden.
		 * 
		 * Benutzt man zum Runden Math.ceil() kann man sich die if-Anweisung ersparen.
		 */
		faesser = (int)(Math.round((double)bestellMenge / fassInhalt));
		if (faesser < fassInhalt * bestellMenge) 
		{
			faesser++;		// Anzahl der F�sser um 1 erh�hen
		}
		// Alternative:
		faesser = (int)(Math.ceil((double)bestellMenge / fassInhalt));
		
		System.out.println("Es werden " + faesser + " F�sser ben�tigt.");
	}

}
