package BernalHausuebung1;

public class Casten {

	public static void main(String[] args) {


		// Die nachfolgende Kommazahl stellt den Rechnungsbetrag dar,
		// geben Sie diesen per Konsole aus. jedoch muss dieser vom Typ int sein
		// dennoch müssen die Nachkommastellen  ersichtlich sein, 2 Stellen genügen


		double kommazahl = 123.9564998455;
		int zahlenvorKomma = ( int ) kommazahl;
		double zweiStellen  = (kommazahl % 1) * 100;
		int zahlennachKomma = ( int )zweiStellen;
	
		System.out.println("Eine Kommazahl von Typ Integer =" + zahlenvorKomma + "." + zahlennachKomma);

	}

}
