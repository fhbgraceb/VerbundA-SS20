package aufgabe03_Prog2018;

/*
 * Beispielgruppe 2 - Unterprogramme
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

	public static double horner(double a, double b, double c, double x)
	{
		double ergebnis = 0;
		
		ergebnis = (a * x + b) * x + c;
		
		return ergebnis;
	}
	
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
		
		polynom = horner(a, b, c, x);
		
		System.out.print("Wert des Polynoms ");		
		System.out.printf("%9.2f * x^2 + %9.2f * x + %9.2f", a, b, c);
		System.out.printf(" an der Stelle %9.2f : %9.2f\n", x, polynom);		
	}

}
