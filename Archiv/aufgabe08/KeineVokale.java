package aufgabe08;

import java.util.Scanner;

/*
 * keineVokale: 
 * 
 * Lesen Sie einen String aus Buchstaben 
 * (Sie können bei Ihrem Programm davon ausgehen, 
 *        dass die Eingabe nur Buchstaben enthält) 
 * ein und geben Sie eine Kopie des Strings aus,
 * bei der alle Vokale entfernt wurden.
 * 
 * Beispiel:
 * 		Eingabe: „AbCdeFG“
 * 		Ausgabe: „bCdFG“
 * 
 * Lösung:
 * 
 * Hier werden verschiedene Varianten gezeigt.
 * 
 * Die Grundstruktur ist jeweils dieselbe:
 * 
 * Der Text wird Zeichen für Zeichen durchgegangen 
 * und jedes Zeichen einzeln untersucht. 
 *
 * Wenn es sich um keinen Vokal (A, E, I, O, U) handelt
 * wird das Zeichen an den AusgabeString angehängt.
 * Ist es ein Vokal, so "wirft man das Zeichen weg".
 * 
 * Um die Tests zu vereinfachen wird mit einer Kopie des Strings
 * gearbeitet, bei dem alles in Großbuchstaben umgewandelt wurde.
 * 
 * Für den Test, ob etwas ein Vokal ist, gibt es mehrere Varianten.
 */
public class KeineVokale 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String eingabe;
		String eingabeUC;
		String ausgabe1;		// Für jede der Testmethoden
		String ausgabe2;		// gibt es eine eigene Variable
		char zeichen;
		String zeichenString;	// Für die 2. Variante ist es besser
								// das Zeichen als String zu haben

		System.out.print("Bitte einen String eingeben: ");
		eingabe = s.next();
		eingabeUC = eingabe.toUpperCase();
		
		ausgabe1 = "";
		ausgabe2 = "";
		
		for (int i = 0; i < eingabe.length(); i++)
		{
			zeichen = eingabeUC.charAt(i);
			zeichenString = eingabeUC.substring(i, i + 1);
			
			/*
			 * Bei der ersten Methode vergleicht man das Zeichen
			 * mit allen Vokalen. Wenn es mit keinem übereinstimmt
			 * so darf es zur Ausgabe dazukommen.
			 * Nachdem man die Zeichen in Großbuchstaben umgewandelt hat,
			 * braucht man nur mehr mit Großbuchstaben vergleichen.
			 */
			if ((zeichen != 'A') && (zeichen != 'E') && (zeichen != 'I') &&
				(zeichen != 'O') && (zeichen != 'U'))
			{
				/*
				 *  Zur Ausgabe muss man aber das "Originalzeichen"
				 *  (also mit Groß- und Kleinschreiben) dazugeben.
				 */
				ausgabe1 += eingabe.charAt(i);
			}
			
			/* 
			 * In der der zweiten Variante sieht man nach,
			 * Ob das Zeichen in einem String enthalten ist,
			 * der nur aus Vokalen besteht.
			 * Nur wenn es bei den Vokalen nicht vorkommt,
			 * darf es zur Ausgabe dazu.
			 * 
			 * Wieder muss man sich das Zeichen aus dem "Originalstring" holen.
			 */
			if (! "AEIOU".contains(zeichenString))
			{
				ausgabe2 += eingabe.charAt(i);
			}
		}
		
		System.out.println("Ergebnis von Methode 1: " + ausgabe1);
		System.out.println("Ergebnis von Methode 2: " + ausgabe2);
	}

}
