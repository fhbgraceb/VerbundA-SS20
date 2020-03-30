package BernalHausuebung5;

import java.util.Scanner;

public class b_Flaschen {
	
	/*
	 2. Flaschen: Sie haben eine bestimmte Anzahl gleich großer Flaschen. Lesen Sie
	das Fassungsvermögen einer Flasche und ihre Anzahl ein. Berechnen Sie das
	gesamte Fassungsvermögen aller Flaschen zusammen. [4] 
	 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int flaschen;
		double fassung;	
		double gesamt;
		
		System.out.print("Anzahl der Flaschen eingeben: ");
		flaschen = s.nextInt();
		System.out.print("Fassungsvermögen einer Flasche eingeben: ");
		fassung = s.nextDouble();
		
		gesamt = berechnungFlaschen(flaschen, fassung);
		
		System.out.println(flaschen + " Flaschen " + fassung +  " Liter, sind zusammen " + gesamt + " Liter.");
		
		s.close();
	}
	
	public static double berechnungFlaschen(int z1, double z2){
		double ergebnis = 0;
	
		ergebnis = z1 * z2;
		
		return ergebnis;
	}
}
