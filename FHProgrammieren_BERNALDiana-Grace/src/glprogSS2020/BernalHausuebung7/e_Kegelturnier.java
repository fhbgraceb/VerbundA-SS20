package BernalHausuebung7;

public class e_Kegelturnier {
	/*
	 * Bei einem Kegelturnier nehmen 47 Sportler teil, welche die Startnummern 101
	 * bis 147 erhalten. Jeder der Teilnehmer hat 13 Würfe auf die vollen Kegel,
	 * kann also jeweils 0 bis 9 Punkte erreichen. Simulieren Sie die Würfe mit
	 * Zufallszahlen und speichern Sie die Werte in einem Array. Berechnen Sie
	 * danach für jeden Teilnehmer die Punktesumme und geben Sie die Startnummer des
	 * Turniersiegers (mit den meisten Punkten) aus.
	 */

	public static void main(String[] args) {
		int wuerfe = 13;
		int[][] spielerWuerfe = new int[47][wuerfe];
		int[] zeilenSummen = new int[wuerfe];
		for (int i = 0; i < wuerfe; i++) {
			for (int j = 0; j < wuerfe; j++) {
				spielerWuerfe[i][j] = Random(0, 9);
				zeilenSummen[i] = zeilenSummen[i] + spielerWuerfe[i][j];
			}
		}
		int max = 0;
		int spieler = 0;
		for (int maxCheck = 0; maxCheck < wuerfe; maxCheck++) {
			if (zeilenSummen[maxCheck] > max) {
				max = zeilenSummen[maxCheck];
				spieler = maxCheck + 101;
			}
		}
		System.out.println("Spieler mit der Startnummer " + spieler + " hat gewonnen mit " + max + " Punkten!");
	}

	private static int Random(int untere, int obere) {
		int range = (obere - untere) + 1;
		return (int) (Math.random() * range) + untere;
	}

}
