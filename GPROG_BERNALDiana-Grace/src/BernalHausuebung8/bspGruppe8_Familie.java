package BernalHausuebung8;

public class bspGruppe8_Familie {
	/*
	 * Familie: Eine Familie besteht aus Vater, Mutter und Tochter. 
	 * Vater und Mutter sind zusammen 58 Jahre alt, Mutter und Tochter 36 Jahre. 
	 * Alle zusammen z�hlen 66 Jahre.
	 * */

	public static void main(String[] args) {
		for (int vater = 0; vater < 150; vater++) {
			for (int mutter = 0; mutter < 150; mutter++) {
				for (int tochter = 0; tochter < 150; tochter++) {
					if (vater+mutter==58 && mutter+tochter==36 && vater+mutter+tochter==66) {
						System.out.printf("Vater ist %d, Mutter ist %d und die Tochter %d Jahre alt.", vater, mutter, tochter);
					}
				}
			}
		}
	}

}
