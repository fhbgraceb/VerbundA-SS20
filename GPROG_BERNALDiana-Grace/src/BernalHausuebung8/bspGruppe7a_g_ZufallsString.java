package BernalHausuebung8;

public class bspGruppe7a_g_ZufallsString {
	
//	ZufallsString: Erzeugen Sie einen String, der aus 8 zufällig gewählten Großbuchstaben besteht.

	public static void main(String[] args) {
		String ausgabe;
		char buchstabe;
		int textbuchst;

		ausgabe = "";
		for (int i = 1; i <= 8; i++) {
			textbuchst = (int) (Math.random() * ((int) 'Z' - (int) 'A' + 1) + (int) 'A');
			buchstabe = (char) textbuchst;
			ausgabe += buchstabe;
		}
		System.out.println("Zufalls String lautet: " + ausgabe);
	}

}
