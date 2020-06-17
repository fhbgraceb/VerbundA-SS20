package _glProg_2016_HT_BB_GrA;

public class NurBuchstaben 
{
	/*
	Erstellen Sie ein Unterprogramm nurBuchstaben, an das beliebig viele Strings übergeben werden können und
	das als Ergebnis liefert, wie viele der Strings nur „echte“ Buchstaben von ‘A‘ bis ‘Z‘ resp. ‘a‘ bis ‘z‘ enthalten.
Beipiel:
Eingabe: 	"Wort", "Küche", "C3-PO", "Bond, James Bond", "Java", "Das Boot"
Ausgabe:	2

	* */
	public static void main(String[] args) 
	{
		System.out.println(nurBuchstaben(new String[]{"Wort", "K�che", "C3-PO", "Bond, James Bond", "Java", "Das Boot"}));
	}

	public static int nurBuchstaben(String[] worte)
	{
		int anzahl = 0;
		String wort;
		boolean ok;
		char zeichen;
		
		for (int i = 0; i < worte.length; i++)
		{
			wort = worte[i];
			ok = true;
			for (int j = 0; j < wort.length(); j++)
			{
				zeichen = wort.charAt(j);
				if (! (((zeichen >= 'A') && (zeichen <= 'Z')) || ((zeichen >= 'a') && (zeichen <= 'z'))))
				{
					ok = false;
				}
			}
			if (ok)
			{
				anzahl++;
			}
		}
		return anzahl;
	}
	
}
