package aufgabe02;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * Beispiel Polynom
 * 
 * Lesen Sie einen Wert x, 
 * sowie die Koeffizienten eines Polynoms vierten Grades ein
 * und berechnen Sie den Wert des Polynoms an der Stelle x.
 * Verwenden Sie dazu maximal 3 Variable und keine Kontrollstrukturen.
 * 
 * p = a * x^4 + b * x^3 + c * x^2 + d * x + e
 * 
 * Lösung mittels Horner-Schema:
 * 
 *  a * x^4 + b * x^3 + c * x^2 + d * x + e =
 *  ((( a * x + b) * x + c) * x + d) * x + e
 */

import java.util.Scanner;

public class Polynom 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		double x;
		double koeff;
		double polynom;
		
		polynom = 0;
		
		System.out.print("Bitte den Wert von x eingeben: ");
		x = s.nextDouble();
		
		System.out.println("Bitte die Koeffizienten des Polynoms eingeben.");
		System.out.println("a * x^4 + b * x^3 + c * x^2 + d * x + e");
		
		System.out.print("a: ");
		koeff = s.nextDouble();
		polynom = koeff;				// p = a
		System.out.print("b: ");
		koeff = s.nextDouble();
		polynom = polynom * x + koeff;		// p = a * x + b
		System.out.print("c: ");
		koeff = s.nextDouble();
		polynom = polynom * x + koeff;		// p = (a * x + b) * x + c
		System.out.print("d: ");
		koeff = s.nextDouble();
		polynom = polynom * x + koeff;		// p = ((a * x + b) * x + c) * x + d
		System.out.print("e: ");
		koeff = s.nextDouble();
		polynom = polynom * x + koeff;		// p = (((a * x + b) * x + c) * x + d) * x + e

		System.out.println("Wert des Polynoms: " + polynom);
        
        s.close();		
	}

}
