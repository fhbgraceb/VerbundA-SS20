package BernalHausuebung3;

public class eObstkorb {
	/*
	Aufgabe 5) Obstkorb
	Sie besuchen einen Obstmarkt für Intellektuelle. Auf dem Verkaufsschild eines Händlers steht zu lesen:
	
	1 Apfel + 2 Bananen + 3 Gurken kosten 1400 cent
	2 Äpfel + 3 Bananen + 5 Gurken kosten 2300 cent
	5 Äpfel + 1 Banane + 1 Gurke kosten 1000 cent
	
	Erstellen Sie eine Anwendung, der Ihnen die Preise eines Apfels, einer Banane und einer Gurke errechnet.
	*/
	
	public static void main(String[] args) {
		for (int apfel = 1; apfel < 2300; apfel++) {
			for (int banane = 1; banane < 2300; banane++) {
				for (int gurke = 1; gurke < 2300; gurke++) {
					if ((1*apfel)+(2*banane)+(3*gurke)==1400 && (2*apfel)+(3*banane)+(5*gurke)==2300 && (5*apfel)+(1*banane)+(1*gurke)==1000) {
						System.out.println("Apfel: " + apfel + " cent\nBanane: " + banane + " cent\nGurke: " + gurke + " cent");
					}
				}
			}
		}
	}
}
