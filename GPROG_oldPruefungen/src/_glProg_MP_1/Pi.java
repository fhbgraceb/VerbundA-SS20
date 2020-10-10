package _glProg_MP_1;

public class Pi {

	public static void main(String[] args) {
		int anzahlGlieder = 125000;
		double reihe = 0;
		double glied;
		double pi;

		for (double i = 1; i <= anzahlGlieder; i++) {
			glied = 1 / ((2 * i) * (2 * i + 1) * (2 * i + 2));
			if (i % 2 == 1) {
				reihe += glied;
			} else {
				reihe -= glied;
			}
		}

		pi = reihe * 4 + 3;

		System.out.println("PI: " + pi);
	}

}
