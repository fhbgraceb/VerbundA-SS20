package bspAusDemUnterricht;

public class Anrede {

	public static void main(String[] args) {

	
		String nachname = "Muster";
		String geschlecht = "male";
		
		// bessere Variante mit equalsIgnoreCase bzw. 
		// toUpper/LowerCase mit dem entsprechend angepassten Vergleichswert
		// aufgrund der "Trefferwahrscheinlichkeit"
		
		if (geschlecht.equals("male")) {

			System.out.println("Sehr geehrter Herr " + nachname);

		} else if (geschlecht.equals("female")) {

			System.out.println("Sehr geehrte Frau " + nachname);
		}

		else if (geschlecht.equals("fam")) {
			System.out.println("Sehr geehrte Familie " + nachname);

		} else {
			System.out.println("Anrede unbekannt");
		}

	}

}
