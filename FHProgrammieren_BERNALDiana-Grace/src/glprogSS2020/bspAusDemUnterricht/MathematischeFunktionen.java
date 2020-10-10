package bspAusDemUnterricht;

public class MathematischeFunktionen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d, r;
		int i, j, k;

/*
Division:
	Bei Ganzzahldivision wird abgerundet, damit der Wert in die Ganzzahl passt. 
	Sobald allerdings eine Fließkommazahl beteiligt ist, 
	wird automatisch alles in Fließkommazahlen umgewandelt. 
*/
		d = 5 / 3;
		System.out.println(d);
		d = 5 / 3.0;
		System.out.println(d);
		d = 5.0 / 3;
		System.out.println(d);

//Die Konstanten PI und E:
		System.out.println("PI: " + Math.PI);
		System.out.println("E: " + Math.E);

//Absolutbetrag:
		i = -100;
		j = Math.abs(i);
		System.out.println(j + " = Absolutbetrag von " + i);
		
//Runden:
//	Round() rundet auf die nächste Ganzzahl	
		d = 1.234;
		r = Math.round(d);
		System.out.println(r);
//	ceil() rundet auf die nächst höhere Ganzahl auf 	
		d = 1.234;
		r = Math.ceil(d);
		System.out.println(r);
//	floor() rundet auf die nächst niedrigere Ganzahl ab 	
		d = 1.234;
		r = Math.floor(d);
		System.out.println(r);
//	Runden auf 2 Nachkommastellen
		d = 1.234;
		r = Math.round(d*100)/100.0;
		System.out.println(r);

//kleinster (min) / größter (max) Wert
		i = 1;
		j = 2;
		k = Math.min(i, j);
		System.out.println(k);
		k = Math.max(i, j);
		System.out.println(k);

//Exponential- und logarithmische Funktionen:
//	exp(a): E hoch a
		d = Math.exp(1);
		System.out.println(d);
// log(a): natürlicher Logarithmus von a
		d = Math.log(2);
		System.out.println(d);
// pow(x,y): x hoch y
		d = Math.pow(3,2);
		System.out.println(d);

//Quadratwurzel
		d = Math.sqrt(9);
		System.out.println(d);

// x-te Wurzel
		d = Math.pow(27,1 / 3.0);
		System.out.println("Die dritte Wurzel aus 27 = " + d);

// modulo Funktion
		d = 6 % 4;
		System.out.println("Der Rest der Division 6 / 4 = " +  (int) d);
		
		
//Zufallszahlen
//	random() erstellt eine Zufallszahl zwischen 0.0 und 1.0
		
		d = Math.random();
		System.out.println(d);
		
//	ganzzahlige Zufallszahl zwischen einer Untergrenze und einer Obergrenze
//	(int)( Math.random() * (Obergrenze - Untergrenze +1) + Untergrenze)
//	(int) wandelt eine Double-Zahl in eine Integer-Zahl um
		i = (int)( Math.random() * (10 - 1 +1) + 1);
		System.out.println(i);

	}

}
