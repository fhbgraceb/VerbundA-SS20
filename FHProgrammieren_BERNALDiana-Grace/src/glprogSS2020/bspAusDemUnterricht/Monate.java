package bspAusDemUnterricht;

public class Monate {

	public static void main(String[] args) {

		int monat = 2;

		String monatAusgeschrieben = "";

		switch (monat) {

		case 1:
			monatAusgeschrieben = "Jänner";
			break;
		case 2:
			monatAusgeschrieben = "Februar";
			break;
		case 3:
			monatAusgeschrieben = "März";
			break;
		case 4:
			monatAusgeschrieben = "April";
			break;
		default:
			System.out.println("Zahl ist nicht bekannt");
		}

		System.out.println("Es wurde: " + monat + " eingegeben, dies entspricht dem Monat " + monatAusgeschrieben);

	}

}
