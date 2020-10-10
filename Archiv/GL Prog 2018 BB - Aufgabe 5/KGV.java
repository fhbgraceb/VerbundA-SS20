package aufgabe05;

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
 * Es werden so lange Vielfache einer der beiden Zahlen gebildet,
 * so lange das Vielfache kein Vielfaches der anderen Zahl ist,
 * d.h. so lange das Vielfache Modulo der anderen Zahl ungleich 0 ist;
 * Dabei ist es egal welche der beiden Zahlen man dazu verwendet,
 * es ist aber rascher, wenn man dazu die größere Zahl nimmt.
 */
public class KGV 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl1;
		int zahl2;
		int kgV;
		
		System.out.println(" *** kgV ***");
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
		int vielfaches = 0;
		int kleinere;
		int groessere;
		
		if (zahl1 < zahl2)
		{
			kleinere = zahl1;
			groessere = zahl2;
		}
		else	// Sind beide Zahlen gleich groß, ist es egal welche die "kleinere" ist
		{
			kleinere = zahl2;
			groessere = zahl1;
		}
		vielfaches = groessere;
		
		/*
		 * Beim Bilden der Vielfache ist es besser, wenn man zum Vielfachen immer die
		 * Zahl selbst dazu zählt, als jedes Mal neu zu mutilplizieren.
		 */
		while (vielfaches % kleinere != 0)	// Ist vielfaches auch ein Vielfaches von kleinere?	
		{
			vielfaches += groessere;
		}
		
		return vielfaches;
	}
}
