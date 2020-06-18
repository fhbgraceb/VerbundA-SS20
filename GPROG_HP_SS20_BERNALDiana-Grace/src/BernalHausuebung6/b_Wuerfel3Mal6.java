package BernalHausuebung6;

import java.util.Scanner;

public class b_Wuerfel3Mal6 {

	/*
	 * ähnlich dem Beispiel WuerfelSpiel wird auch hier reihum gewürfelt. Sieger ist
	 * jedoch diesmal die Person, die als erstes zum dritten Mal einen 6er würfelt.
	 * Dies muss nicht in aufeinanderfolgenden Runden geschehen. Würfeln mehrere
	 * Personen in derselben Runde den dritten Sechser, gibt es mehrere SiegerInnen.
	 * Lesen Sie dabei aber Anzahl und die Namen der SpielerInnen ein.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int winner6 = 3;
		int players;
		String[] namen;
		int[] anzahl6;
		int wurf;
		boolean finished;

		do {
			System.out.print("Anzahl der Spieler: ");
			players = s.nextInt();
		} while (players <= 0);

		namen = new String[players];
		for (int i = 0; i < namen.length; i++) {
			System.out.print("Bitte den " + (i + 1) + ". Namen eingeben: ");
			namen[i] = s.next();
		}

		anzahl6 = new int[namen.length];

		finished = false;
		do {
			for (int i = 0; (i < namen.length) && (!finished); i++) {
				System.out.print("Jetzt würfelt: " + namen[i] + " \nEs ist die Zahl: ");
				wurf = wuerfeln();
				System.out.print(wurf + "\n");
				if (wurf == 6) {
					anzahl6[i]++;
					System.out.print("YAY! Das ist der " + anzahl6[i] + ". Sechser!");
					if (anzahl6[i] >= winner6) {
						System.out.println("\nSieger ist: " + namen[i]);
						finished = true;
					}
				}
				System.out.println();
			}
		} while (!finished);

		s.close();
	}

	public static int wuerfeln() {
		final int min = 1;
		final int max = 6;

		return (int) (Math.random() * (max - min + 1) + 1);
	}

}
