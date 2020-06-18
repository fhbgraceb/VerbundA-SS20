package _glProg_2016_NT2_GrA;

public class Buchstaben 
{

	public static void main(String[] args) 
	{
		System.out.println(buchstaben(3, 4));
		System.out.println(buchstaben(5, 7));
	}

	public static int buchstaben(int zeilen, int spalten)
	{
		int summe = 0;
		char[][] buchstaben = new char[zeilen][spalten];
		int anzahl;
		int maximum;
		int besteZeile;
		
		// Im folgenden wird das Array befüllt und auch gleich ausgegeben.
		for (int zeile = 0; zeile < buchstaben.length; zeile++)
		{
			for (int spalte = 0; spalte < buchstaben[zeile].length; spalte++)
			{
				buchstaben[zeile][spalte] = (char)(int)(Math.random() * ((int)'Z' - (int)'A' + 1) + (int)'A');
				System.out.print(buchstaben[zeile][spalte]);
				if (spalte < buchstaben[zeile].length - 1)
				{
					System.out.print(", ");
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
		// Nun wird für jeden Buchstaben nachgesehen, in welcher Zeile er am häufigsten vorkommt.
		for (char c = 'A'; c <= 'Z'; c++)
		{
			maximum = 0;
			besteZeile = -1;
			for (int zeile = 0; zeile < buchstaben.length; zeile++)
			{
				anzahl = 0;
				for (int spalte = 0; spalte < buchstaben[zeile].length; spalte++)
				{
					if (buchstaben[zeile][spalte] == c)
					{
						anzahl++;
					}
				}
				if (anzahl > maximum)
				{
					maximum = anzahl;
					besteZeile = zeile;
				}
			}
			summe += besteZeile;
			System.out.println(c + " : " + summe);
		}
		
		return summe;
	}
}
