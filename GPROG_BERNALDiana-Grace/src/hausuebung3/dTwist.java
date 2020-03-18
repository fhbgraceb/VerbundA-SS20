package hausuebung3;

public class dTwist {
	/*
	Aufgebe 4) Twist
	Die erste Ziffer einer sechsstelligen Zahl wird an die letzte Stelle verschoben - 
	und plötzlich ist die Zahl dreimal so groß. Wissen Sie, um welche Zahl(en) es sich handelt? 
	Erstellen Sie dazu ein entsprechende Applikation welche dieses Rätsel löst! 
	Anmerkung: eine sechsstellige Zahl, ist eine Zahl, die aus 6 Ziffern besteht (wobei die erste Ziffer ungleich 0 ist).
	123456 → Erste Ziffer an letzte Stelle verschieben: 234561
	 */

	public static void main(String[] args) {
		int zahl1 =0;
		int zahl2=0;
		
		for (int z1 = 0; z1 <= 9; z1++) {
			for (int z2 = 0; z2 <= 9; z2++) {
				for (int z3 = 0; z3 <= 9; z3++) {
					for (int z4 = 0; z4 <= 9; z4++) {
						for (int z5 = 0; z5 <= 9; z5++) {
							for (int z6 = 0; z6 <= 9; z6++) {
								zahl1=z1*100000+z2*10000+z3*1000+z4*100+z5*10+z6*1;
								zahl2=z2*100000+z3*10000+z4*1000+z5*100+z6*10+z1*1;
								if (zahl1*3==zahl2 && zahl1!=0) {
									System.out.println("Zahl lautet: " + zahl1);
								}
							}
						}
					}
				}
			}
		}
	}
}
