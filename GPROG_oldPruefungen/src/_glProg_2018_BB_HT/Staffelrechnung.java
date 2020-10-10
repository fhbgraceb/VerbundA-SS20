package _glProg_2018_BB_HT;

import java.util.Scanner;

public class Staffelrechnung {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int eingabe;
		int ergebnis;
		
		System.out.println(" *** Staffelrechnung ***");
		System.out.print("Bitte eine Zahl eingeben: ");
		eingabe = s.nextInt();
		
		ergebnis = eingabe;
		for (int i = 2; i <= 9; i++) {
			System.out.print(ergebnis + " * " + i + " = ");
			ergebnis *= i;
			System.out.println(ergebnis);
		}
		for (int i = 2; i <= 9; i++) {
			System.out.print(ergebnis + " / " + i + " = ");
			ergebnis /= i;
			System.out.println(ergebnis);
		}
		
		if (ergebnis == eingabe) {
			System.out.println("Die Staffelrechnung wurde korrekt durchgeführt.");
		} else {
			System.out.println("Bei der Staffelrechnung ist ein Fehler passiert.");
		}
		
		s.close();
	}

}
