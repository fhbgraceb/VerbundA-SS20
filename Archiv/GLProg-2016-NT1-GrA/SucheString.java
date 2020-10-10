package _glProg_2016_NT1_A;

public class SucheString 
{

	/*
	* Erstellen Sie ein Unterprogramm „sucheString“, an das beliebig viele Strings übergeben werden.
	* Geben Sie jenen String zurück, der aus den meisten Vokalen (A, E, I, O, U, a, e, i, o, u) besteht,
	* aber keine Ziffern beinhaltet. Kommen mehrere Strings in Frage, können Sie einen beliebigen String zurückliefern.
	* Die Groß- und Kleinschreibung soll dabei ignoriert werden.

Beispiel:
Übergabe: 	“Hallo123“, “Das ist ein Test“, “JUHUUUUU“, “88=Achtundachtzig“
Rückgabe: 	“JUHUUUUU“
Begründung: 	“Hallo123“ 		 enthält auch aus Ziffern
 		“Das ist ein Test“ 	 5 Vokale
 		“JUHUUUUU“ 		 6 Vokale
 		“88=Achtundachtzig“ 	 enthält auch auf Ziffern

	* */

	public static void main(String[] args) 
	{
		System.out.println(sucheString(new String[]{"Hallo123", "Das ist ein Test", "JUHUUUUU", "88=Achtundachtzig"}));

	}

	public static String sucheString(String[] strings) 
	{
		String ergebnis = null;
		final String selbstlaute = "AEIOUaeiou";
		String string;
		int anzahlSelbstlaute;
		int maxSelbstlaute;
		boolean enthaeltZiffer;
		char zeichen;
		
		maxSelbstlaute = 0;
		for (int i = 0; i < strings.length; i++) 
		{
			string = strings[i];
			anzahlSelbstlaute = 0;
			enthaeltZiffer = false;
			for (int j = 0; j < string.length(); j++) 
			{
				zeichen = string.charAt(j);
				if (Character.isDigit(zeichen)) 
				{
					enthaeltZiffer = true;
				}
				if (selbstlaute.contains("" + zeichen))
				{
					anzahlSelbstlaute++;
				}
			}
			if (! enthaeltZiffer) 
			{
				if (anzahlSelbstlaute > maxSelbstlaute) 
				{
					maxSelbstlaute = anzahlSelbstlaute;
					ergebnis = string;
				}
			}
		}
		return ergebnis;
	}
}
