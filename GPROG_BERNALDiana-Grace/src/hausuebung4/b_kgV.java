package hausuebung4;

import java.util.Scanner;

public class b_kgV {
	/*
	 2. kgV: Lesen Sie zwei Zahlen ein und berechnen Sie das kleinste gemeinsame Vielfache (kgV) dieser Zahlen.
	 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("b_kgV_____________________\n");
		
		int z1;
		int z2;
		int kgV;
		
		System.out.print("1.Zahl eingeben: ");
		z1 = s.nextInt();
		System.out.print("2.Zahl eingeben: ");
		z2 = s.nextInt();
		
		kgV = kgVmeth(z1, z2);
		
		System.out.printf("kleinste gemeinsame Vielfache von %d und %d ist %d\n", z1, z2, kgV);
		
		s.close();
	}

	public static int kgVmeth(int zahl1, int zahl2){
		int kleingemVielf;

		kleingemVielf = zahl1 * zahl2 / a_GGT.ggTmeth(zahl1, zahl2);
		
		return kleingemVielf;
	}
}
