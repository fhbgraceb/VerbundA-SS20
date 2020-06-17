package aufgabe04;

import java.util.Scanner;

/*
 * Beispielgruppe 2 - Unterprogramme
 *
 * Rechteck:
 * Lesen Sie die L�nge und die Breite eines Rechtecks ein
 * und berechnen Sie daraus den Umfang des Rechtecks.
 */

public class Rechteck 
{

	public static double umfang(double laenge, double breite)
	{
		double umfang = 0;
		
		umfang = laenge * breite;
		
		return umfang;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		double laenge;
		double breite;
		double umfang;
		
		// Begr�ssung (Fleissaufgabe!)
		System.out.println(" *** Willkommen beim Programm RECHTECK ***");
		System.out.println(); 		// Leerzeile
		
		// Werte einlesen
		System.out.print("Bitte die L�nge eingeben: ");	// Mit print() wird nicht in die n�chste Zeile gegangen
		laenge = s.nextDouble();
		System.out.print("Bitte die Breite eingeben: ");
		breite = s.nextDouble();
		
		// Umfang berechnen
		umfang = umfang(laenge, breite);
		
		// Ergebnisse ausgeben
		System.out.println();
		System.out.println("Recheck mit den Ma�en " + laenge + " * " + breite);
		System.out.println("Umfang: " + umfang);
		
		// Verabschiedung (Fliessaufgabe!)
		System.out.println();
		System.out.println("Auf Wiedersehen!");
		System.out.println("Benutzen Sie dieses sch�ne Programm bald wieder!");
	}
}
