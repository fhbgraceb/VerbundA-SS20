package BernalHausuebung2.bIFUnterprogramm;

import java.util.Scanner;

public class e_Taschenrechner2 {
	/*
	 Aufgabe:
	 5.Taschenrechner2: Adaption von Taschenrechner I, beim Programmstart wird Ihnen ein Men� angezeigt.
	1.) Addieren
	2.) Multiplizieren usw.
	danach �bergeben Sie die bestimmte Nummer z.B.: �1� 
	und werden anschlie�end um zwei Zahlen gebeten, das Ergebnis wird anschlie�end ausgegeben
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Bitte ausw�hlen \n 1.) Addieren \n 2.) Subtrahieren \n 3.) Multiplizieren \n 4.) Dividieren");
		int operand=s.nextInt();
		
		if (operand==1) {
			System.out.println("Erste Zahl eingeben: ");
			int a=s.nextInt();
			System.out.println("Zweite Zahl eingeben: ");
			int b=s.nextInt();
			
			System.out.println("Das Ergebnis lautet " + addieren(a, b));
		}else if (operand==2) {
			System.out.println("Erste Zahl eingeben: ");
			int a=s.nextInt();
			System.out.println("Zweite Zahl eingeben: ");
			int b=s.nextInt();
			
			System.out.println("Das Ergebnis lautet " + subtrahieren(a, b));
		}else if (operand==3) {
			System.out.println("Erste Zahl eingeben: ");
			int a=s.nextInt();
			System.out.println("Zweite Zahl eingeben: ");
			int b=s.nextInt();
			
			System.out.println("Das Ergebnis lautet " + multiplizieren(a, b));
		}else if (operand==4) {
			System.out.println("Erste Zahl eingeben: ");
			int a=s.nextInt();
			System.out.println("Zweite Zahl eingeben: ");
			int b=s.nextInt();
			
			System.out.println("Das Ergebnis lautet " + dividieren(a, b));
		}else {
			System.out.println("Error...");
		}
		s.close();
	}
	
	public static int addieren(int q, int e) {
		int ergebnis=0;
		ergebnis=q+e;
		return ergebnis;
	}
	
	public static int subtrahieren(int q, int e) {
		int ergebnis=0;
		ergebnis=q-e;
		return ergebnis;
	}
	
	public static int multiplizieren(int q, int e) {
		int ergebnis=0;
		ergebnis=q*e;
		return ergebnis;
	}
	
	public static int dividieren(int q, int e) {
		int ergebnis=0;
		ergebnis=q/e;
		return ergebnis;
	}

}
