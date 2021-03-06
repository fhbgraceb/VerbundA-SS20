package BernalHausuebung2.aSchleifen;

import java.util.Scanner;

public class l_PerfekteZahl {
	/*
	Aufgabe:
	12.PerfekteZahl: Eine Zahl hei�t perfekt, wenn die Summe ihrer echten Teiler 
	(das sind alle Teiler, die kleiner als die Zahl selbst sind) gleich gro� ist, wie die Zahl. 
	Zum Beispiel ist 6 eine perfekte Zahl, da 1, 2 und 3 die echten Teiler von 6 sind 
	und 1+2+3=6 gilt. 
	Falls die Summe der echten Teiler kleiner ist als die Zahl, 
	hei�t die Zahl defizient. 
	Falls die Summe der echten Teiler gr��er ist als die Zahl, 
	hei�t die Zahl abundant. 
	Schreiben Sie ein Programm, das eine nat�rliche Zahl einliest und ausgibt, 
	ob die eingelesene Zahl perfekt, defizient oder abundant ist.
	Eingabe		Ausgabe		Begr�ndung
	5			defizient	1 ist einziger echter Teiler
	6			perfekt		1+2+3=6
	12			abundant	1+2+3+4+6=16>12
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int teilerzahl;
		int zahl;
		String eigenschaft;
		
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		zahl = s.nextInt();
		
		teilerzahl = 0;
		for (int i = 1; i < zahl; i++){
			if (zahl % i == 0){
				teilerzahl += i;
			}
		}

		if (teilerzahl < zahl){
			eigenschaft = "defizient, die Summe der echten Teiler ist kleiner als die Zahl";
		} else if (teilerzahl > zahl){
			eigenschaft = "abundant, die Summe der echten Teiler gr��er ist als die Zahl";
		}
		else{
			eigenschaft = "perfekt, die Summe der echten Teiler ist genau die Zahl";
		}
		
		System.out.println("Die Zahl " + zahl + " ist " + eigenschaft);
		s.close();
	}

}
