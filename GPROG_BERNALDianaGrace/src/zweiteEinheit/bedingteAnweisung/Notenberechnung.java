package zweiteEinheit.bedingteAnweisung;

public class Notenberechnung {	
	
	public static void main(String[] args) {
		int pruefungspunkte = 50;
		int mitarbeitspunkte = 30;
		
		if (pruefungspunkte > 35) {
			int gesamtsumme = pruefungspunkte + mitarbeitspunkte;
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
					System.out.println("YOU ARE A FAILURE!!!");
				}
			} else {
				System.out.println("Keine gültige Eingabe...");
			} 
		}else {
			System.out.println("Prüfung war negativ!");
		}

	}
}
