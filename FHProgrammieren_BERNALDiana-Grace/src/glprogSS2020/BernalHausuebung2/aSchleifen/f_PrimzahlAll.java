package BernalHausuebung2.aSchleifen;

import java.util.Scanner;

public class f_PrimzahlAll {
	/*
	Aufgabe:
	6.AllePrimzahlen: Lesen Sie eine Zahl ein 
	und geben Sie alle Primzahlen aus, 
	die kleiner als diese Zahl sind.
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zahl;
		
		System.out.print("Zahl eingeben: ");
		zahl = s.nextInt();
		
		System.out.println("Primzahlen bis " + zahl + ":");
		for (int n = 2; n < zahl; n++){
			if (istPrimzahl(n)){
				System.out.print(n + "\t");
			}
		}
		s.close();
	}
	
	public static boolean istPrimzahl(int n){
		boolean istPrimzahl = true;
		
		for (int i = 2;  i < n; i++){
			if (n % i == 0){
				istPrimzahl = false;
			}	
		}
		
		return istPrimzahl;
	}

}
