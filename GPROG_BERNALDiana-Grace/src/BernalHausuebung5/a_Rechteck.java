package BernalHausuebung5;

import java.util.Scanner;

public class a_Rechteck {
	
	/*
	 1. Rechteck: Lesen Sie die L�nge und die Breite eines Rechtecks ein und
	berechnen Sie daraus den Umfang des Rechtecks. [4]
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a;
		double b;
		double umfang;
		
		System.out.print("l�nge f�r a eingeben: ");
		a = s.nextDouble();
		System.out.print("breite f�r b eingeben: ");
		b = s.nextDouble();
		
		umfang = berechnungUmfang(a, b);
		
		System.out.println("Umfang betr�gt " + umfang);
		
		s.close();
	}
	
	public static double berechnungUmfang(double f, double k){
	double ergebnis;
	ergebnis = 2 * f + 2 * k;
	return ergebnis;
	}

}
