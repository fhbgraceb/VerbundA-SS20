package bernalPractice;

public class htvz_A5Reihenbrueche {

	public static void main(String[] args) {
		boolean addieren = false;
		double summiert = 0;
		double glied = 0;

		for (double i = 1; i <= 12345; i++) {
			glied = (i + 2) / i;
			if (addieren) {
				summiert += glied;
//				System.out.printf("plus (%f+2)/%f", i, i);
//				System.out.println();
			} else {
				summiert -= glied;
//				System.out.printf("minus (%f+2)/%f", i, i);
//				System.out.println();
			}

			if (i % 3 == 0) {
				addieren = !addieren;
			}
		}
		System.out.println(summiert);
	}
}
