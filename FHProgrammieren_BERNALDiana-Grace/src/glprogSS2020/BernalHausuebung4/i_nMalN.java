package BernalHausuebung4;

import java.util.Scanner;

public class i_nMalN {
	/*
	 9. NMalN: Lesen Sie eine Zahl (n) ein und berechnen Sie mit einer Schleife:
		1 * n + 2 * n + 3 * n + ... + n * n
	 */

	public static void main(String[] args) {
		System.out.print("i_nMalN_____________________\n");
		
		//siehe Abgabe hausuebung2.aSchleifen
		
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("Bitte n eingeben: ");
		n = s.nextInt();
				
		System.out.println("Produkt n mal n betr�gt: " + nMalnCalc(n));
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
