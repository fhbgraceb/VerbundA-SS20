package _glProg_MP_1;

/*
 * Worte   
 * 
 * Implementieren Sie ein Unterprogramm, an das ein Array von Strings
 *  – die Worte, bestehend nur aus Buchstaben - übergeben wird.
 *  
 * Das Unterprogramm liefert einen String als Ergebnis, 
 * in dem alle Strings des Arrays, durch Leerzeichen getrennt, 
 * zusammengefasst sind. 
 * Allerdings wurden die Buchstaben jedes Wortes so umgeordnet, 
 * dass zuerst die Vokale und danach die Konsonanten aufscheinen.
 * 
 * Beispiel:
 * 
 * Eingabe: „Das“, „ist“, „kein“, „langer“, „Satz“
 * Ausgabe: „aDs ist eikn aelngr aStz“
 * 
 */
public class VokaleVor 
{

	/*
	 * Grundidee: 
	 * Die Worte einzeln durchgehen
	 *    in jedem Wort die Buchstaben in Vokale und Konsonanten aufteilen
	 *    und die Teile dann wieder zusammen zu setzen.
	 */
	public static String sortieren(String[] worte)
	{
		String ergebnis = "";
		String wort;
		String vokale;
		String konsonanten;
		char buchstabe;
		char buchstabeGross;
		
		// Alle Worte durchgehen
		for (int i = 0; i < worte.length; i++)
		{
			wort = worte[i];
			vokale = "";
			konsonanten = "";
			// Die Buchstaben des Wortes durchgehen
			for (int j = 0; j < wort.length(); j++)
			{
				// Buchstaben holen
				buchstabe = wort.charAt(j);
				// Buchstaben in Grossbuchtaben umwandeln um die Überprüfung zu erleichtern
				buchstabeGross = Character.toUpperCase(buchstabe);
				
				// Ist der Buchstabe ein Vokal? - Geht auch mit	if ("AEIOU".contains(String.valueOf(buchstabeGross))) // kommt der Buchstabe - in einen String umgewandelt - im String "AEIOU" vor?
				if ((buchstabeGross == 'A') || 
					(buchstabeGross == 'E') || 
					(buchstabeGross == 'I') || 
					(buchstabeGross == 'O') || 
					(buchstabeGross == 'U'))
				{
					// Wenn ja: zu den Vokalen dazu
					vokale += buchstabe;
				}
				else
				{
					// Wenn nein: zu den Konsonanten dazu
					konsonanten += buchstabe;
				}
			}
			// VOR dem ersten Wort kommt KEIN Leerzeichen in das Ergebnis
			if (i > 0)
			{
				ergebnis += ' ';
			}
			// Zum Ergebnis kommen erst die Vokale, dann die Konsonanten
			ergebnis += vokale + konsonanten;
		}
		
		return ergebnis;
	}
	
	public static void main(String[] args) 
	{
		String[] eingabe = new String[]{"Das", "ist", "kein", "langer", "Satz"};
		
		System.out.println(sortieren(eingabe));
		
		System.out.println(sortieren(new String[]{"VokaleVor"}));
	}

}
