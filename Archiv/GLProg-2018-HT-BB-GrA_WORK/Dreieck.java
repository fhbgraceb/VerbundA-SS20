package _glProg_2018_BB_HT_WORK;

import java.util.Scanner;

public class Dreieck 
{

	/*
	* Lesen Sie eine Zahl n ein und erstellen Sie dann ein dreieckiges Array, das in der ersten Zeile ein Element,
	* in der zweiten Zeile zwei Elemente, … und in der n-ten Zeile n Elemente enthält.
Tragen Sie dann in jedes Element der ersten Zeile ein Wort bestehend aus einem zufällig gewählten Kleinbuchstaben,
* in jedes Element der zweiten Zeile ein Wort bestehend aus zwei zufälligen Kleinbuchstaben, …
* in jedes Element der n-ten Zeile ein Wort bestehend aus n zufällig gewählten Kleinbuchstaben ein.
Geben Sie dann alle Elemente des Arrays aus.
Die Erzeugung der einzelnen Worte muss in einem Unterprogramm geschehen.
Bei der Eingabe der Zahl 5 könnte die Ausgabe so aussehen:
g
ys ti
nac xnq umg
azmu zjxx bdzs uiba
vrhid zgkas okpyj tmlpm ycgfl

	* */

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int anzahl;
		String[][] dreieck;
		
		System.out.print("Wie gro� soll das Dreieck werden? ");
		anzahl = s.nextInt();
		
		dreieck= new String[anzahl][];
		
		for (int i = 0; i < dreieck.length; i++)
		{
			dreieck[i] = new String[i + 1];
		}
		
		for (int i = 0; i < dreieck.length; i++)
		{
			for (int j = 0; j < dreieck[i].length; j++)
			{
				dreieck[i][j] = zufallsString(i + 1);
			}
		}

		for (int i = 0; i < dreieck.length; i++)
		{
			for (int j = 0; j < dreieck[i].length; j++)
			{
				System.out.print(dreieck[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static String zufallsString(int anzahl)
	{
		String tmp = "";
		for (int k = 1; k <= anzahl; k++)
		{
			tmp += (char)((int)(Math.random() * ((int)'z' - (int)'a' + 1) + (int)'a'));
		}
		return tmp;
	}

}
