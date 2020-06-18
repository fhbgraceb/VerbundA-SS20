package _glProg_2018_BB_HT;

import java.util.Scanner;

public class Dreieck 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int anzahl;
		String[][] dreieck;
		
		System.out.print("Wie groﬂ soll das Dreieck werden? ");
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
