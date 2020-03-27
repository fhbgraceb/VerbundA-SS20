package hausuebung4;

import java.util.Scanner;

public class j_nHochN {
	/*
	 10.NHochN: Lesen Sie eine Zahl (n) ein und berechnen Sie:
	
		n
		∑ ii
		i=1
	
		(also 11+22+33+...+nn oder 1 + 2 * 2 + 3 * 3 * 3 + ... + n * n * ... * n)
		ohne die Potenzfunktion zu benutzen.
	 */

	public static void main(String[] args) {
		//siehe Abgabe hausuebung2.aSchleifen
		
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("Bitte n eingeben: ");
		n = s.nextInt();
				
		System.out.println(nHochN(n));
		s.close();
	}

	public static int nHochN(int n) {
		int summe;
		int produkt;

		summe = 0;

		for (int d = 1; d <= n; d++){

			produkt = 1;
			for (int f = 1; f <= d; f++){
				produkt *= d;
			}
			summe += produkt;
		}
		
		return summe;
	}
}
