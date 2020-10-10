package Hausuebung7;

public class herrHuber {

	public static void main(String[] args) {
		for (int jahr1 = 1; jahr1 < 43; jahr1++) {
			for (int jahr2 = 1; jahr2 < 43; jahr2++) {
				for (int jahr3 = 1; jahr3 < 43; jahr3++) {
					for (int jahr4 = 0; jahr4 < 43; jahr4++) {
						if (jahr1 * jahr2 * jahr3 * jahr4 == 6720 && jahr1 + jahr2 + jahr3 + jahr4 == 43 && jahr1 * 5 == jahr4) {
							System.out.println("Jahr 1:" + jahr1);
							System.out.println("Jahr 2:" + jahr2);
							System.out.println("Jahr 3:" + jahr3);
							System.out.println("Jahr 4:" + jahr4);
						}
					}

				}

			}
		}

	}

}
