package BernalHausuebung2.bIFUnterprogramm;

import java.util.Scanner;

public class d_Taschenrechner1 {
	/*
	 Aufgabe:
	 4.Taschenrechner1: Schreiben Sie eine Methode, welche 2 Werte und einen Operator (+, -, *, /) 
	 übernimmt und das Ergebnis retourniert, anhand des Operators soll die Methode die gewünschte Berechnung ausführen 
	 und das korrekte Ergebnis retournieren, welches anschließend via Konsole ausgegeben wird.
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Erste Zahl eingeben: ");
		int a=s.nextInt();
		System.out.println("Zweite Zahl eingeben: ");
		int b=s.nextInt();
		System.out.println("Bitte Operator eingeben (+,-,*;/)");
		String operatorString=s.next();
		
		System.out.println("Das Ergebnis lautet " + rechnung(a, b, operatorString));
		s.close();
	}
	
	public static int rechnung(int q, int e, String operand) {
		int ergebnis=0;
		if (operand.equals("+")) {
			ergebnis=q+e;
		}else if (operand.equals("-")) {
			ergebnis=q-e;
		}else if (operand.equals("*")) {
			ergebnis=q*e;
		}else if (operand.equals("/")) {
			ergebnis=q/e;
		}
		return ergebnis;
	}

}
