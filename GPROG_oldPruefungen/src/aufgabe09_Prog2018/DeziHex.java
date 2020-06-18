package aufgabe09_Prog2018;

/*
 * Dez2Hex: 
 * 
 * Schreiben Sie ein Unterprogramm dez2Hex(), 
 * welches eine Dezimalzahl (als Long) 
 * in eine Hexadezimalzahl (String) umwandelt.
 * (Siehe auch Beispiel Hex2Dez)
 * 
 * Beispiel:
 * 
 * 		41976 = "A3F8"
 */
public class DeziHex 
{
	/*
	 * Die Umwandlung erfolgt durch fortlaufendes Modulo-Rechnen.
	 * 
	 * Daraus ergeben sich die Stellen der Zahl von rechts nach links.
	 */
	public static String dez2Hex(long dezZahl)
	{
		String hexZahl = "";
		long restZahl = dezZahl;
		long rest;
		char ziffer;
		
		while (restZahl > 0)
		{
			rest = restZahl % 16;
			if (rest <= 9)
			{
				hexZahl = rest + hexZahl;
			}
			else
			{
				/*
				 *  Berechnung der Ziffern A bis F.
				 *  aus dem Rest 
				 *  	10 wird A
				 *  	11 wird B
				 *  		etc
				 *  Man muss also vom Rest 10 abziehen und das Ergebnis 
				 *  zu A "dazuzählen".
				 *  Die Hilfsvariable ziffer dient nur der
				 *  Kontrolle beim debuggen.
				 */ 
				ziffer = (char)((int)'A' + (rest - 10));
				hexZahl = ziffer + hexZahl;
			}
			restZahl = (restZahl - rest) / 16;
		}
		return hexZahl;
	}
	public static void main(String[] args) 
	{
		System.out.println(dez2Hex(41976));
	}

}
