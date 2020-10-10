package aufgabe01;

import java.text.DecimalFormat;

public class Casten {

	public static void main(String[] args) {

		// Die nachfolgende Kommazahl stellt den Rechnungsbetrag dar,
		// geben Sie diesen per Konsole aus. jedoch muss dieser vom Typ int sein
		// dennoch müssen die Nachkommastellen  ersichtlich sein, 2 Stellen genügen
		
//### Hallo, wollten Sie es wie meine Variante E gelöst haben ?	###
		
		//Variante A - manuel zwei int definieren - Bei dem Bsp schnell, aber nicht flexibel genug
		double kommazahl = 123.9564998455;
		int A = 123;
		int B = 96; // gerundet
		System.out.println("Variante A: (schnell aber manuel eingetragen)\nEine Kommazahl von Typ Integer= " + A + "," +B);
		
		//Variante B - aber nicht als int, sondern weiterhin kommazahl jedoch als double und gerundet auf 2 Stellen
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2); //auf 2 Stellen runden
		System.out.println("\nVariante B: (aber als double)\nVia DecimalFormat= "+df.format(kommazahl));

		//Variante C - via parse (int)
		int varA = (int) kommazahl; // Vordere Teil der anzuzeigenden Zahl
		double varB = (kommazahl - varA)*100; // Hinterer Teil der anzuzeigenden Zahl. Hier erhalte ich 0,9564... dann * 100 erhalte ich 95,64... 
		System.out.println("\nVariante C: (1ster Teil als int und 2ter teil als int geparst)\nEine Kommazahl von Typ Integer= " + varA + "," + (int)varB); // hier wird nun 95,64 zu 95 zugeschnitten

		//Variante D - nur abgeschnitten, ohne gerundet zu haben
		double zweiNachkommaStellen = (int) ((kommazahl * 100.0) % 100);
		System.out.println("\nVariante D: (ein wenig anders als Var.C)\nEine Kommazahl von Typ Integer= "+varA+","+(int)zweiNachkommaStellen);
	
		//Variante E - via zwei int Zahlen, abgewandelte Variante C
		int varX = (int) kommazahl;
		double varY = (kommazahl - varA)*100;
		int varZ = (int) varY;
		System.out.println("\nVariante E: (## War es so gewünscht? ##)\nEine Kommazahl von Typ Integer= "+varX+","+varZ); // Hier werden wirklich nur 2 int Zahlen ausgegeben

	}

}
