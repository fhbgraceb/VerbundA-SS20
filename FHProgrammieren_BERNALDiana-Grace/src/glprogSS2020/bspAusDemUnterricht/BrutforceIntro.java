package bspAusDemUnterricht;

public class BrutforceIntro {

	public static void main(String[] args) {

		int anzahlAepfel = 10;

		for (int i = 1; i <= anzahlAepfel; i++) {
			for (int j = 1; j <= anzahlAepfel; j++) {
				for (int j2 = 0; j2 <= anzahlAepfel; j2++) {

					if (i + j + j2 == anzahlAepfel) //Mindestmaß, andere Bedingungen schränken die Varianten  zusätzlich ein
						System.out.println(i + " " + j + " " + j2);

				}
			}
		}

	}

}
