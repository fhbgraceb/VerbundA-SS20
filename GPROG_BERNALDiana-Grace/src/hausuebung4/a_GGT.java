package hausuebung4;

import java.util.Scanner;

public class a_GGT {
	/*
	 1. GGT: Lesen Sie zwei Zahlen ein und berechnen Sie den größten gemeinsamen Teiler (ggT) dieser Zahlen.
	 */

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.print("a_GGT_____________________\n");
			
			int z1;
			int z2;
			int ggT;
			
			System.out.print("1.Zahl eingeben: ");
			z1 = s.nextInt();
			System.out.print("2.Zahl eingeben: ");
			z2 = s.nextInt();
			
			ggT = ggTmeth(z1, z2);
			
			System.out.printf("größte gemeinsame Teiler von %d und %d ist %d\n", z1, z2, ggT);
			
			s.close();
	}

	public static int ggTmeth(int a, int b){
			int groessgemT;
			
			if (a <= b){
				groessgemT = a;
			}
			else{
				groessgemT = b;
			}
			while ((groessgemT >= 1) && ((a % groessgemT != 0) || (b % groessgemT != 0))){
				groessgemT--;
			}
			
			return groessgemT;
	}

}
