package BernalHausuebung8;

public class bspGruppe7a_h_ZufallsString2 {
	
//	ZufallsString2: Erzeugen Sie einen String, der aus 10 zufällig gewählten Kleinbuchstaben besteht, 
//	von denen keiner doppelt vorkommen darf.

	public static void main(String[] args) {
		String ausgabe;
		char buchstabe;
		String buchstabeAlsString;
		int textChar;

		ausgabe = "";

		do {
			textChar = (int) (Math.random() * ((int) 'z' - (int) 'a' + 1) + (int) 'a');
			buchstabe = (char) textChar;
			buchstabeAlsString = "" + buchstabe;
			if (!ausgabe.contains(buchstabeAlsString)) {
				ausgabe += buchstabe;
			}
		} while (ausgabe.length() < 10);

		System.out.println("ZufallsString lautet: " + ausgabe);

	}

}
