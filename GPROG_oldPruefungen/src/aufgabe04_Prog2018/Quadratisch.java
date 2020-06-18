package aufgabe04_Prog2018;

import java.util.Scanner;

/*
 * Beispielgruppe 3 - Bedingungen
 * 
 * Quadratisch: 
 * Schreiben Sie ein Programm zur L�sung der quadratischen Gleichung x2+px+q=0 
 * (Achtung: eventuelle komplexe L�sungen beachten)
 * Anmerkung: In der Klassenbibliothek math.h befindet sich die Funktion sqrt(), 
 * die zur Berechnung der Quadratwurzel dient. Der �bergebene Wert sollte nicht kleiner 
 * als 0 (Null) sein, sonst wird ein Fehler ausgel�st.
 * 
 * Wenn p^2 >= 4q gibt es reelle L�sungen:
 * 		x1/x2 = -(p / 2) +/- Wurzel((p / 2)^2 - q)
 * andernfalls gibt es "komlpexe" L�sungen:
 * 		x1/x2 = -(p / 2) +/- i * Wurzel(q - (p / 2)^2)
 */ 

public class Quadratisch 
{

	public static void main(String[] args) 
	{
		// TODO Aufgabe noch zu L�sen
		Scanner s = new Scanner(System.in);
		double p;
		double q;
		double bruch;
		double wurzel;
		double x1;
		double x2;
		
		System.out.println("*** Gleichungsl�ser ***");
		System.out.println("L�st quadratische Gleichungen x2+px+q=0");
		System.out.println("Bitte die Werte f�r p und q eingeben.");
		System.out.print("p: ");
		p = s.nextDouble();
		System.out.print("q: ");
		q = s.nextDouble();
		
		bruch = -(p / 2);
		if ((p * p) >= (4 * q))
		{
			wurzel = Math.sqrt(Math.pow(p / 2,  2) - q);
			if (wurzel == 0)
			{
				System.out.println("Doppell�sung bei: " + bruch);
			}
			else
			{
				x1 = bruch + wurzel;
				x2 = bruch - wurzel;
				System.out.println("Reele L�sungen bei: " + x1 + " und " + x2);
			}
		}
		else
		{
			wurzel = Math.sqrt(q - Math.pow(p / 2, 2));
			System.out.println("Komplexe L�sungen bei:");
			System.out.println(bruch + " + " + wurzel + "i");
			System.out.println("und");
			System.out.println(bruch + " - " + wurzel + "i");
		}
		
		s.close();
	}

}
