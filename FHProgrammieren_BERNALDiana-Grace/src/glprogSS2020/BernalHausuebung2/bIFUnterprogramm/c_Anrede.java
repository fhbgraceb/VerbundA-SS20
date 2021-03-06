package BernalHausuebung2.bIFUnterprogramm;

import java.util.Scanner;

public class c_Anrede {
	/* 
	 Aufgabe:
	 3.Anrede: Sie �bergeben einer Methode(mit R�ckgabewert) Ihren Namen sowie das dazugeh�rige Geschlecht(Datentyp?), 
	 daraufhin werden Sie entsprechend begr��t.
	Die Antwort ist die Ausgabe der richtigen Begr��ung Herr X, Frau Y, zudem gilt - 
	sollte der Vorname gr��er als der Nachname sein, dann soll zus�tzlich hierf�r eine Anmerkung ausgegeben werden. 
	Des Weiteren sind nur �gute� Namen erlaubt, sowohl beim Vor- wie auch Nachnamen. 
	Gut ist definiert durch eine Zeichenanzahl von mindestens 3, sollte ein �kleinerer� Name eingegeben werden, 
	wird entsprechend eine Anmerkung ausgegeben.
	Insgesamt soll dreimal dieselbe Methode ausgerufen werden, um jeden Anwendungsfall zu skizzieren.
	(Anrede normal, Anrede mit Hinweis das VN gr��er NM, Ausgabe: Anredeerstellung nicht m�glich 
	weil VORNAME && || NACHNAME zu kurz.
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Bitte Geschlecht eingeben (w/m/d): ");
		String geschlecht=s.next();
		System.out.println("Bitte Vorname eingeben: ");
		String vorName=s.next();
		System.out.println("Bitte Nachname eingeben: ");
		String nachName=s.next();
		
		if (vorName.length()<=3 && nachName.length()<=3) {
			System.out.println("Anredeerstellung nicht m�glich");
		}else {
			System.out.println(anredeUeberpruefung(geschlecht, vorName, nachName) );
		}
		s.close();
	}
	
	public static String anredeUeberpruefung(String g, String v, String n) {
		String anmerkung="";
		String anrede="";
		if (g.equalsIgnoreCase("w")) {
			anrede="Frau ";
		}else if (g.equalsIgnoreCase("m")){
			anrede="Herr ";
		}else {
		}
		
		if (v.length()>n.length()) {
			anmerkung="...Vorname ist gr��er als Nachname";
		}
	
		
		return "Hallo " + anrede + v + n + anmerkung;
	}

}
