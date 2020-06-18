package _glProg_2016_NT2_GrA;

public class RegelTest 
{

	/*
	* Erstellen Sie ein Unterprogramm regelKonform, an das ein String übergeben wird, und das überprüft,
	* ob der String den folgenden Regeln genügt:
1.	Der String darf nur aus „echten“ Buchstaben von ‘A‘ bis ‘Z‘ resp. ‘a‘ bis ‘z‘ bestehen.
2.	Er muss aus mindesten 5 Buchstaben bestehen.
3.	Das erste Zeichen muss ein Kleinbuchstabe sein.
4.	Es dürfen keine Großbuchstaben direkt aufeinander folgen
Bespiele für regelkonforme Strings: “autoBus“,  “druckerTreiber“, “milchkuh“, „aBcDeFgH“
Beispiele für nicht regelkonforme Strings:
•	“java“ – zu kurz
•	“JavaKurs“ – Großbuchstabe am Anfang
•	“jaVa ist suPer!“ –enthält andere Zeichen
•	“miTTelWert“ –zwei Großbuchstaben folgen direkt aufeinander
•	“sonderMüll“ – enthält (einen)  „unechte(n)“ Buchstaben

	* */

	public static void main(String[] args) 
	{
		System.out.println(regelKonform("autoBus"));
		System.out.println(regelKonform("druckerTreiber"));
		System.out.println(regelKonform("milchkuh"));
		System.out.println(regelKonform("aBcDeFgH"));
		System.out.println(regelKonform("java"));
		System.out.println(regelKonform("JavaKurs"));
		System.out.println(regelKonform("jaVa ist suPer!"));
		System.out.println(regelKonform("miTTelWert"));
		System.out.println(regelKonform("sonderM�ll"));
	}
	
	public static boolean regelKonform(String string)
	{
		boolean ok = true;
		char c;
		boolean isUpperCase;	// Merkt sich, ob der letzte Buchstabe GROSS war
		
		if (! (string.length() >= 5))
		{
			ok = false;
		}
		else
		{
			isUpperCase = false;
			for (int i = 0; i < string.length(); i++)
			{
				c = string.charAt(i);
				if ((i == 0) && (Character.isUpperCase(c)))
				{
					ok = false;
				}
				if (! (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))))
				{
					ok = false;
				}
				if (Character.isUpperCase(c))	// Ist der Buchstabe GROSS?
				{
					if (isUpperCase)			// Letzter Buchstabe war auch GROSS?
					{
						ok = false;
					}
					isUpperCase = true;
				}
				else
				{
					isUpperCase = false;
				}
			}
		}
		
		return ok;
	}
}
