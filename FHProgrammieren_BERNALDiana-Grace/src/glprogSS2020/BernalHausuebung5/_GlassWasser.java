package BernalHausuebung5;

import java.util.Scanner;

public class _GlassWasser {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean drinking = true;
		double schluck;
		
		do {
			System.out.println("Vor Ihnen steht ein Glas Wasser."); wievielFluessigkeitIstNochImGlas();
			System.out.println("-------------------------------------------\nWas wollen Sie tun? \n (1) Schlucknehmen \n (2) auffüllen \n (3) aktueller Stand anzeigen \n (4) Beenden");
			int auswahl = s.nextInt();
			switch (auswahl) {
			case 1:
				System.out.println("Wieviel ml wollen Sie trinken?");
				schluck = s.nextDouble();
				drink(schluck);
				break;
			case 2:
				if (filling < max) {
					reFill();
				}else {
					System.out.println("Glas ist noch voll!!!\n");
				}
				break;
			case 3:
				wievielFluessigkeitIstNochImGlas();
				break;
			case 4:
				System.out.println("Auf Wiedersehen...");
				drinking = false;
				break;
			default:
				System.out.println("Bitte geben Sie eine gültige Option ein...");
				break;
			}
		} while (drinking);
	}//main-ende
	
	private static double filling = 250;
	private static final int max = 250;

	private static void drink(double s) {
		if (s <= filling && s > 0) {
			filling -= s;
		} else {
			System.out.println("Das geht nicht...");
		}
	}//methode drink ende

	private static void reFill() {
		boolean inputError = false;
		do {
			System.out.println("Wieviel wollen sie nachfüllen in ml?");
			double mlreFill = s.nextDouble();
			System.out.println("Trinken Sie Wasser, Ottackringer, etc. ?");
			String beverage = s.next().toLowerCase();
			if (beverage.equals("wasser")) {
				if ((mlreFill + filling) <= max && mlreFill > 0) {
					filling = mlreFill + filling;
					break;
				} else {
					inputError = true;
					System.out.println("Glas wär überfüllt oder nicht Eingabe nicht möglich. \nSie können nur max. " + (max - filling) + "ml einfüllen!");	
				}
			} else {
				inputError = true;
				System.out.println("Ein anderes Getränk als Wasser wird nicht akzeptiert...");
			}
		} while (inputError);
	}//methode reFill ende

	private static void wievielFluessigkeitIstNochImGlas() {
		System.out.println("Es sind noch " + filling + "ml im glas.");
		Volumen();
	}//methode wievielFluessigkeitIstNochImGlas ende
	
	private static void Volumen() {
		//eigentlich ist ml=cm³ aber hier trotzdem eine berechnung
		double r = 2.821;
		double h = 10;
		//System.out.println(r + "\t" + h);
		double vollVolumen = (Math.PI*Math.pow(r, 2)* h);
		//System.out.printf("Volumenberechnung: %9.2f\n", vollVolumen);
		double berechnung = vollVolumen - ( vollVolumen - filling );
		System.out.printf("Das Volumen der aktuellen Menge ist%9.2f cm³.\n", berechnung);	
	}//methode Volumen ende
}