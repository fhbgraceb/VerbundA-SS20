package _glProh_2016_HT_VZ_GrA;

public class Vorkommen 
{

	/*
	Erstellen Sie zunächst einen String, der aus 555 zufällig gewählten Großbuchstaben besteht.
	Erstellen Sie danach einen zweiten String, der aus 11 zufällig gewählten Großbuchstaben besteht.
Implementieren Sie dann ein Unterprogramm, an das die beiden Strings übergeben werden, und als Ergebnis liefert,
wie oft die einzelnen Buchstaben des zweiten Strings im ersten String vorkommen.
Ein Beispiel (mit kürzeren Strings):
erster String: 	“ASDFRDRDT“
zweiter String: 	“RDR“
Ergebnis: 	7
Erklärung (zum Verständnis, muss nicht ausgegeben werden):
Das (erste) R kommt zweimal vor, das D kommt dreimal vor, das (zweite) R kommt zweimal vor – 2 + 3 + 2 = 7.
(D. h. Buchstaben, die im zweiten String öfters vorkommen, müssen auch öfters gezählt werden.)

	* */

	public static void main(String[] args) 
	{
		String string1 = "";
		String string2 = "";
		int laenge1 = 555;
		int laenge2 = 11;
		int anzahl;
		
		for (int i = 1; i <= laenge1; i++)
		{
			string1 += (char)(int)(Math.random() * ((int)'Z' - (int)'A' +  1) + (int)'A');
		}
		for (int i = 1; i <= laenge2; i++)
		{
			string2 += (char)(int)(Math.random() * ((int)'Z' - (int)'A' +  1) + (int)'A');
		}
		
		anzahl = vorkommen(string1, string2);
		
		System.out.println(anzahl);
	}
	
	public static int vorkommen(String suchString, String gesucht)
	{
		int anzahl = 0;
		
		for (int i = 0; i < gesucht.length(); i++)
		{
			for (int j = 0; j < suchString.length(); j++)
			{
				if (suchString.charAt(j) == gesucht.charAt(i))
				{
					anzahl++;
				}
			}
		}
		
		return anzahl;
	}
}
