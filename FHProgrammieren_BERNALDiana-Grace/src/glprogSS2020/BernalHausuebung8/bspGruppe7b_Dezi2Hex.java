package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7b_Dezi2Hex {

	public static String dezi2Hex(long dezZahl) {
		String hexNumber = "";
		long restNumber = dezZahl;
		char zahl;
		long rest;

		while (restNumber > 0) {
			rest = restNumber % 16;
			if (rest <= 9) {
				hexNumber = rest + hexNumber;
			} else {
				zahl = (char) ((int) 'A' + (rest - 10));
				hexNumber = zahl + hexNumber;
			}
			restNumber = (restNumber - rest) / 16;
		}
		return hexNumber;
	}

	public static void main(String[] args) {
		long dezZahl;
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie die Dezimalzahl zum umwandeln ein: ");
		dezZahl = s.nextLong();
		System.out.println(dezi2Hex(dezZahl));

		s.close();
	}

}
