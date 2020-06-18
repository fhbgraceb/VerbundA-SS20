package BernalHausuebung5;

import java.util.Scanner;

public class g_Horner {
	
	/*
	 7. Horner: Berechnen Sie ax2+bx+c mit Hilfe des Horner-Schemas für beliebige
	Eingaben von a, b, c und x. [4] 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double x;
		double a, b, c;
		double poly;
		
		System.out.println("Polynomfunktion 2. Grades: a * x^2 + b * x + c");
		System.out.println("Bitte den Koeffizienten des jeweiligen Polynoms eingeben.");
		
		System.out.print("a? ");
		a = s.nextDouble();
		System.out.print("b? ");
		b = s.nextDouble();
		System.out.print("c? ");
		c = s.nextDouble();

		System.out.print("x-Wert eingeben: ");
		x = s.nextDouble();
		
		poly = hornerSchema(a, b, c, x);
		
		System.out.printf("Wert des Polynoms\n%9.2f * x^2 + %9.2f * x + %9.2f", a, b, c);
		System.out.printf(" an der Stelle %9.2f = %9.2f\n", x, poly);

	}
	
	public static double hornerSchema(double a, double b, double c, double x){
		double ergebnis = 0;
		ergebnis = (a * x + b) * x + c;
		return ergebnis;
	}

}
