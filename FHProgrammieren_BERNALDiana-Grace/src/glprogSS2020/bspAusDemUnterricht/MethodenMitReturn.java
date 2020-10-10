package bspAusDemUnterricht;

import javax.security.auth.login.FailedLoginException;

public class MethodenMitReturn {

	public static void main(String[] args) {

		addieren(20, 20);

		addieren();

		addieren(13);

		int erg = rechteckberechnen(20, 10);
		System.out.println(erg);

		System.out.println(rechteckberechnen(234, 234) + rechteckberechnen(234, 2));

		String user = "Mide";
		String pwd = "de";

		boolean wahr = ueberpruefen(user, pwd);

		System.out.println("Korrekt: " + wahr);

	}

	private static boolean ueberpruefen(String user, String pwd) {

		if (user.equalsIgnoreCase("mide") && (pwd.equalsIgnoreCase("de"))) {
			return true;
		}

		return false;

	}

	private static int rechteckberechnen(int seiteA, int seiteB) {

		int flaeche = seiteA * seiteB;
		return flaeche;
	
		// auch möglich wäre: 
		// return = seiteA * seiteB;

	}
	
	// Exkurs: Methoden überladen, gleiche Methode(nnamen), jedoch unterschiedliche Parameter/Inhalte

	private static void addieren(int i, int j) {

		System.out.println(i + j);

	}

	private static void addieren(int i) {

		System.out.println(i * 2);

	}

	private static void addieren() {

		System.out.println("Es wurde nichts übergeben");

	}

}
