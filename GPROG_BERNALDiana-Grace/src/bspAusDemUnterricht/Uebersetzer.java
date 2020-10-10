package bspAusDemUnterricht;

public class Uebersetzer {

	public static void main(String[] args) {

		String wort = "deutSCH";

		switch (wort.toUpperCase()) {

		case "DEUTSCH":
			System.out.println("Guten Tag");
			break;
		case "ENGL":
			System.out.println("Hello");
			break;
		case "IT":
			System.out.println("Buon ...");
			break;
		default:
			System.out.println("Sprache nicht bekannt");

		}

		// Weitere Stringkunde

		String klein = "kleingeschrieben";

		klein.toUpperCase();
		System.out.println(klein);

		// vs.

		String groﬂ = klein.toUpperCase();

		System.out.println(groﬂ);

	}

}
