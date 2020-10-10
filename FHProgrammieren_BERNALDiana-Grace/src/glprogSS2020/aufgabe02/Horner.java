package aufgabe02;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Horner:
 * Berechnen Sie ax2+bx+c mit Hilfe des Horner-Schemas
 * für beliebige Eingaben von a, b, c und x. Polynom
 * 
 * Horner-Schema:
 * 
 * a * x^2 + b * x + c = ((a * x) + b) * x + c
 * 
 */

import java.util.Scanner;

public class Horner 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		double x;
		double a, b, c;
		double polynom;
		
		System.out.println("Polynom: a * x^2 + b * x + c");
		System.out.println("Bitte den Koeffizienten a des Polynoms eingeben.");
		
		System.out.print("a: ");
		a = s.nextDouble();
		System.out.print("b: ");
		b = s.nextDouble();
		System.out.print("c: ");
		c = s.nextDouble();

		System.out.print("Bitte den Wert von x eingeben: ");
		x = s.nextDouble();
		
		polynom = ((a * x) + b) * x + c;
		
		System.out.print("Wert des Polynoms ");		
		System.out.print(a + " * x^2 + " + b + " * x + " + c);
		System.out.println(" an der Stelle " + x + " : " + polynom);		
        
        s.close();
	}

}
