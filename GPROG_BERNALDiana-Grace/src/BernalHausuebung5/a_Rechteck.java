package BernalHausuebung5;

import java.util.Scanner;

public class a_Rechteck {
	
	/*
	 1. Rechteck: Lesen Sie die Länge und die Breite eines Rechtecks ein und
	berechnen Sie daraus den Umfang des Rechtecks. [4]
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a;
		double b;
		double umfang;
		
		System.out.print("länge für a eingeben: ");
		a = s.nextDouble();
		System.out.print("breite für b eingeben: ");
		b = s.nextDouble();
		
		umfang = berechnungUmfang(a, b);
		
		System.out.println("Umfang beträgt " + umfang);
		
		s.close();
	}
	
	public static double berechnungUmfang(double f, double k){
	double ergebnis;
	ergebnis = 2 * f + 2 * k;
	return ergebnis;
	}

}
