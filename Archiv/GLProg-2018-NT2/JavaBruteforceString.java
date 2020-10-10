package _glProg_2018_nt2_WORK;

public class Java
{
	/*
	Erstellen Sie ein Array und speichern Sie in diesem die Zeichen 'A', 'E', 'J', 'V' und 'Z'.
Wählen Sie nun 100000 Mal zufällig 4 Buchstaben aus diesem Array aus und bilden Sie mit diesen ein Wort.
Dabei darf derselbe Buchstabe auch öfters in dem Wort vorkommen.
Stellen Sie fest, wie oft dabei das Wort “JAVA“ gebildet wird und geben Sie diese Anzahl aus.
Die Überprüfung, ob das Wort “Java“ gebildet wurde oder nicht, muss in einem Unterprogramm erfolgen.

	* */

	public static void main(String[] args) 
	{
		final int versuche = 100000;
		final int anzahl = 4;
		char[] buchstaben = new char[] {'A', 'E', 'J', 'V', 'Z'};
		String wort;
		int zufall;
		int treffer;
		
		treffer = 0;
		for (int versuch = 1; versuch <= versuche; versuch++)
		{
			wort = "";
			for (int i = 1; i <= anzahl; i++)
			{
				zufall = (int)(Math.random() * ((buchstaben.length - 1) - 0 + 1) + 0);
				wort += buchstaben[zufall];
				if (wortCheck(wort))
				{
					treffer++;
				}
			}
		}
		System.out.println("So oft wurde \"JAVA\" erzeugt: " + treffer);
	}
	
	public static boolean wortCheck(String wort)
	{
		final String testWort = "JAVA";
		return testWort.equals(wort);
	}

}
