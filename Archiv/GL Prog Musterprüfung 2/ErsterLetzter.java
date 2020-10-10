package _glProg_MP_2;

public class ErsterLetzter 
{
	/*
	* Schreiben Sie ein Unterprogramm, an das ein String aus Kleinbuchstaben übergeben wird, welches die Buchstaben des Strings
	* betrachtet und die beiden Buchstaben als einen String liefert, die im Alphabet am weitesten vorne, resp. am weitesten hinten stehen.
Hat der String weniger als ein Zeichen oder enthält er andere Zeichen als Kleinbuchstabe, liefern Sie als Ergebnis null.
Beispiele:
String: “dgmbc“
Ergebnis: “bm“
weil ‘b‘ von den Buchstaben im String im Alphabet am weitesten vorne und ‘m‘ am weitesten hinten liegt.
“güssing“ liefert als Ergebnis null, weil ‘ü‘ kein Kleinbuchstabe ist.
Sonderfälle:
Wird ein String mit nur einem Buchstaben oder einer, der aus lauter gleichen Buchstaben besteht, übergeben,
* so ist dieser Buchstabe sowohl der vorderste als auch der hinterste im Alphabet – „C“ und „CCCCC“ sollen beide als Ergebnis „CC“ liefern.

	* */

	public static String ersterLetzer(String wort)
	{
		String ersterLetzer = "";
		char erster;
		char letzter;
		
		if (wort.length() < 1) 
		{
			return null;
		}

		erster = wort.charAt(0);
		letzter = wort.charAt(0);
		for (int i = 0; i < wort.length(); i++)
		{
			char zeichen = wort.charAt(i);
			if (! (('A' <= zeichen) && (zeichen <= 'Z')))
			{
				return null;
			}
			if (zeichen < erster)
			{
				erster = zeichen;
			}
			if (zeichen > letzter)
			{
				letzter = zeichen;
			}
		}
		ersterLetzer = "" + erster + letzter;
		
		return ersterLetzer;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(ersterLetzer("DGMBC"));		// BM
		System.out.println(ersterLetzer("C"));			// CC
		System.out.println(ersterLetzer("CCCCC"));		// CC
		System.out.println(ersterLetzer("ASD�"));		// null
	}

}
