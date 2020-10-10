package aufgabe09;

/*
 * Hex2Dez: 
 * 
 * Schreiben Sie ein Unterprogramm hex2Dez(),
 * das eine Zahl im Hexedezimalsystem (als String) 
 * in eine ganze Zahl (als Long) umwandelt.
 * 
 * Im Hexadezimalsystem gibt es insgesamt 16 Ziffern:
 * 
 *      0, 1, ... 8, 9, A, B, C, D, E, F
 *      
 * wobei A den Wert 10, B den Wert 11, ... und F den Wert 15 hat. 
 * 
 * Von rechts gelesen muss 
 * 		der Wert der ersten Stelle noch mit 1 (16^0), 
 * 		der Wert die zweitrechtesten mit 16^1, 
 * 		der drittrechtesten mit 16^2, 
 * 		etc 
 * multipliziert werden, um auf den Wert einer Zahl zu kommen.
 * 
 * Beispiel:
 * 
 * Die Hexadezimale Zahl:
 * 
 * 		A3F8
 * 
 * hat im Dezimalsystem den Wert:
 * 
 * 	10 * 16^3 + 3 * 16^2 + 15 * 16^1 + 8 * 16^0 = 41976
 * 
 */
public class HexaDez {

	/*
	 * Es wird das Hornerschema verwendet.
	 * 
	 * d.h. die Zahl wird von vorne nach hinten bearbeitet.
	 * In jedem Durchgang wird mit 16 multipliziert.
	 */
	public static long hex2Dez(String hexZahl)
	{
		long dezZahl = 0;
		char hexZiffer;
		int dezWert;
		
		for (int i = 0; i < hexZahl.length(); i++)
		{
			hexZiffer = hexZahl.charAt(i);
			if (Character.isDigit(hexZiffer))
			{
				dezWert = (int)hexZiffer - (int)'0';
			}
			else
			{
				dezWert = (int)hexZiffer - (int)'A' + 10;
			}
			dezZahl = dezZahl * 16 + dezWert;
		}
		
		return dezZahl;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(hex2Dez("A3F8"));
	}

}
