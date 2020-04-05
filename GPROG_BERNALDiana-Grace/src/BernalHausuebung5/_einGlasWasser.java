package BernalHausuebung5;

import java.util.Scanner;

public class _einGlasWasser {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean drinking = true;
		double schluck;
		
		do {
			System.out.println("Vor Ihnen steht ein Glas Wasser. Was wollen Sie tun? \n (1) Schlucknehmen \n (2) auffüllen \n (3) aktueller Stand anzeigen \n (4) Beenden");
			int auswahl = s.nextInt();
			switch (auswahl) {
			case 1:
				System.out.println("Wieviel ml wollen Sie trinken?");
				schluck = s.nextDouble();
				drink(schluck);
				break;
			case 2:
				reFill();
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
		if (s <= filling) {
			filling -= s;
			wievielFluessigkeitIstNochImGlas();;
		} else {
			System.out.println("error...");
		}
	}//methode drink ende

	private static void reFill() {
		boolean inputError = false;
		do {
			System.out.println("Wieviel wollen sie nachfüllen in ml?");
			double mlreFill = s.nextDouble();
			System.out.println("Was wollen sie trinken?");
			String beverage = s.next().toLowerCase();
			if (beverage.equals("wasser")) {
				if ((mlreFill + filling) <= max) {
					filling = mlreFill + filling;
					wievielFluessigkeitIstNochImGlas();
					break;
				} else {
					inputError = true;
					System.out.println("Glas wär überfüll. \nSie können nur max. " + (max - filling) + "ml einfüllen!");	
				}
			} else {
				inputError = true;
				System.out.println("Ein anderes Getränk als Wasser wird nicht akzeptiert...");
			}
		} while (inputError);
	}//methode reFill ende

	private static void wievielFluessigkeitIstNochImGlas() {
		System.out.println("Es sind noch " + filling + "ml im glas");
	}//methode wievielFluessigkeitIstNochImGlas ende
}