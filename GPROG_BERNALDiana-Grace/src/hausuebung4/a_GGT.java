package hausuebung4;

import java.util.Scanner;

public class a_GGT {
	/*
	 1. GGT: Lesen Sie zwei Zahlen ein und berechnen Sie den größten gemeinsamen Teiler (ggT) dieser Zahlen.
	 */

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int zahl1;
			int zahl2;
			int ggT;
			
			System.out.print("erste Zahl eingeben: ");
			zahl1 = s.nextInt();
			System.out.print("zweite Zahl eingeben: ");
			zahl2 = s.nextInt();
			
			ggT = ggTmeth(zahl1, zahl2);
			
			System.out.printf("größte gemeinsame Teiler von %d und %d ist %d\n", zahl1, zahl2, ggT);
			
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
