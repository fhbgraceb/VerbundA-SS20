package BernalHausuebung2.aSchleifen;

import java.util.Scanner;

public class a_Fakultaetlight {
	/*
	Aufgabe:
	1. Fakult�t light: Berechnen Sie die Fakultät von n mit Hilfe einer Schleife.
	*/
	public static void main(String[] args) {
		Scanner numberin = new Scanner(System.in);
		int number;
			
		System.out.print("Bitte n! eingeben: ");
		number = numberin.nextInt();
					
		System.out.println("Ergbenis von " + number + "! ist " + fakultaet(number));
			
		numberin.close();	
	}

	public static int fakultaet(int n){
		int ergebnis = 1;
			
		for (int i = 1; i <= n; i++){
				ergebnis *= i;
		}
			
		return ergebnis;
	}

}
