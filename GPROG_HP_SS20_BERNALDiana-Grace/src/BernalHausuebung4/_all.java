package BernalHausuebung4;

import java.util.Scanner;

public class _all {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String run="ja";
		
		System.out.println("Welche Hausuebung wollen Sie ausprobieren? [a, b, c, d, e, f, g, h, i, j, quit]");
		String input=s.next();
		if (input.equalsIgnoreCase("quit")) {
			System.out.println("Programm geschlossen-------------------------");
		}else{
				char menue = input.charAt(0);
				switch (menue) {
				case 'a': {
					a_GGT.main(args);
					break;
				}
				case 'b': {
					b_kgV.main(args);
					break;
				}
				case 'c': {
					c_akummuliert.main(args);
					break;
				}
				case 'd': {
					d_schnecke.main(args);
					break;
				}
				case 'e': {
					e_alternierendeReihe.main(args);
					break;
				}
				case 'f': {
					f_groesser10.main(args);
					break;
				}
				case 'g': {
					g_laengsteFolge.main(args);
					break;
				}
				case 'h': {
					h_Intervall2.main(args);
					break;
				}
				case 'i': {
					i_nMalN.main(args);
					break;
				}
				case 'j': {
					j_nHochN.main(args);
					break;
				}
				default:
					System.out.println("Ungültige Eingabe...");
				}

		}
		s.close();
	}

}
