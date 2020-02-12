package aufgabe08;

/*
 * ZufallsString2: 
 * 
 * Erzeugen Sie einen String, 
 * der aus 10 zufällig gewählten Kleinbuchstaben besteht, 
 * von denen keiner doppelt vorkommen darf.
 * 
 * Lösung:
 * 
 * Siehe auch Beispiel ZufallsString.
 * 
 * Da kein Buchstabe doppelt vorkommen darf,
 * muss vor dem Zusammenhängen geprüft werden (contains())
 * ob der Buchstabe schon im String vorkommt.
 * 
 * Da man nun nicht mehr weiss, wie viele Buchstaben man
 * erzeugen muss, bis man 10 verschiedene hat, ist es besser eine
 * while-Schleife zu verwenden.
 */
public class ZufallsString2 
{

	public static void main(String[] args) 
	{
		String ausgabe;
		char buchstabe;
		String buchstabeAlsString;
		int code;
		
		ausgabe = "";
		
		do
		{
			code = (int)(Math.random() * ((int)'z' - (int)'a' + 1) + (int)'a');
			buchstabe = (char)code;
			/*
			 * Da contains() nur für Strings funktioniert
			 * muss der Character in einen String umgewandelt werden.
			 * 
			 * Mit dem folgenden Trick kann man alles (also auch Zahlen)
			 * in einen String verwandeln. Man nimmt einfach einen 
			 * "Leerstring" (einen String ohne Zeichen) und hängt an diesen
			 * den Buchstaben an.
			 */
			buchstabeAlsString = "" + buchstabe;
			// Zwischenausgaben zur Kontrolle:
//			System.out.println(ausgabe + " : " + buchstabeAlsString);
			if (! ausgabe.contains(buchstabeAlsString))
			{
				ausgabe += buchstabe;
			}
		} while (ausgabe.length() < 10);
		
		System.out.println("Der ZufallsString lautet: " + ausgabe);

	}

}
