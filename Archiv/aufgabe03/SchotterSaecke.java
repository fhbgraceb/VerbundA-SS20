package aufgabe03;

/*
 * Beispielgruppe 2 - Unterprogramme
 * 
 * Schottersäcke: 
 * Sie sitzen an der LKW-Waage an der Ausfahrt eines Schotterwerkes.
 * In diesem wird Schotter in 50 kg Säcke verpackt und mit LKWs abtransportiert. 
 * Geben Sie das Leergewicht des LKWs und das Gewicht des beladenen LKWs ein
 * und berechnen Sie daraus wie viele Säcke er geladen hat.
 */

import java.util.Scanner;

public class SchotterSaecke 
{
	public static int anzahlSaecke(double leer, double voll)
	{
		final double sackGewicht = 50.0;	// Konstante: ist in der Angabe fix vorgegeben		
		int ergebnis = 0;
		
		ergebnis = (int)Math.round(((voll - leer) / sackGewicht));		// exaktes runden

		return ergebnis;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double leerGewicht;		
		double vollGewicht;
		int anzahl;
		
		// Einlesen des Gewichts des LKWs
		System.out.print("Wie viel wiegt der leere LKW? ");
		leerGewicht = s.nextDouble();
		System.out.print("Wie viel wiegt der volle LKW? ");
		vollGewicht = s.nextDouble();
		
		anzahl = anzahlSaecke(leerGewicht, vollGewicht);
		
		// Ausgabe
		System.out.println("Der LKW hat " + anzahl + " Säcke geladen.");
	}

}
