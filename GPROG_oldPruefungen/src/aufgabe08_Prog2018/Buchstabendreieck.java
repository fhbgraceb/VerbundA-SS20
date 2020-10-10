package aufgabe08_Prog2018;

import java.util.Scanner;

/*
 * Buchstabendreieck: 
 * 
 * Lesen Sie einen Großbuchstaben ein und geben Sie ein
 * "Buchstabendreieck" bis zu diesem Buchstaben aus.
 * 
 * Beispiele:
 * 
 * Eingabe: "C"
 * Ausgabe:
 * A
 * ABA
 * ABCBA
 * 
 * Eingabe: "E"
 * Ausgabe:
 * A
 * ABA
 * ABCBA
 * ABCDCBA
 * ABCDEDCBA
 * 
 * Zur Lösung:
 * 
 * Man muss in jeder Zeile den mittleren Buchstaben betrachten:
 * Diese sind alphabetisch aufsteigend sortiert.
 * Davor sind die Buchstaben in der Zeile auch alphabetisch aufsteigend sortiert,
 * danach absteigend.
 * 
 * Daraus ergeben sich verschachtelte Schleifen:
 * Eine für den mittleren Buchstaben
 * 	In dieser zwei weitere:
 * 		eine um die aufsteigenden Buchstaben auszugeben
 * 		eine um die absteigenden auszugeben
 * Man muss nur darauf achten 
 * 		den mittleren Buchstaben nicht doppelt auszugeben
 * In den Schlefen macht man sich jeweils den ASCII-Code der Buchstaben zunutze.
 * 
 * Experimentierfreudige werden feststellen, dass man mit char-Variablen "rechnen" kann.
 * z.B.:
 * char x = 'A';
 * x++;		// Erhöht den Wert von x, nachher ist er 'B'
 * 
 */
public class Buchstabendreieck 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		char buchstabe;

		/*
		 * Die folgende Schleife war nicht verlangt, dient aber 
		 * zur Sicherstellung, dass ein Großbuchstabe eingegeben wurde.
		 */
		do
		{
			System.out.print("Bitte den Buchstaben eingeben: ");
			buchstabe  = s.next().charAt(0);	// Ersten Buchstaben als Zeichen holen
		} while (! ((buchstabe >= 'A') && (buchstabe <= 'Z')));

		for (int i = (int)'A'; i <= (int)buchstabe; i++)
		{
			for (int j = (int)'A'; j < i; j++)
			{
				System.out.print((char)j);
			}
			
			for (int j = i; j >= 'A'; j--)
			{
				System.out.print((char)j);
			}
			
			System.out.println();
		}

		System.out.println("--------------------------------");
		/*
		 * Variante
		 * In dieser wird die Tatsache ausgenutzt, dass Zeichen intern als
		 * deren (ASCII)-Codes gespeichert werden und mit diesen rechnen kann.
		 */
		for (char mittlererBuchstabe = 'A'; mittlererBuchstabe <= buchstabe; mittlererBuchstabe++)
		{
			for (char ausgabeBuchstabe = 'A'; ausgabeBuchstabe < mittlererBuchstabe; ausgabeBuchstabe++)
			{
				System.out.print(ausgabeBuchstabe);
			}
			
			for (char ausgabeBuchstabe = mittlererBuchstabe; ausgabeBuchstabe >= 'A'; ausgabeBuchstabe--)
			{
				System.out.print(ausgabeBuchstabe);
			}
			
			System.out.println();	// Zeilenumbruch
		}
		
	}

}
