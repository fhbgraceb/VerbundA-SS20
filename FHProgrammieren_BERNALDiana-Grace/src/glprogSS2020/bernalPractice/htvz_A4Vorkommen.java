package bernalPractice;

public class htvz_A4Vorkommen {
	public static void main(String[] args) {
		String stringa = "";
		String stringb = "";
		int anzahl;

		for (int i = 1; i <= 555; i++) {
			stringa += (char) (int) (Math.random() * ((int) 'Z' - (int) 'A' + 1) + (int) 'A');
		}
		for (int i = 1; i <= 11; i++) {
			stringb += (char) (int) (Math.random() * ((int) 'Z' - (int) 'A' + 1) + (int) 'A');
		}

		anzahl = vorkommen(stringa, stringb);

		System.out.println(anzahl);
	}

	public static int vorkommen(String bibliothekString, String filterString) {
		int anzahl = 0;

		for (int i = 0; i < filterString.length(); i++) {
			for (int j = 0; j < bibliothekString.length(); j++) {
				if (bibliothekString.charAt(j) == filterString.charAt(i)) {
					anzahl++;
				}
			}
		}

		return anzahl;
	}
}
