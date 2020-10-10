package BernalHausuebung6;

public class a_WuerfelDie6 {

	/*
	 * Bei diesem Spiel wird reihum gew�rfelt. Wer einen 6er w�rfelt, hat das Spiel
	 * gewonnen. Wird dabei von niemandem ein 6er gew�rfelt, so wird eine neue
	 * W�rfelrunde begonnen. Dies wird so lange wiederholt, bis es endlich einen
	 * Sieger gibt. W�rfeln innerhalb einer W�rfelrunde mehrere Personen einen 6er,
	 * so haben diese alle gewonnen. Die Namen der beteiligten Personen sollen fix
	 * in einem Array gespeichert sein (Sie m�ssen diese nicht einlesen).
	 */

	public static void main(String[] args) {
		String[] namen = new String[] { "Viky", "Aryuna", "Moritz", "Betti", "Hajer", "Grace" };
		boolean winner;
		int gewuerfelt;

		winner = false;
		System.out.println("Gewonnen hat:");
		while (!winner) {
			for (int i = 0; i < namen.length; i++) {
				gewuerfelt = wuerfeln();
				if (gewuerfelt == 6) {
					System.out.println(namen[i]);
					winner = true;
				}
			}
		}
	}

	public static int wuerfeln() {
		final int min = 1;
		final int max = 6;

		return (int) (Math.random() * (max - min + 1) + min);
	}

}
