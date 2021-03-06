package BernalHausuebung2.bIFUnterprogramm;

import java.util.Scanner;

public class b_Dreieck {
	/*
	 Aufgabe:
	 2.Dreieck: Es werden 3 Zahlenwerte �bergeben, entweder direkt (erstzahl = 5) oder via Scanner, 
	 und als Resultat erfahren Sie via Konsole ob es sich hierbei um (k)ein (gleichschenkliges) Dreieck handelt. 
	 Bevor auf �Gleichschenkligkeit� gepr�ft wird, sowohl vorab �berpr�ft werden, 
	 ob es sich �berhaupt um ein Dreieck handelt, sollte dies nicht der Fall sein, 
	 soll die Folge�berpr�fung nicht stattfinden(Performance) und der entsprechende Status ausgegeben werden 
	 z.B.: Es handelt sich um ein: kein Dreieck, ein Dreieck aber kein Gleichschenkeliges, ein gleichschenkeliges Dreieck .
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Bitte l�nge von der der Seite a eingeben: ");
		double a=s.nextDouble();
		System.out.println("Bitte l�nge von der der Seite b eingeben: ");
		double b=s.nextDouble();
		System.out.println("Bitte l�nge von der der Seite c eingeben: ");
		double c=s.nextDouble();
		
		System.out.println("Die eingegebenen l�ngen ergeben" + istDreieck(a,b,c));
		s.close();
	}
	
	public static String istDreieck(double k, double l, double m) {
		String eigenschaft;
		if((k + l > m) && (k + m > l) && (l + m > k) && (k > 0) && (l > 0) && (m > 0)) {
			if ((k==l)||(l==m)||(k==m) ) {
				eigenschaft=" ein gleichschenkeliges Dreieck.";
			}else {
				eigenschaft=" ein Dreieck aber kein gleichschenkeliges Dreieck.";
			}
		}else {
			eigenschaft=" kein Dreieck.";
		}
		return eigenschaft;
	}

}
