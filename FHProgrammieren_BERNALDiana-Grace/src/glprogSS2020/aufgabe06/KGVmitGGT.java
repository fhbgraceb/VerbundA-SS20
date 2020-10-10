package aufgabe06;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * 13.	kgV: 
 * 
 * Lesen Sie zwei Zahlen ein und berechnen Sie das 
 * kleinste gemeinsame Vielfache (kgV) dieser Zahlen.
 * 
 * Beispiele:
 * Das kgV von 15 und 25 ist 75 
 * 		(75 mod 15 = 0, 75 mod 25 = 0, keine kleinere Zahl als 75 hat diese Eigenschaft) 
 * Das kgV von 8 und 12 ist 24
 * 		(24 mod 8 = 0, 24 mod 12 = 0, keine kleinere Zahl als 24 hat diese Eigenschaft)
 * 
 * Lösung:
 * 
 * Das kgV lässt sich auch mit Hilfe des ggT (größten gemeinsamen Teilers) berechnen:
 * 
 * 		kgV(zahl1, zahl2) = zahl1 * zahl2 / ggT(zahl1, zahl2)
 * 
 * Nachdem das ggT in einem anderen Beispiel berechnet wurde wird hier auch 
 * eine Variante des lgV präsentiert. 
 */
public class KGVmitGGT 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl1;
		int zahl2;
		int kgV;
		
		System.out.println(" *** kgV (mit ggT) ***");
		System.out.print("Bitte geben Sie die erste Zahl ein: ");
		zahl1 = s.nextInt();
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		zahl2 = s.nextInt();
		
		kgV = kgV(zahl1, zahl2);
		
		System.out.printf("Das kleinste gemeinsame Vielfache von %d ud %d ist: %d\n", zahl1, zahl2, kgV);
		s.close();
	}

	public static int kgV(int zahl1, int zahl2)
	{
		int kgV;
		
		/*
		 * Durch 
		 * 		GGT.ggt() 
		 * "borgt" man sich das Unterprogramm ggT() aus dem Programm GGT aus.
		 * Dazu muss GGT aber im selben Package liegen.
		 * Man darf beim Exportieren von KGV auch nicht darauf vergessen 
		 * GGT mit zu exportieren. 
		 * 
		 * [Mittels import könnte man auch Unterprogramme aus anderen Packages verwenden.]
		 */
		kgV = zahl1 * zahl2 / GGT.ggT(zahl1, zahl2);
		
		return kgV;
	}
}
