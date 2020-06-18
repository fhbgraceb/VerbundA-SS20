package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7b_Hex2Dezi {

	public static long hex2Dez(String hexeingabe) {
		long dezNumber = 0;
		int dezWert;
		char hexNumber;

		for (int i = 0; i < hexeingabe.length(); i++) {
			hexNumber = hexeingabe.charAt(i);
			if (Character.isDigit(hexNumber)) {
				dezWert = (int) hexNumber - (int) '0';
			} else {
				dezWert = (int) hexNumber - (int) 'A' + 10;
			}
			dezNumber = dezNumber * 16 + dezWert;
		}

		return dezNumber;
	}

	public static void main(String[] args) {
		String eingabe = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie die Hexadezimalzahl zum umwandeln ein: ");
		eingabe = s.next();
		System.out.println(hex2Dez(eingabe));

		s.close();
	}

}
