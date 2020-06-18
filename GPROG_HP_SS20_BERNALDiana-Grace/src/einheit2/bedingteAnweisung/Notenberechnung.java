package einheit2.bedingteAnweisung;

public class Notenberechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int pruefungspunkte = 55;
		int mitarbeitspunkte = 30;
		
		
		
		
		int gesamtsumme = pruefungspunkte + mitarbeitspunkte;
		
		if (pruefungspunkte > 35) {
			if (gesamtsumme > 0 && gesamtsumme <= 100) {
				if (gesamtsumme > 88) {
					System.out.println("Sehr gut");
				} else if (gesamtsumme > 78) {
					System.out.println("Gut");
				} else if (gesamtsumme > 68) {
					System.out.println("Befriedigend");
				} else if (gesamtsumme > 58) {
					System.out.println("Genügend");
				} else {
					System.out.println("Nicht bestanden");
				}
			} else {
				System.out.println("Eingabe hat keine korrekten Werte");
			} 
		}else {
			System.out.println("Prüfung war negativ");
		}
	}

}
