<<<<<<< HEAD
package ifs_switch;

import java.util.Scanner;

public class IF_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl1, zahl2, ergebnis;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte die 1. Zahl eingeben!");
		zahl1 = s.nextInt();
		System.out.println("Bitte die 2. Zahl eingeben!");
		zahl2 = s.nextInt();
		
		if(zahl1 == zahl2)
			System.out.println("Die beiden Zahlen sind gleich");
		else {
			ergebnis = zahl1 + zahl2;
			System.out.println("Die Summe der beiden Zahlen ist " + ergebnis);
		}
	}
}
=======
package ifs_switch;

import java.util.Scanner;

public class IF_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl1, zahl2, ergebnis;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte die 1. Zahl eingeben!");
		zahl1 = s.nextInt();
		System.out.println("Bitte die 2. Zahl eingeben!");
		zahl2 = s.nextInt();
		
		if(zahl1 == zahl2)
			System.out.println("Die beiden Zahlen sind gleich");
		else {
			ergebnis = zahl1 + zahl2;
			System.out.println("Die Summe der beiden Zahlen ist " + ergebnis);
		}
	}
}
>>>>>>> master
