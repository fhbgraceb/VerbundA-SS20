package hausuebung4;

import java.util.Scanner;

public class b_kgV {
	/*
	 2. kgV: Lesen Sie zwei Zahlen ein und berechnen Sie das kleinste gemeinsame Vielfache (kgV) dieser Zahlen.
	 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zahl1;
		int zahl2;
		int kgV;
		
		System.out.print("erste Zahl eingeben: ");
		zahl1 = s.nextInt();
		System.out.print("zweite Zahl eingeben: ");
		zahl2 = s.nextInt();
		
		kgV = kgVmeth(zahl1, zahl2);
		
		System.out.printf("kleinste gemeinsame Vielfache von %d und %d ist %d\n", zahl1, zahl2, kgV);
		
		s.close();
	}

	public static int kgVmeth(int zahl1, int zahl2){
		int kleingemVielf;

		kleingemVielf = zahl1 * zahl2 / a_GGT.ggTmeth(zahl1, zahl2);
		
		return kleingemVielf;
	}
}
