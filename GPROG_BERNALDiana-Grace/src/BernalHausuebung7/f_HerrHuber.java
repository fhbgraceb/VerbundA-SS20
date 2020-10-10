package BernalHausuebung7;

public class f_HerrHuber {
	/*
	 * Herr Huber las in den letzten 4 Jahren 43 Bücher. Das Produkt seiner in
	 * diesen 4 Jahren pro Jahr gelesenen Bücher beträgt 6720. Er ist stolz darauf,
	 * dass er seinen Bücherkonsum von Jahr zu Jahr gesteigert hat, und dass er im
	 * 4. Jahr 5 mal so viele Bücher las wie im ersten Jahr. Berechnen Sie die
	 * Anzahl der von Herrn Huber pro Jahr gelesenen Bücher.
	 * 
	 * Die Lösung erfolgt durch ausprobieren ("Brute Force") aller Möglichkeiten
	 * 
	 * Es lassen sich dabei viele Einschränkungen finden, darauf wird jedoch (bis
	 * auf eine) verzichtet.
	 */

	public static void main(String[] args) {
		for (int j1 = 1; j1 < 43; j1++) {
			for (int j2 = 1; j2 < 43; j2++) {
				for (int j3 = 1; j3 < 43; j3++) {
					for (int j4 = 0; j4 < 43; j4++) {
						if (j1 * j2 * j3 * j4 == 6720 && j1 + j2 + j3 + j4 == 43 && j1 * 5 == j4) {
							System.out.println(
									"Jahr 1:" + j1 + "\nJahr 2:" + j2 + "\nJahr 3:" + j3 + "\nJahr 4:" + j4 + "\n ");
						}
					}

				}

			}
		}

	}

}
