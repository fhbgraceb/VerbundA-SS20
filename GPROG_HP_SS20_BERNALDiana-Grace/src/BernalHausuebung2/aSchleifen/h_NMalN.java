package BernalHausuebung2.aSchleifen;

import java.util.Scanner;

public class h_NMalN {
	/*
	Aufgabe:
	8.NMalN: Lesen Sie eine Zahl (n) ein 
	und berechnen Sie mit einer Schleife:
	1 * n + 2 * n + 3 * n + ... + n * n
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("Bitte n eingeben: ");
		n = s.nextInt();
				
		System.out.println("Produkt n mal n beträgt: " + nMalnCalc(n));
		s.close();
	}
	
	public static int nMalnCalc(int n){
		int summe = 0;
		
		for (int i = 1; i <= n; i++){
			summe += i * n;
		}
		
		return summe;
	}
}
