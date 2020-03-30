package BernalHausuebung1;

import java.util.Scanner;

/*
 Es wird ein Betrag eingegeben, und dann wird ermittelt was kommt unterm Strich raus = netto, 
 wie viel Steuerlast fällt generell an. Optional welche Steuerklassen wurde in Anspruch genommen 
 und wie viel Steuer fällt auf die jeweilige Steuerklasse ab. Zudem soll noch abgesichert werden, 
 dass nur mit gültigen Werten gerechnet wird. D.h. 0 und kleiner, > 5 Millionen sind nicht genehm, 
 und eine Berechnung findet nicht statt, anstatt eine Ausgabe das nur gültige Werte verwenden werden können. 
 */
//ohne array aber mit unterprogramm

public class Einkommenssteuer {
	public static void main(String[] args) {
			
			Scanner eingabe = new Scanner(System.in);
			double einkommen;
			double steuer;
			String kl = "klasse";
			
			System.out.print("Wie groß ist Ihr Einkommen im Monat ohne SV-Beitrag? ");
			einkommen = eingabe.nextDouble();
			steuer = steuerCalc(einkommen);
			kl = steuerCalcKl(einkommen);
			
			if (einkommen > 0 && einkommen < 5000000) {
				System.out.println("Ihr Monatseinkommen ohne SV-Beitrag beträgt " + einkommen + "€ somit sind Steuern in der Höhe von " + steuer + "€ fällig.");
				System.out.println("Lohnsteuer" + kl);
			}
			else {
				System.out.println("Nur gültige Werte können verwendet werden.");
			}
			
			
			eingabe.close();
	}

	public static double steuerCalc(double geld){
		double steuer = 0;
		
			if (geld <= 1066){
				steuer = 0;
			}
			else if (geld <= 1516){
				steuer = geld * 0.25;
			}		
			else if (geld <= 2599.33){
				steuer = geld * 0.35;
			}
			else if (geld <= 5016){
				steuer = geld * 0.42;
			}
			else if (geld <= 7516){
				steuer = geld * 0.48;
			}
			else if (geld <= 83349.33){
				steuer = geld * 0.50;
			}
			else{
				steuer = geld * 0.55;
			}
		
		return steuer; 
		}
	
	public static String steuerCalcKl(double geld){
		String klasse ="";
		
			if (geld <= 1066){
				klasse ="klasse 1 mit einem Grenzsteuersatz von 0%.";
			}
			else if (geld <= 1516){
				klasse ="klasse 2 mit einem Grenzsteuersatz von 25%.";
			}		
			else if (geld <= 2599.33){
				klasse ="klasse 3 mit einem Grenzsteuersatz von 35%.";
			}
			else if (geld <= 5016){
				klasse ="klasse 4 mit einem Grenzsteuersatz von 42%.";
			}
			else if (geld <= 7516){
				klasse ="klasse 5 mit einem Grenzsteuersatz von 48%.";
			}
			else if (geld <= 83349.33){
				klasse ="klasse 6 mit einem Grenzsteuersatz von 50%.";
			}
			else{
				klasse ="klasse 7 mit einem Grenzsteuersatz von 5%.";
			}
		
		return klasse; 
		}
}

